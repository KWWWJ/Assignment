package Script;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DuplicateKeyException;

import Script.factory.DAOFactory;
import Script.script.ScriptBean;
import Script.script.ScriptDAO;
import Script.script.ScriptInterface;


public class TestList {
	private ScriptInterface user1 = new ScriptBean();
	private ApplicationContext context = new AnnotationConfigApplicationContext(DAOFactory.class);
	private ScriptDAO dao = context.getBean("scriptDAO", ScriptDAO.class); // 얘 기능 나눠서 그때그떄 생성해도 상관 없다.
																				 // 일할떄는 두가지로 나눠 테스트용과 배포용을 만들어 배포에는 테이블 삭제 및 생성 기능을 제외한다.
	@Before
	public void initialize() {

		try {

			dao.create();
			System.out.println("script 테이블 생성 성공");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

		user1.setName("intro");
		user1.setScript("루시는 포근한 하얀 고양이 입니다.");
		dao.add(user1);

	}
	
	@After
	public void dropTable() {

		dao.upgradeDrop();
		System.out.println("script 테이블 삭제 성공");

	}

	@Test
	public void add() {

		ScriptBean user = new ScriptBean();
		user.setName("intro");
		user.setScript("루시는 빨간 소파에 몸을 푸욱 뉘었습니다..");
		dao.add(user);
		System.out.println("추가 성공 addAndGet");

	}

	@Test
	public void get() {

		ScriptInterface createdUser = dao.get(user1.getId());
		assertThat(createdUser.getName(), is(user1.getName()));
		assertThat(createdUser.getScript(), is(user1.getScript()));
		

	}

	@Test
	public void dropAndCreate() {

		ScriptBean user = new ScriptBean();
		user.setName("intro");
		user.setScript("몸이 노곤하게 가라앉는 느낌에 루시는 어쩔 수 없이 무거운 눈꺼풀을 닫았습니다.");
		dao.add(user);
		System.out.println("추가 성공 addAndGet");

		ScriptInterface createdUser = dao.get(user.getId());
		assertThat(createdUser.getName(), is(user.getName()));
		assertThat(createdUser.getScript(), is(user.getScript()));
	

	}
	
	@Test(expected=DuplicateKeyException.class)
	public void duplicate() {
		
		ScriptBean user2 = new ScriptBean();
		user2.setName("asdf");
		user2.setScript("asdf");
		dao.add(user2);
		
		ScriptBean user3 = new ScriptBean();
		user3.setName("asdf");
		user3.setScript("asdf");
		dao.add(user3);
		
	}


}
