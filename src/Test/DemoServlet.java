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
			
			out.print("Sorry UserName and Password does not match!");  
	        RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
	        rd.include(request, response);  

		}


		out.close();
	}

}
