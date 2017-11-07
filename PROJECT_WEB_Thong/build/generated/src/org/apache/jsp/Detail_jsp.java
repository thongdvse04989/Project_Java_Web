package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.entity.Category;
import com.model.CategoryModel;

public final class Detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header1.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"projectcs.css\" >\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        .detail{\n");
      out.write("            border-radius: 10px 10px 10px 10px;\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 6%;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body style=\" background:url(img/background.png);\">\n");
      out.write("\n");
      out.write("   \n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"projectcs.css\" >\n");
      out.write("        <style>\n");
      out.write("            #header {\n");
      out.write("                overflow: hidden;\n");
      out.write("\n");
      out.write("                position: fixed;\n");
      out.write("                top: 0;\n");
      out.write("                width: 99%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #header a {\n");
      out.write("                float: left;\n");
      out.write("\n");
      out.write("                color: #f2f2f2;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 10px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 17px;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                font-family: \"Lato\", sans-serif;\n");
      out.write("                transition: background-color .5s;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            table {\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                margin-top: -13px;\n");
      out.write("            }\n");
      out.write("            .sidenav {\n");
      out.write("                height: 10%;\n");
      out.write("                width: 100%;\n");
      out.write("                position: fixed;\n");
      out.write("                z-index: 0;\n");
      out.write("                top: 0;\n");
      out.write("                left: 0;\n");
      out.write("                background-color: #cc3333;\n");
      out.write("                overflow-x: hidden;\n");
      out.write("                transition: 0.5s;\n");
      out.write("                padding-top: 30px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sidenav a {\n");
      out.write("                padding: 8px 8px 8px 30px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 18px;\n");
      out.write("                color: #818181;\n");
      out.write("                display: block;\n");
      out.write("                transition: 0.3s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .account {\n");
      out.write("                position: absolute;\n");
      out.write("                right: 0;\n");
      out.write("                top: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-height: 450px) {\n");
      out.write("                .sidenav {}\n");
      out.write("                .sidenav a {font-size: 18px;}\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"sidenav\">\n");
      out.write("            <form action=\"CategoryServlet\" method=\"GET\">\n");
      out.write("                <table>\n");
      out.write("                    <td><a href=\"Home.jsp\"><img src=\"img/bagheader.png\" style=\"width: 55px;height: 55px; margin-top: -15px\"/></a></td>\n");
      out.write("                    <td><a href=\"Home.jsp\">Home</a></td>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                    <td><a href=\"Contact.jsp\">Contact</a></td>\n");
      out.write("                    <td><a href=\"Sales.jsp\">Sales</a></td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"SearchResult.jsp\">\n");
      out.write("                            <img src=\"img/searchIcon.png\" style=\"width: 22px;height: 22px\"/>\n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("            <div class=\"account\">\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <a href=\"Cart.jsp\" style=\"position: absolute;right: 0%;bottom: 0;\"> Your Cart \n");
      out.write("                <img src=\"img/cart.png\" style=\"width: 22px;height: 22px;\"/></a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    \n");
      out.write("        ");
      out.write("\n");
      out.write("        <form action=\"AddtoCartServlet\" method=\"POST\">\n");
      out.write("            <table cellpadding=\"40\" class=\"detail\" align=\"center\" style=\"background-color:#ffffcc;text-align: center;\">\n");
      out.write("                <caption> <h1>Product Detail</h1></caption>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Product name</th><th>Image</th><th>Price</th><th>Quantity</th>\n");
      out.write("                </tr>\n");
      out.write("                ");
int count = 0;
      out.write("\n");
      out.write("                ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_1.setParent(null);
      _jspx_th_c_forEach_1.setVar("p");
      _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                    <tr>\n");
            out.write("\n");
            out.write("\n");
            out.write("                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\n");
            out.write("\n");
            out.write("                        <!--slide show list anh-->\n");
            out.write("\n");
            out.write("                        <td align=\"center\">\n");
            out.write("                            ");
            //  c:forEach
            org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
            _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
            _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
            _jspx_th_c_forEach_2.setVar("r");
            _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
            int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
            try {
              int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
              if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("                                <!--<img  class=\"mySlides\" src= style=\"width: 200px;height: 300px\">-->\n");
                  out.write("                                <img class=\"mySlides\" src=\"");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${r.linkimage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("\" style=\"width:70%\">\n");
                  out.write("                                ");
count++;
                  out.write("\n");
                  out.write("                            ");
                  int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_c_forEach_2.doCatch(_jspx_exception);
            } finally {
              _jspx_th_c_forEach_2.doFinally();
              _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
            }
            out.write("\n");
            out.write("\n");
            out.write("                        </td>\n");
            out.write("\n");
            out.write("                        <!-------------->\n");
            out.write("\n");
            out.write("                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                        <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                        <td><input type=\"submit\" name=\"btnAddCart\" value=\"Add to Cart\"/></td>\n");
            out.write("\n");
            out.write("                    </tr> \n");
            out.write("                    <tr>\n");
            out.write("                        <td></td>\n");
            out.write("\n");
            out.write("                        <td></td>\n");
            out.write("                    </tr>\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_1.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
      }
      out.write("\n");
      out.write("            </table>\n");
      out.write("            ");
      out.print(count);
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("        var myIndex = 0;\n");
      out.write("        carousel();\n");
      out.write("\n");
      out.write("        function carousel() {\n");
      out.write("            var i;\n");
      out.write("            var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("            for (i = 0; i < x.length; i++) {\n");
      out.write("                x[i].style.display = \"none\";\n");
      out.write("            }\n");
      out.write("            myIndex++;\n");
      out.write("            if (myIndex > x.length) {\n");
      out.write("                myIndex = 1\n");
      out.write("            }\n");
      out.write("            x[myIndex - 1].style.display = \"block\";\n");
      out.write("            setTimeout(carousel, 1000); // Change image every 2 seconds\n");
      out.write("        }\n");
      out.write("    </script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.categoryList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("category");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <td>\n");
          out.write("                            <a href=\"CategoryServlet?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                        </td>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <a href=\"DangKy.jsp\">Sign Up</a>\n");
        out.write("                    <a href=\"LogIn.jsp\">Log In</a>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <a href=\"Customer.jsp\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                    <a href=\"LogoutServlet\">Log out</a>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
