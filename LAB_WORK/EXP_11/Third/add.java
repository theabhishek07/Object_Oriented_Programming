package new1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class add extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           int a=Integer.parseInt(request.getParameter("no1"));
                 int b=Integer.parseInt(request.getParameter("no2"));
                 int c=(a+b);
                 if(c%2==0){
                 out.println("Addition is: "+(a+b));
                 }
                 else{
                  RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
        rd.forward(request, response);
                 }
        }
    }