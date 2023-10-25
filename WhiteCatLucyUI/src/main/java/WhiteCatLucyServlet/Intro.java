package WhiteCatLucyServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Script.factory.DAOFactory;
import Script.script.ScriptBean;
import Script.script.ScriptDAO;
import Script.script.ScriptInterface;
import whiteCatLucy.script.SystemScript;

/**
 * Servlet implementation class Intro
 */
@WebServlet("/intro")
public class Intro extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3944309989672555545L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public Intro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		ApplicationContext context = new AnnotationConfigApplicationContext(DAOFactory.class);
//		ScriptDAO dao = context.getBean("scriptDAO", ScriptDAO.class);
//		
		SystemScript intro = new SystemScript();
//		
//		intro.intro();
//		
//		ScriptBean script = new ScriptBean();
//		script.setOrder(1);
//		script.setWhere("intro");
//		script.setScript(intro.script.toString());
//		script.setImg("/image/map/intro.png");
//		dao.add(script);
//		System.out.println("추가 성공");
//		dao.get(0);
//		System.out.println(script.getId());
//		System.out.println(script.getOrder());
//		System.out.println(script.getWhere());
//		System.out.println(script.getScript());
//		System.out.println(script.getImg());
		request.setAttribute("test", intro.script);
		
        RequestDispatcher dispatcher = request.getRequestDispatcher("/UI/intro.jsp");

        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
