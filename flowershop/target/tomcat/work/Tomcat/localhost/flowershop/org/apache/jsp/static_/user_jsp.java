/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-12-30 09:37:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.static_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.springframework.web.context.request.SessionScope;
import flowershop.pojo.UserInfo;
import java.util.*;
import java.io.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
UserInfo currentuser=(UserInfo)session.getAttribute("currentuser");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>~ 浪漫花房 · 用户信息 ~</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- bootstrap -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/vendors/bootstrap-3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/vendors/bootstrap-3.3.7/bootstrap-datetimepicker.min.css\">\r\n");
      out.write("    <!-- font awesome -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/vendors/font-awesome-4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    <!-- other -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/common.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/user.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <!-- 头部导航 -->\r\n");
      out.write("    <div class=\"header-nav\">\r\n");
      out.write("        <div class=\"header-container\">\r\n");
      out.write("            <!-- 左部条目 -->\r\n");
      out.write("            <div class=\"l-info\">\r\n");
      out.write("                <ul class=\"clearfix\">\r\n");
      out.write("                    <li class=\"collect\">\r\n");
      out.write("                        <a href=\"\">\r\n");
      out.write("                            <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                            收藏浪漫花房\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <div class=\"loginArea\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            欢迎\r\n");
      out.write("                            <span id=\"nickname\">");
      out.print(currentuser.getNickName() );
      out.write("</span>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"static/index.jsp\">首页</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- 右部条目 -->\r\n");
      out.write("            <div class=\"r-info\">\r\n");
      out.write("                <ul class=\"clearfix\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"\">联系客服</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <!-- 登录后展示 -->\r\n");
      out.write("                    <div class=\"loginArea clearfix\" id=\"mineP\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\" id=\"exit\">退出</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"static/cart.jsp\" id=\"cart\">购物车</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"static/myBuy.jsp\" id=\"mineBuy\">我的购买</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- 登录后展示 end -->\r\n");
      out.write("                    <!-- 登录前展示 -->\r\n");
      out.write("                    <!-- <div class=\"registerArea clearfix\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"register.html\">注册</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"login.html\">登录</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </div> -->\r\n");
      out.write("                    <!-- 登录前展示 end -->\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 搜索区域 -->\r\n");
      out.write("    <div class=\"search-area\">\r\n");
      out.write("        <!-- logo -->\r\n");
      out.write("        <div class=\"logo-container\">\r\n");
      out.write("            <img src=\"assets/img/logo.jpg\" alt=\"logo\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 主体区域 -->\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"inner\">\r\n");
      out.write("            <!-- 标题 -->\r\n");
      out.write("            <div class=\"title\">\r\n");
      out.write("                <p>用 户 信 息</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- 内容 -->\r\n");
      out.write("            <div class=\"info\">\r\n");
      out.write("\r\n");
      out.write("                <!-- tab -->\r\n");
      out.write("                <div class=\"tab-list\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li class=\"now\" data-tabId=\"0\">\r\n");
      out.write("                            <i class=\"fa fa-picture-o\"></i>\r\n");
      out.write("                            用户头像\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li data-tabId=\"1\">\r\n");
      out.write("                            <i class=\"fa fa-asterisk\"></i>\r\n");
      out.write("                            用户信息\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li data-tabId=\"2\">\r\n");
      out.write("                            <i class=\"fa fa-key\"></i>\r\n");
      out.write("                            修改密码\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- tab container -->\r\n");
      out.write("                <div class=\"tab-container\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- 头像表单 -->\r\n");
      out.write("                    <div class=\"avatar now-tab\" data-tabId=\"0\">\r\n");
      out.write("                        <form id=\"ex-avatar\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/changuserimage.action\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("                            <div class=\"inner-avatar\">                             \r\n");
      out.write("                                ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                <img src=\"/Image/User/");
      out.print(currentuser.getPicture());
      out.write("\" id=\"avatar\" alt=\"avatar\" name=\"Picture\">\r\n");
      out.write("                                <input type=\"file\" name=\"Picture\" id=\"avatarBtn\" onchange=\"showAvatar()\" accept=\".jpg, .png, .bmp, .jpeg\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p>用户头像 <span style=\"margin-left:5px;color:red;font-size:10px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span></p>\r\n");
      out.write("                            <input type=\"submit\" value=\"确认上传\" id=\"avatar-up\" style=\"display: none\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- 用户基础信息表单 -->\r\n");
      out.write("                    <div class=\"base-info\" data-tabId=\"1\">\r\n");
      out.write("                        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/changeuserinfo.action\" id=\"ex-baseInfo\">\r\n");
      out.write("                            <div class=\"nick\">\r\n");
      out.write("                                <span class=\"text\">昵称：</span>\r\n");
      out.write("                                <span class=\"nickname real\">");
      out.print(currentuser.getNickName());
      out.write("</span>\r\n");
      out.write("                                <div class=\"ex\">\r\n");
      out.write("                                    <input type=\"text\" class=\"ex-nickname\" name=\"NickName\" autocomplete=\"off\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"sex\">\r\n");
      out.write("                                <span class=\"text\">性别：</span>\r\n");
      out.write("                                <span class=\"sex real\">");
      out.print(currentuser.getSex());
      out.write("</span>\r\n");
      out.write("                                <div class=\"ex\">\r\n");
      out.write("                                    <label for=\"\">\r\n");
      out.write("                                        <span>男</span>\r\n");
      out.write("                                        <input type=\"radio\" name=\"sex\" value=\"0\">\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <label for=\"\">\r\n");
      out.write("                                        <span>女</span>\r\n");
      out.write("                                        <input type=\"radio\" name=\"sex\" value=\"1\">\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"birth\">\r\n");
      out.write("                                <span class=\"text\">生日：</span>\r\n");
      out.write("                                <span class=\"birth real\">");
      out.print(currentuser.getBirthDay());
      out.write("</span>\r\n");
      out.write("                                <div class=\"ex\">\r\n");
      out.write("                                    <input size=\"16\" type=\"text\" readonly class=\"form_datetime\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"xinzuo\">\r\n");
      out.write("                                <span class=\"text\">星座：</span>\r\n");
      out.write("                                <span class=\"xinzuo real\">");
      out.print(currentuser.getConstellation() );
      out.write("</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <input type=\"button\" class=\"exInfo\" value=\"修改信息\">\r\n");
      out.write("                            <input id=\"confirm\" class=\"ex-btn\" type=\"button\" value=\"确认修改\">\r\n");
      out.write("                            <input id=\"miss\" class=\"ex-btn\" type=\"button\" value=\"取消修改\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- 用户修改密码 -->\r\n");
      out.write("                    <div class=\"password\" data-tabId=\"2\">\r\n");
      out.write("                        <div class=\"changeP\">\r\n");
      out.write("                            <div class=\"changePInner\">\r\n");
      out.write("                                <span>请输入新密码</span>\r\n");
      out.write("                                <input type=\"password\" id=\"newPwd\">\r\n");
      out.write("                                <input type=\"button\" value=\"确认修改\" id=\"confirmCPwd\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"info\">\r\n");
      out.write("                            <span class=\"error\" style=\"display: none\">修改失败</span>\r\n");
      out.write("                            <span class=\"success\" style=\"display: none\">修改成功</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <hr>\r\n");
      out.write("\r\n");
      out.write("    <!-- 底部部分 -->\r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("        <div class=\"footer-container\">\r\n");
      out.write("            <span class=\"footer-title\">/ · 友情链接 · /</span>\r\n");
      out.write("            <div class=\"footer-link\">\r\n");
      out.write("                <img src=\"assets/img/link_pic/link_pic_1.png\" alt=\"link_pic\">\r\n");
      out.write("                <span> / </span>\r\n");
      out.write("                <img src=\"assets/img/link_pic/link_pic_3.jpg\" alt=\"link_pic\">\r\n");
      out.write("                <span> / </span>\r\n");
      out.write("                <img src=\"assets/img/link_pic/link_pic_4.jpg\" alt=\"link_pic\">\r\n");
      out.write("                <span> / </span>\r\n");
      out.write("                <img src=\"assets/img/link_pic/link_pic_5.jpg\" alt=\"link_pic\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <span>Copyright© &nbsp;&nbsp;&nbsp; 2017-2027 &nbsp;&nbsp;&nbsp;版权所有&nbsp;&nbsp;严禁复制</span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"assets/vendors/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/vendors/jquery/JQuery.Form.js\"></script>\r\n");
      out.write("    <script src=\"assets/vendors/bootstrap-3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/vendors/bootstrap-3.3.7/bootstrap-datetimepicker.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/vendors/bootstrap-3.3.7/bootstrap-datetimepicker.zh-CN.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/header.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/user.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("        function showAvatar() {\r\n");
      out.write("\t\t\tvar $avatarUp = $('#avatar-up'), $avatarBtn = $('#avatarBtn');\r\n");
      out.write("\r\n");
      out.write("\t\t\tif ($avatarBtn[0].files.length) {\r\n");
      out.write("\t\t\t\t$avatarUp.show();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t//显示选择图片\r\n");
      out.write("\t\t\tvar avatarBtn = document.querySelectorAll('#avatarBtn')[0];\r\n");
      out.write("\t\t\tvar avatarImg = document.querySelectorAll('#avatar')[0];\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (avatarBtn.value != null) {\r\n");
      out.write("\t\t\t\tavatarImg.setAttribute('src', \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/showImg.action?imageName=\"+avatarBtn.value);\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /static/user.jsp(128,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.currentuser.getPicture()==''}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <img src=\"uploads/avatar.jpg\" id=\"avatar\" alt=\"avatar\" name=\"Picture\">\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
