package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Add User</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("        </style>\n");
      out.write("        <script src=\"js/validation.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"autoGenerateId()\">\n");
      out.write("        <form name=\"addUser\" action=\"AddUserServlet\" method=\"post\">\n");
      out.write("            <h1>Add User</h1>\n");
      out.write("\n");
      out.write("            <label>ID :</label> <input id=\"nameId\" type=\"text\" name=\"id\" readonly> <br> <br>\n");
      out.write("            <label>Name :</label> <input type=\"text\" name=\"name\"> <br>\n");
      out.write("            <br> <label>Gender :</label> <input type=\"radio\" name=\"gender\"\n");
      out.write("                                                value=\"male\" checked> Male <input type=\"radio\" name=\"gender\"\n");
      out.write("                                                value=\"female\"> Female <input type=\"radio\" name=\"gender\"\n");
      out.write("                                                value=\"other\"> Other <br> <br> <label>Address\n");
      out.write("                :</label> <input type=\"text\" name=\"address\"> <br> <br> <label>Email\n");
      out.write("                :</label> <input type=\"text\" name=\"email\" onblur=\"emailValidation(document.addUser.email)\" onkeyup=\"submitBtnValidation(document.addUser)\"> <br> <br> <label>No\n");
      out.write("                Of Vehicles :</label> <input type=\"text\" name=\"nosVehicle\" onkeyup=\"noValidation(document.addUser.nosVehicle)\"> <br>\n");
      out.write("            <br> <label>Contact No :</label> <input type=\"text\"\n");
      out.write("                                                    name=\"contact\" onkeyup=\"tpValidation(document.addUser, document.addUser.contact)\" onblur=\"tpNoFocusLost(document.addUser.contact)\"> <br> <br>\n");
      out.write("            <input type=\"submit\"\n");
      out.write("                   value=\"Add User\"> <input type=\"reset\" value=\"Clear\">\n");
      out.write("            <br> <br>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function autoGenerateId() {\n");
      out.write("                alert(\"Hi\");\n");
      out.write("                var xmlhttp = new XMLHttpRequest();\n");
      out.write("                xmlhttp.onreadystatechange = function () {\n");
      out.write("                    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {\n");
      out.write("                        var s = xmlhttp.responseText;\n");
      out.write("                        document.addUser.id.value= s.trim();\n");
      out.write("                        //document.getElementById(nameId).innerHTML= \"212\";\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("                xmlhttp.open(\"GET\", \"AddUSerJsp.jsp\", true);\n");
      out.write("                xmlhttp.send();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
