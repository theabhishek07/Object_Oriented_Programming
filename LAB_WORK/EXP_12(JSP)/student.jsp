<%@ page import = "java.io.,java.util.,java.sql.*"%>
<%@ page import = "javax.servlet.http.,javax.servlet." %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
 
<html>
   <head>
      <title>Jsp Exp1</title>
   </head>
   <body>
      <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost:3306/school"
         user = "root"  password = "redhat"/>
 
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
