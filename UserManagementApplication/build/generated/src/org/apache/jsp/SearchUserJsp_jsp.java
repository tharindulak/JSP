package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SearchUserJsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form name=\"addUser\" method=\"post\">\r\n");
      out.write("\t\t<h1>Search User</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t<label>ID :</label> <input type=\"text\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\treadonly> <br> <br> <label>Name :</label> <input\r\n");
      out.write("\t\t\ttype=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly> <br> <br>\r\n");
      out.write("\t\t\t");

				String gender =String.valueOf(request.getAttribute("gender")) ;
				System.out.println(gender);
				
				if(!(gender.equals("")) && gender.equals("male")){
					
			
      out.write("\r\n");
      out.write("\t\t\t\t<label>Gender :</label> <input type=\"radio\" name=\"gender\" value=\"male\"\r\n");
      out.write("\t\t\t\treadonly checked=\"checked\"> Male <input type=\"radio\" name=\"gender\"\r\n");
      out.write("\t\t\t\tvalue=\"female\" readonly> Female <input type=\"radio\"\r\n");
      out.write("\t\t\t\tname=\"gender\" value=\"other\" readonly> Other <br> <br>\r\n");
      out.write("\t\t\t");

				}
				else if(!(gender.equals("")) && gender.equals("female")){
			
      out.write("\r\n");
      out.write("\t\t\t\t<label>Gender :</label> <input type=\"radio\" name=\"gender\" value=\"male\"\r\n");
      out.write("\t\t\t\treadonly> Male <input type=\"radio\" name=\"gender\"\r\n");
      out.write("\t\t\t\tvalue=\"female\" readonly checked=\"checked\"> Female <input type=\"radio\"\r\n");
      out.write("\t\t\t\tname=\"gender\" value=\"other\" readonly> Other <br> <br>\r\n");
      out.write("\t\t\t");

				}
				else{
			
      out.write("\r\n");
      out.write("\t\t\t\t<label>Gender :</label> <input type=\"radio\" name=\"gender\" value=\"male\"\r\n");
      out.write("\t\t\t\treadonly> Male <input type=\"radio\" name=\"gender\"\r\n");
      out.write("\t\t\t\tvalue=\"female\" readonly> Female <input type=\"radio\"\r\n");
      out.write("\t\t\t\tname=\"gender\" value=\"other\" readonly checked=\"checked\"> Other <br> <br>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<label>Address :</label> <input type=\"text\" name=\"address\"\r\n");
      out.write("\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly> <br> <br> <label>Email\r\n");
      out.write("\t\t\t:</label> <input type=\"text\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("\t\t<br> <br> <label>No Of Vehicles :</label> <input type=\"text\"\r\n");
      out.write("\t\t\tname=\"nosVehicle\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nosVehicle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly> <br> <br>\r\n");
      out.write("\t\t<label>Contact No :</label> <input type=\"text\" name=\"contact\"\r\n");
      out.write("\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contact}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly> <br> <br>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
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
