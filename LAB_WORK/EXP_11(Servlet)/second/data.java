package practice_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class date extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter pw = response.getWriter();
          //write req processing logic
          java.util.Date date = new java.util.Date();
          pw.println("<h2>"+"Current Date & Time: " +date.toString()+"</h2>");
          //close stream object
          pw.close();  
    }