package WhiteCatLucyServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import whiteCatLucy.script.SystemScript;

/**
 * Servlet implementation class Intro
 */
@WebServlet("/intro")
public class Intro extends HttpServlet {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 2685444196136033448L;

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
		SystemScript script = new SystemScript();
		
		script.intro();
		
		List<String> nowScript = script.script;
//		response.setContentType("text/html;charset=utf-8");

//		response.getWriter().append(nowScript.get(0));
		request.setAttribute("box", nowScript);
//		ServletContext app = this.getServletContext();
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
