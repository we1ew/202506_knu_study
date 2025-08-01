/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-11-21 10:55:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.Movie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class movie_005fsignin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>회원가입</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/_css/Movie/styles.css\">\r\n");
      out.write("    <script src=\"/_js/jquery-2.1.1.js\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script src=\"/_js/Movie/movie_signin.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <header>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1>영화 평점 공유</h1>\r\n");
      out.write("            <nav>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"main.do\">홈</a></li>\r\n");
      out.write("                    <li><a href=\"list.do\">영화 목록</a></li>\r\n");
      out.write("                    <li><a href=\"login.do\">로그인</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <main>\r\n");
      out.write("        <section class=\"register-section\">\r\n");
      out.write("            <h2>회원가입</h2>\r\n");
      out.write("            <div id=\"register-form\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"user_id\">아이디</label>\r\n");
      out.write("                    <input type=\"text\" id=\"user_id\" name=\"user_id\" placeholder=\"아이디를 입력하세요\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"name\">이름</label>\r\n");
      out.write("                    <input type=\"text\" id=\"name\" name=\"name\" placeholder=\"이름을 입력하세요\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"password\">비밀번호</label>\r\n");
      out.write("                    <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"비밀번호를 입력하세요\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"confirm-password\">비밀번호 확인</label>\r\n");
      out.write("                    <input type=\"password\" id=\"confirm-password\" name=\"confirm-password\" placeholder=\"비밀번호를 다시 입력하세요\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"submit\" id=\"signin_button\">회원가입</button>\r\n");
      out.write("                <p class=\"login-link\">이미 계정이 있으신가요? <a href=\"login.do\">로그인</a></p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    </main>\r\n");
      out.write("    <footer>\r\n");
      out.write("        <p>&copy; 2024 영화 평점 공유 사이트</p>\r\n");
      out.write("    </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
