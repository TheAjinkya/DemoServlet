package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LogOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        
        request.getRequestDispatcher("index.html").include(request, response);  
        
        
        
        Cookie ck[]= request.getCookies();  
        if(ck!=null){  
        	
/*        	This is */
        	ck[0].setValue(null);  
            response.addCookie(ck[0]);
            out.print("<a class=\\\"btn btn-danger text-center\\\">You logged Out Successfully</a>"); 
         
         
        }else{  
            out.print("<a class=\\\"btn btn-danger text-center\\\">Please Login first!</a>");  
            /*request.getRequestDispatcher("index.html").include(request, response);*/  
        }  
        out.close();  
       
	}

	
}
