[9:53 PM, 5/5/2020] Abhishek Sharma: <%@ page import = "java.io.,java.util.,java.sql.*"%>
<%@ page import = "javax.servlet.http.,javax.servlet." %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
 
<html>
   <head>
      <title>Insert Operation JSP</title>
   </head>
   
   <body>
      <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost:3306/school"
         user = "root"  password = "redhat"/>
          
         <sql:update dataSource = "${snapshot}" var = "result">
         INSERT INTO Student VALUES (<%= request.getParameter("id")%>, <%= request.getParameter("age")%>, '<%= request.getParameter("name")%>' );
      </sql:update>
 
      <sql:query dataS…
[9:53 PM, 5/5/2020] Abhishek Sharma: <%@ page import = "java.io.,java.util.,java.sql.*"%>
<%@ page import = "javax.servlet.http.,javax.servlet." %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
 
<html>
   <head>
      <title>Insert Operation JSP</title>
   </head>
   
   <body>
      <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost:3306/school"
         user = "root"  password = "redhat"/>
         
         <sql:update dataSource = "${snapshot}" var = "result">
          UPDATE Student SET  age = <%= request.getParameter("age")%>, name = '<%= request.getParameter("name")%>' WHERE id = <%= request.getParameter("id")%>;
      </sql:update>
       <sql:query dataSource = "${snapshot}" var = "result">
         SELECT * from Student;
      </sql:query>
       <table border = "1" width = "100%">
         <tr>
            <th>Student ID</th>
            <th>Name</th>
            <th>Age</th>
         </tr>
                  <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td><c:out value = "${row.id}"/></td>
               <td><c:out value = "${row.name}"/></td>
               <td><c:out value = "${row.age}"/></td>
            </tr>
         </c:forEach>
      </table>
   </body>
</html>
