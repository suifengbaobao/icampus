/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-04-24 06:40:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class head_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");

	String staticUrl = "http://static.icampus.com";
	request.setAttribute("staticUrl", staticUrl);

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<title>Insert title here</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/head.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 导航菜单开始 -->\r\n");
      out.write("\t<div class=\"nav\">\r\n");
      out.write("\t\t<div class=\"nav-con\">\r\n");
      out.write("\t\t\t<!-- logo -->\r\n");
      out.write("\t\t\t<div class=\"nav-con-left fl\">\r\n");
      out.write("\t\t\t\t<a href=\"http://www.icampus.com\">\r\n");
      out.write("\t\t\t\t\t<img class=\"logo\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/image/icampus_logo2.png\" alt=\"Icampus\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- 链接 -->\r\n");
      out.write("\t\t\t<div class=\"nav-con-center\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav-link\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"http://www.icampus.com\">首页</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"http://www.icampus.com/impression.html\">印象园</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"http://www.icampus.com/souvenir.html\">物流连</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"http://www.icampus.com/message.html\">简信</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"http://www.icampus.com/community.html\">社区</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"nav-con-right fr\">\r\n");
      out.write("\t\t\t\t<a href=\"http://sso.icampus.com/user/login.html\">登录</a>\r\n");
      out.write("\t\t\t\t<a href=\"http://sso.icampus.com/user/register.html\">注册</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.8.2.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.cookie.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staticUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/icampus_login.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t/* $(function(){\r\n");
      out.write("\t\t\t$(\"#portrait-link\").hover(\r\n");
      out.write("\t\t\t\tfunction(data){\r\n");
      out.write("\t\t\t\t\t$(\"#user-details\").css(\"visibility\",\"none\");\r\n");
      out.write("\t\t\t\t\talert(\"dsd\");\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tfunction(data){\r\n");
      out.write("\t\t\t\t\t$(\"#user-details\").css(\"visibility\",\"hidden\");\r\n");
      out.write("\t\t\t\t\talert(\"dsd\");\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#user-details\").hover(\r\n");
      out.write("\t\t\t\tfunction(data){\r\n");
      out.write("\t\t\t\t\t$(\"#user-details\").css(\"visibility\",\"none\");\r\n");
      out.write("\t\t\t\t\talert(\"dsd\");\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tfunction(data){\r\n");
      out.write("\t\t\t\t\t$(\"#user-details\").css(\"visibility\",\"hidden\");\r\n");
      out.write("\t\t\t\t\talert(\"dsd\");\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t}) */\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
