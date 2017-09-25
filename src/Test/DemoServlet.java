package Test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DemoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String userName = request.getParameter("userName");

		if (userName.equals("ajinkya")) {

			RequestDispatcher rd = request.getRequestDispatcher("welcomePage");
			rd.forward(request, response);

		} else {
			
			out.print("This is not a valid login");

			out.print("<span class=\"d-block bg-primary\">Login Failed! UserName and Password does not match!</span>");
//			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
//			rd.include(request, response);
		}

		out.close();
	}

}
