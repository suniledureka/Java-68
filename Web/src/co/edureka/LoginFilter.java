package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/admin")
//@WebFilter("/*")
public class LoginFilter implements Filter 
{
	public void init(FilterConfig fConfig) throws ServletException {
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
	 PrintWriter out = response.getWriter();
	 //out.println("<p style=text-align:center;font-size:40px;color:red;margin-top:150px>Service is temporarly unavailable<br><br>Kindly try after some time</p>");
	
 	  String uid = request.getParameter("txtUid");
 	  String pwd = request.getParameter("txtPwd");
 	  
 	  if(uid.equalsIgnoreCase("admin") && pwd.equalsIgnoreCase("123")) {
 		 out.println("<h1>Pre Processing..</h1>");
 		  chain.doFilter(request, response);
	      out.println("<h1>Post Processing..</h1>");
 	  }
 	  else { 		  
 		  out.println("<p style=font-size:22px;color:cyan;text-align:center>Invalid User Name/ Password</p>");
 		  RequestDispatcher rd = request.getRequestDispatcher("Login.html");
 		  rd.include(request, response);
 	  }
 	  
	}

	public void destroy() {
	}
}
