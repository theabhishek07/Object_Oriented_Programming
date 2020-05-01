import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ques4 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               
                PrintWriter out = response.getWriter();
                String n1 = request.getParameter("txt1");
                String n2 = request.getParameter("txt2");
                String op = request.getParameter("op"); 
               
                
                if(op.equals("Addition")){
                     out.println((" Sum is " + ( Integer.parseInt(n1) + Integer.parseInt(n2))));
                }
                else if(op.equals("Subtraction")){
                     out.println(" Difference is " + (Integer.parseInt(n1) - Integer.parseInt(n2)));
                }
                else if(op.equals("Multiplication")){
                     out.println(" Product is " + (Integer.parseInt(n1) * Integer.parseInt(n2)));
                }
                else if(op.equals("Division")){
                    out.println(" Quotient is " + (Integer.parseInt(n1) / Integer.parseInt(n2)));
                }
                else if(op.equals("Modulus")){
                    out.println(" Remainder is " + (Integer.parseInt(n1) % Integer.parseInt(n2)));
                }
                
    }
}

