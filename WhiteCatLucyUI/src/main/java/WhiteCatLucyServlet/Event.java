package WhiteCatLucyServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import whiteCatLucy.script.SystemScript;

/**
 * Servlet implementation class Tutorial
 */
@WebServlet("/event")
public class Event extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6531134001122953456L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public Event() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		SystemScript tutorial = new SystemScript();
//		
//		tutorial.tutorial2();
//		
//		List<String> nowScript = tutorial.script;
//		
//		request.setAttribute("box", nowScript);
		
		String where = (String) request.getAttribute("where");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/UI/Event.jsp");

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
