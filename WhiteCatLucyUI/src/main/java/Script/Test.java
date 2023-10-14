package Script;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Script.factory.DAOFactory;
import Script.script.ScriptBean;
import Script.script.ScriptDAO;
import Script.script.ScriptInterface;


public class Test {
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DAOFactory.class);
		ScriptDAO dao = context.getBean("scriptDAO", ScriptDAO.class);
		
		
//		ScriptBean script = new ScriptBean();
//		script.setName("tutorial");
//		script.setScript("하얀 고양이 루시는 그리운 목소리에 천천히 눈꺼풀을 들어 올렸습니다.");
//		dao.add(script);
		
//		System.out.println("추가 성공");
		
		ScriptInterface createdUser = dao.get("1");
		System.out.println(createdUser.getId());
		System.out.println(createdUser.getName());
		System.out.println(createdUser.getScript());
		
	}

}
