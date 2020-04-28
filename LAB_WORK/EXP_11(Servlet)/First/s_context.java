package practice_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GAURAV
 */
public class S_context extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      PrintWriter pw=response.getWriter();  
  
//creating ServletContext object  
ServletContext context=getServletContext();  
  
//Getting the value of the initialization parameter and printing it  
String driverName=context.getInitParameter("driver_name");  
pw.println("driver name is="+driverName);  
  
pw.close();
    }
