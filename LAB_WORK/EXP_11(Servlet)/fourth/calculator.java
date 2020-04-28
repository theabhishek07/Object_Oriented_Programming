package exp11;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class calculator extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
                String n1 = request.getParameter("txt1");
                String n2 = request.getParameter("txt2");
                String op = request.getParameter("op"); 
               
                
                if(op.equals("Addition")){
                     out.println((Integer.parseInt(n1) + Integer.parseInt(n2)));
                }
                else if(op.equals("Subtraction")){
                     out.println(Integer.parseInt(n1) - Integer.parseInt(n2));
                }
                else if(op.equals("multiplication")){
                     out.println(Integer.parseInt(n1) * Integer.parseInt(n2));
                }
                else{
                    out.println(Integer.parseInt(n1) / Integer.parseInt(n2));
                }
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}