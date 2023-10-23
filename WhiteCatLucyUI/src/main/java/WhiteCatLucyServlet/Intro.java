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
		SystemScript intro = new SystemScript();
		HttpSession session = request.getSession();
		
		intro.intro();
		
		ArrayList<String> script = (ArrayList<String>) intro.script;
		
		ArrayList<String> test = new ArrayList<>();
		test.add("타입 캐스팅");
		test.add("확인용");
		
		session.setAttribute("box", script);
		session.setAttribute("test", "세션 타입 확인용");
		session.setAttribute("list", test);
		
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
