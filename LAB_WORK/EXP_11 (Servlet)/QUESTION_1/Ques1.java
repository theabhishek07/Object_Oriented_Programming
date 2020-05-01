package Ex11;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Ques1 extends HttpServlet{
   protected void service(HttpServletRequest request,HttpServletResponse response)
   throws ServletException,IOException
   {
       response.setContentType("text/html");
       PrintWriter pwriter=response.getWriter();
       
       String values[] = request.getParameterValues("num1");
       int addition =0;
       for(int i =0; i< values.length ; i++)
       {
    	   addition = addition + Integer.parseInt(values[i]);
       }
       pwriter.println("Addition is ="+ addition);
       //ServletContext object creation
       ServletContext scontext=getServletContext();

       //fetching values of initialization parameters and printing it
       String userName=scontext.getInitParameter("uname");
       pwriter.println("User name is="+userName);
       String userEmail=scontext.getInitParameter("email");
       pwriter.println("Email Id is="+userEmail);
       pwriter.close();
   }
}