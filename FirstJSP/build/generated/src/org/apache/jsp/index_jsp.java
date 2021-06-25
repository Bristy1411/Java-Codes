package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int a = 6; 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("   \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Abdullah Al Numan</h1>\n");
      out.write("        <!--Expression-->\n");
      out.write("        ");
      out.print((2+2));
      out.write("\n");
      out.write("        <p>The current time is ");
      out.print(new java.util.Date());
      out.write("</p>\n");
      out.write("            \n");
      out.write("        <!--Declaration-->\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        <!--Scriptlets-->\n");
      out.write("        ");
 if(a>5){
      out.write("\n");
      out.write("        <input type=\"text\" value=\"Numan\"/>\n");
      out.write("        ");
}else{
      out.write("\n");
      out.write("        <input type=\"button\" value=\"submit\"/>\n");
      out.write("        ");
}

      out.write("      \n");
      out.write("    \n");
      out.write("    ");
 
        Connection con = null;
        Statement stmt = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/numan","root","");
            
            stmt = con.createStatement();
            int count =0;
            
            count = stmt.executeUpdate("insert into student(student_id, name, major, age, adult) values (10,'Tom','Bangla',22, 'yes')");
            
        }catch(Exception e){
            //System.out.println(e);
            e.printStackTrace();            
        }
        con.close();
           
        
        
    
    
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
