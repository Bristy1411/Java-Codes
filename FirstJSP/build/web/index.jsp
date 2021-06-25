<%-- 
    Document   : index
    Created on : Mar 21, 2021, 12:43:29 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*" %> 
   
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>     
    
    <% 
        Connection con = null;
        Statement stmt = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/numan","root","");
            
            stmt = con.createStatement();
            int count =0;
            
            count = stmt.executeUpdate("insert into student(student_id, name, major, age, adult) values (4,'Numan','Computer',24, 'yes')");
            if(count>0){
                out.println("<p> Inserted Successfully</p>");
            }else{
                out.println("<p> Inserted is not successfull</p>");
            }
            
        }catch(Exception e){
            //System.out.println(e);
            e.printStackTrace();            
        }
        con.close();
           
        
        
    
    %>
    </body>
</html>
