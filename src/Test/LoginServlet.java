package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("index.html").include(request, response);
		
		String firstName = request.getParameter("firstName");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if (userName.equals("aajinkya")) {
			
			out.println("You have succesfully Logged In");
			out.print("Welcome "+ firstName);
			
			Cookie ck = new Cookie("ajinkya", firstName);
			
			response.addCookie(ck);
			
		} else {
			
			out.println("Sorry You are not Logged In!");
			request.getRequestDispatcher("index.html").include(request, response);

		}
		
		out.close();
		
	
	}

}
