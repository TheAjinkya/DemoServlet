package Test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DemoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String userName = request.getParameter("userName");

		String firstName = request.getParameter("firstName");

		
		try {
			if (userName.equals("ajinkya")) {
				
				Cookie ck = new Cookie("user", firstName);

				response.addCookie(ck);
				
//				HttpSession session = request.getSession();
//				
//				session.setAttribute("uname", firstName);

				RequestDispatcher rd = request.getRequestDispatcher("welcomePage");
				rd.include(request, response);

			} else {

				out.print("<a class=\"btn btn-danger text-center\">Login Failed! Try Again!</a>");
				request.getRequestDispatcher("index.html").include(request, response);
			}
		}catch (Exception e) {
			out.print("<a class=\"btn btn-danger text-center\">Login Failed! Try Again!</a>");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}

		out.close();
	}

}
