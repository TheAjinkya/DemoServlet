package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class welcomePage
 */
@WebServlet("/welcomePage")
public class welcomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public welcomePage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String firstName = request.getParameter("firstName");

		String lastName = request.getParameter("lastName");

		String userName = request.getParameter("userName");

		String password = request.getParameter("password");
		
		out.println("Hello " + firstName + " " + lastName + "!");

		out.println("Welcome to the New World!");

		out.println("You have successfully logged In and your details are as follow: ");

		out.println("First Name: " + firstName);
		out.println("Last Name: " + lastName);
		out.println("User Name: " + userName);
		out.println("Password: " + password);

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
