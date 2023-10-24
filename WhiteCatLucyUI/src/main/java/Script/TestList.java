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
	private ScriptInterface script1 = new ScriptBean();
	private ApplicationContext context = new AnnotationConfigApplicationContext(DAOFactory.class);
	private ScriptDAO dao = context.getBean("scriptDAO", ScriptDAO.class); // 얘 기능 나눠서 그때그떄 생성해도 상관 없다.
																				 // 일할떄는 두가지로 나눠 테스트용과 배포용을 만들어 배포에는 테이블 삭제 및 생성 기능을 제외한다.
	@Before
	public void initialize() {
		
		dao.delete();
		
		script1.setOrder(1);
		script1.setWhere("intro");
		script1.setScript("루시는 포근한 하얀 고양이 입니다.");
		script1.setImg("/image/map/intro.png");
		dao.add(script1);
		System.out.println(script1.getId());
		System.out.println(script1.getWhere());
	}
	
	

	@Test
	public void add() {

		ScriptBean script = new ScriptBean();
		script.setOrder(2);
		script.setWhere("intro");
		script.setScript("루시는 빨간 소파에 몸을 푸욱 뉘었습니다..");
		script.setImg("/image/map/intro.png");
		dao.add(script);
		System.out.println("추가 성공 addAndGet");

	}

	@Test
	public void get() {
		System.out.println(script1.getId());
		ScriptInterface createdScript = dao.get(script1.getId());
		assertThat(createdScript.getId(), is(script1.getId()));
		assertThat(createdScript.getOrder(), is(script1.getOrder()));
		assertThat(createdScript.getWhere(), is(script1.getWhere()));
		assertThat(createdScript.getScript(), is(script1.getScript()));
		assertThat(createdScript.getImg(), is(script1.getImg()));

	}

	@Test
	public void dropAndCreate() {

		ScriptBean script = new ScriptBean();
		script.setOrder(3);
		script.setWhere("intro");
		script.setScript("몸이 노곤하게 가라앉는 느낌에 루시는 어쩔 수 없이 무거운 눈꺼풀을 닫았습니다.");
		script.setImg("/image/map/intro.png");
		dao.add(script);
		System.out.println("추가 성공 addAndGet");

		ScriptInterface createdUser = dao.get(script.getId());
		assertThat(createdUser.getWhere(), is(script.getWhere()));
		assertThat(createdUser.getScript(), is(script.getScript()));
	

	}
	



}
