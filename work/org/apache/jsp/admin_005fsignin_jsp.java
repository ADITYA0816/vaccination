/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-12-27 09:55:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import models.Admin;
import java.util.ArrayList;
import models.User;

public final class admin_005fsignin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1671808477182L));
    _jspx_dependants.put("/head.jsp", Long.valueOf(1671806564545L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1671868486020L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("models.Admin");
    _jspx_imports_classes.add("models.User");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    ");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"icon\" href=\"static/images/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"static/css/font-awesome.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"static/css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"static/css/common.css\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js\" integrity=\"sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <title>Admin : SignIn</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"static/css/form.css\">\r\n");
      out.write("    <script src=\"https://www.google.com/recaptcha/api.js\" async defer></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background-color: hsla(20, 50%, 98%, 0.733);\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("        <div class=\"container-fluid jumbotron banner\" style=\"height: 200px;\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
	Admin admin = (Admin)session.getAttribute("admin");
   
	User user = (User)session.getAttribute("user");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-6 pt-3\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-1\">\r\n");
      out.write("                        <a href=\"index.jsp\"><i class=\"fa fa-bank logo\"></i></a> \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-11 pl-5\">\r\n");
      out.write("                        <h3 class=\"company-name noLink\"><a href=\"index.jsp\" class=\"noLink\">Vaccination</a></h3>\r\n");
      out.write("                        <p class=\"text-muted lead\">Lets build completely vaccinated India</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>                   \r\n");
      out.write("            </div>\r\n");
      out.write("		<div class=\"col-6 mt-30 text-right\">\r\n");
      out.write("	        ");
 if(admin == null && user==null){ 
      out.write("\r\n");
      out.write("	            <a href=\"admin_signin.do\" class=\"btn btn-sm btn-dark text-white mr-1 font-weight-bold\">Admin</a>\r\n");
      out.write("	            <a href=\"user_signin.do\" class=\"btn btn-sm btn-dark text-white mr-1 font-weight-bold\">User</a>\r\n");
      out.write("	        ");
 }if(admin!=null){ 
      out.write("\r\n");
      out.write("	            <a href=\"admin_dashboard.do\" class=\"btn btn-sm btn-dark text-white mr-1 font-weight-bold\"><i class=\"fa fa-tachometer\"></i> Dashboard</a>\r\n");
      out.write("	            <a href=\"admin_logout.do\" class=\"btn btn-sm btn-dark text-white mr-1 font-weight-bold\"><i class=\"fa fa-sign-out\"></i> Logout</a>\r\n");
      out.write("	        ");
 }if(user!=null){ 
      out.write("\r\n");
      out.write("	        	<a href=\"user_dashboard.do\" class=\"btn btn-sm btn-dark text-white mr-1 font-weight-bold\"><i class=\"fa fa-tachometer\"></i> Dashboard</a>\r\n");
      out.write("	            <a href=\"user_logout.do\" class=\"btn btn-sm btn-dark text-white mr-1 font-weight-bold\"><i class=\"fa fa-sign-out\"></i> Logout</a>\r\n");
      out.write("	    	");
 } 
      out.write("\r\n");
      out.write("	    </div>\r\n");
      out.write("	            	\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"page-container\" class=\"container mt-2\">\r\n");
      out.write("        <div class=\"row justify-content-center\">\r\n");
      out.write("            <div class=\"col-6 p-0 m-0\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"\">\r\n");
      out.write("                    <h3 class=\"text-primary\">Sign In</h3>\r\n");
      out.write("                    </h6>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                ");
 String errors=(String)request.getAttribute("errors"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");
 if(errors!=null){ 
      out.write("\r\n");
      out.write("                    <h6 class=\"error-box\">\r\n");
      out.write("                        ");
      out.print( errors );
      out.write("\r\n");
      out.write("                    </h6>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <form action=\"admin_signin.do\" method=\"post\" class=\"mt-3\">\r\n");
      out.write("                    <input type=\"email\" id=\"id_email\" class=\"form-control\" name=\"email\" placeholder=\"Email\"\r\n");
      out.write("                        minlength=\"10\" maxlength=\"50\">\r\n");
      out.write("                    <small id=\"email_help\" class=\"form-text text-muted pl-1\">Enter valid email.</small>\r\n");
      out.write("                    <small id=\"email_error\" class=\"form-text text-danger pl-1 hide\">Invalid Email. Please enter valid\r\n");
      out.write("                        Email.</small>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"password\" id=\"id_password\" class=\"form-control d-inline-block\" style=\"width: 95%\"\r\n");
      out.write("                        name=\"password\" placeholder=\"Password\"><i id=\"view_password\"\r\n");
      out.write("                        class=\"fa fa-eye float-right mt-3 pl-0\" aria-hidden=\"true\"></i>\r\n");
      out.write("                    <small id=\"password_help\" class=\"form-text text-muted pl-1\">Characters Allowed: a-z, A-z, 0-9, - and\r\n");
      out.write("                        _.</small>\r\n");
      out.write("                    <small id=\"password_error\" class=\"form-text text-danger pl-1 hide\">Invalid Password. Please enter\r\n");
      out.write("                        valid Password.</small>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-check justify-content-center mt-3 mb-2 p-0\">\r\n");
      out.write("                        <div class=\"g-recaptcha\" data-sitekey=\"6LdVo98iAAAAANjJxQHFPDQWERtUaMe22DFkun2Q\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-danger d-inline-block mt-2 self-left\" value=\"Sign In\">\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("<div class=\"footer\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row text-white\">\r\n");
      out.write("            <div class=\"col-6 pt-2\">\r\n");
      out.write("                <h6>&copy; Vaccinated India</h6>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-6\">\r\n");
      out.write("                <h6 class=\"\">\r\n");
      out.write("                    <nav class=\"nav nav-pills float-right footer-links\">\r\n");
      out.write("                        <a href=\"\" class=\"nav-link\">Help</a>\r\n");
      out.write("                        <a href=\"\" class=\"nav-link\">Contact</a>\r\n");
      out.write("                        <a href=\"\" class=\"nav-link\">Privacy-Policy</a>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </h6>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"static/js/signin.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
