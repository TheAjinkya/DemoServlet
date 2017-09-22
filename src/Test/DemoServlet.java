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

			RequestDispatcher rd = request.getRequestDispatcher("welcome");
			rd.forward(request, response);

		} else {

			out.print("<div class=\"alert alert-danger\">\r\n"
					+ "  <strong>Login Failed!</strong> UserName and Password does not match!\r\n"
					+ "</div>");
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			rd.include(request, response);

		}

		out.close();
	}

}
