package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.entity.Category;
import com.model.CategoryModel;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header1.jsp");
    _jspx_dependants.add("/FrameLeft.jsp");
    _jspx_dependants.add("/FrameRight.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_url_var_value.release();
    _jspx_tagPool_c_param_value_name_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"projectcs.css\" >\n");
      out.write("    </head>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        #header {\n");
      out.write("            overflow: hidden;\n");
      out.write("\n");
      out.write("            position: fixed;\n");
      out.write("            top: 0;\n");
      out.write("            width: 99%;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        #header a {\n");
      out.write("            float: left;\n");
      out.write("\n");
      out.write("            color: #f2f2f2;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 14px 10px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-size: 17px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body style=\"margin-top:20px; padding:0; background:url(img/background.png);\">\n");
      out.write("        <!-- start header -->\n");
      out.write("        <div id=\"header\">\n");
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
      out.write("        </div>\n");
      out.write("        <!-- end menu -->\n");
      out.write("\n");
      out.write("        <div id=\"mainContainer\" style=\"width: 98%; margin: 150px 10px; border: 1px solid #8C0209;\n");
      out.write("             padding: 10px 5px 0px 5px;\">\n");
      out.write("            <!-- start sidebar1 -->\n");
      out.write("            <!-- Page ben trai -->\n");
      out.write("\n");
      out.write("            <div style=\"width: 15%; padding-left: 0px;\">\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Frame Left</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        #sidebar1 a{\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <!--use bean to show left frame-->\n");
      out.write("           ");
      com.model.ShowleftModel frame = null;
      synchronized (session) {
        frame = (com.model.ShowleftModel) _jspx_page_context.getAttribute("frame", PageContext.SESSION_SCOPE);
        if (frame == null){
          frame = new com.model.ShowleftModel();
          _jspx_page_context.setAttribute("frame", frame, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("           \n");
      out.write("           \n");
      out.write("        <div id=\"sidebar1\" style=\"width: 220px;font-size: 12px;float: left;\">\n");
      out.write("            <div style=\"border: 1px solid #FFFFFF;\"> <!—Mục 1 -->\n");
      out.write("                <div style=\"height: 40px;background-color:#8C0209;color: #FFFFFF; border-radius: 20px 0px 20px 0px; padding: 10px 5px 0px 5px;\"\">\n");
      out.write("\n");
      out.write("                    <h1 align=\"center\" style=\"margin-top: 0px\"> Sản phẩm mới</h1> \n");
      out.write("\n");
      out.write("                </div>            \n");
      out.write("                <table align=\"center\" style=\"margin-top: 5px;\">\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <tr>Xem thêm sản phẩm</tr>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <!--Ho tro truc tuyen--> \n");
      out.write("                \n");
      out.write("            <div style=\"border: 1px solid #FFFFFF;\"> <!—Mục 2 -->\n");
      out.write("                <div style=\"height: 40px;background-color:#8C0209;color: #FFFFFF; border-radius: 20px 0px 20px 0px\">\n");
      out.write("                    <h2 align=\"center\">Hỗ trợ trực tuyến</h2>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"height: 220px;\" >\n");
      out.write("                    <br />\n");
      out.write("                    <img src=\"img/yahoo.png\" width=\"170\" height=\"154\" /><br />\n");
      out.write("\n");
      out.write("                    <h2 align=\"center\" style=\"color:#09F\"> Hot line: 0914 024 357 </h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("                <!--Thong ke-->\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            <div style=\"border: 1px solid #FFFFFF;\"> <!—Mục 3 -->\n");
      out.write("                <div style=\"height: 40px;background-color:#8C0209;color: #FFFFFF; border-radius: 20px 0px 20px 0px\">\n");
      out.write("                    <h2 align=\"center\">Thống kê</h2>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"height: 100px\">\n");
      out.write("                    <h3 align=\"center\" style=\"color:#090\">Số người online: 100500<br />\n");
      out.write("                        Số người truy cập: 300100  </h3>\n");
      out.write("                    <p><br />\n");
      out.write("                    </p>\n");
      out.write("                    <hr />\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!---Page ben phai-->\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Frame Right</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div id=\"sidebar1\" style=\"width: 220px;font-size: 12px;float: right; margin: 0 0px;\">\n");
      out.write("\t\t   \n");
      out.write("\t\t\t<div style=\"border: 1px solid #FFFFFF;\"> <!—Mục 2 -->\n");
      out.write("\t\t\t<div style=\"height: 40px;background-color:#8C0209;color: #FFFFFF; border-radius: 0px 20px 0px 20px; padding: 10px 5px 0px 5px;\">\n");
      out.write("\t\t\t\t\t\t<h1 align=\"center\" style=\"margin-top: 0px;\">Tin Thời Trang</h1>\n");
      out.write("\t\t\t\t<p><br />\n");
      out.write("\t\t\t\t<h2 style=\"color:#930\" align=\"right\">----------------------------------<br />Tin tức<br />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t---------------------------------\n");
      out.write("\t\t\t\t</h2>\n");
      out.write("\n");
      out.write("\t\t\t\t<p align=\"center\"> <a href=\"http://giaitri.vnexpress.net/tin-tuc/thoi-trang\"> <img src=\"img/tin thoi trang/1.jpg\" width=\"200\" height=\"300\"</a></a>  </p>\n");
      out.write("\t\t\t\t<h2 style=\"color:#930\" align=\"right\">----------------------------------<br />Sự kiện<br />\n");
      out.write("\t\t----------------------------------\n");
      out.write("\t\t\t\t</h2>\n");
      out.write("\t\t\t\t\t\t\t\t<p>&nbsp;</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<p><br />\n");
      out.write("\n");
      out.write("\t\t \t\t<p align=\"center\"> <a href=\"http://www.24h.com.vn/thoi-trang-c78.html\"><img src=\"img/tin thoi trang/2.jpg\" width=\"200\" height=\"300\" /></a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- end sidebar1 -->\n");
      out.write("            <!--start sidebar 2-->\n");
      out.write("\n");
      out.write("            <!--end sidebar 2-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- PAGE CONTENT -->\n");
      out.write("            <div id=\"maincontent\" style=\"width: 70%; padding: 10px 17% 0px 17%;\">\n");
      out.write("                <div align=\"center\" style=\"height:400px;width: 93%; background-color: #dedff9;background-image:url(img/shop.jpg);\n");
      out.write("                     ;margin-left:10px;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <marquee scrolldelay=\"60\" width=\"40%\" direction=\"left\">\n");
      out.write("\n");
      out.write("                        <p style=\"font-weight: bold; text-align:\n");
      out.write("                           center;font-size:25px; color:#909 ;\">&laquo;&laquo;&nbsp;&nbsp;Cửa hàng\n");
      out.write("                    </marquee> \n");
      out.write("                    <marquee scrolldelay=\"60\" width=\"60%\" direction=\"right\" style=\"font-weight: bold; text-align:\n");
      out.write("                             center;font-size:25px; color:#909 ;\">của chúng tôi&nbsp;&nbsp;&raquo;&raquo;\n");
      out.write("\n");
      out.write("                    </marquee>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div> <!—mục 1 -->\n");
      out.write("                <div> <!—mục 2 -->\n");
      out.write("\n");
      out.write("                    <div class=\"cong\" style=\"margin-top: 10px;margin-left:10px;padding-left:20px; font-size:25px;padding-top:7px;\n");
      out.write("                         background-color:#8C0209; color:#FFFFFF; height:30px;width:92%\" align=\"center\"><b>Thời Trang cực hot!!!</b>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!—mục 3 -->\n");
      out.write("                <div style=\"padding-bottom: 0px;line-height: 200%;padding-left: 20px;\">\n");
      out.write("                    Chào mừng bạn đến với shop quần áo rẻ đẹp!<br />\n");
      out.write("                    Hãy thỏa sức shopping online cùng shop quần áo rẻ đẹp nhé <br />\n");
      out.write("                    <div>\n");
      out.write("                        <img src=\"img/welcome/W.jpg\" width=\"10%\" height=\"148\" />\n");
      out.write("                        <img src=\"img/welcome/E1.jpg\" width=\"10%\" height=\"122\" />\n");
      out.write("                        <img src=\"img/welcome/L.jpg\" width=\"10%\" height=\"130\" />\n");
      out.write("                        <img src=\"img/welcome/C.jpg\" width=\"10%\" height=\"125\" />\n");
      out.write("                        <img src=\"img/welcome/O.png\" width=\"10%\" height=\"131\" />\n");
      out.write("                        <img src=\"img/welcome/M.jpg\" width=\"10%\" height=\"122\" />\n");
      out.write("                        <img src=\"img/welcome/E.jpg\" width=\"10%\" height=\"130\" />\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    Để chuẩn bị cho một ngày mới năng động và hiệu quả, bạn không thể lơ là\n");
      out.write("                    trong việc chọn lựa cho mình một bộ cánh tươm tất và thật xinh xắn. Diện cho mình những\n");
      out.write("                    bộ áo quần hợp thời trang, vừa thanh lịch lại vừa rất trẻ trung, duyên dáng, sành điệu… đó chính là điều mà Shop Thiên Thanh muốn giới thiệu với các bạn...<br />\n");
      out.write("                    <div id=\"spoiler\" style=\"display: none;\">\n");
      out.write("                        Để chuẩn bị cho một ngày mới năng động và hiệu quả, bạn không thể lơ là trong việc chọn lựa cho mình một bộ cánh tươm tất và thật xinh xắn. Diện cho mình những bộ áo quần hợp thời trang, vừa thanh lịch lại vừa rất trẻ trung, duyên dáng, sành điệu… đó chính là điều mà Shop Thiên Thanh muốn giới thiệu với các bạn.\n");
      out.write("\n");
      out.write("                        Shop thời trang Thiên Thanh với nhiều sản phẩm phong phú, đa dạng: Quần áo, dây lưng, ví da, kính mắt nam nữ… với mẫu mã, kiểu dáng model nhất được cập nhật liên tục theo xu hướng thời trang trẻ. Với những chiếc áo sơ mi, quần âu lịch sự nhưng rất tôn vóc dáng của bạn, dáng đầm ngắn đa dạng về màu sắc và kiểu dáng tôn nên vẻ đẹp nhẹ nhàng và nữ tính, giản dị nhưng kiêu sa và rất hợp với xu hướng hiện đại. Hòa nhịp cùng những bộ phụ trang như vòng đeo tay hay ví nhỏ, dây lưng, kính mắt, bông tai, giày cao gót… khiến bộ trang phục của bạn thật nổi bật và cá tính khi bạn đến với Shop thời trang Thiên Thanh chúng tôi.\n");
      out.write("\n");
      out.write("                        Chúng tôi sẽ giao hàng tận nơi trong thời gian nhanh nhất! Hãy đến với Shop thời trang Thiên Thanh để chọn cho mình những bộ trang phục duyên dáng và hợp với mình nhất nha bạn!\n");
      out.write("\n");
      out.write("                        Liên hệ trực tiếp: Shop Thời Trang Thiên Thanh\n");
      out.write("                        Địa chỉ: 357 Lê Hồng Phong, Q.10, TP.HCM \n");
      out.write("                        Holine: 0914 024 357\n");
      out.write("                        <h2 style=\"color:#C00;font-size:30px\"><b>Thông tin về chúng tôi</b></h2>\n");
      out.write("                        <hr />\n");
      out.write("                        <h3  style=\"color:#C00\">Danh sách cửa hàng</h3>\n");
      out.write("                        <ul style=\"\">\n");
      out.write("                            <li>Shop Thiên Thanh 1, 233 Hai Bà Trưng, Quận 3, Tp.HCM</li>\n");
      out.write("                            <li>Shop Thiên Thanh 2, 227 Nguyễn Văn Cừ, Quận 5, Tp.HCM</li>\n");
      out.write("                            <li>Shop Thiên Thanh 3, số 2 Trần Quang Khải, Quận 1, Tp.HCM</li>\n");
      out.write("                        </ul>\n");
      out.write("                        <h3 style=\"color:#C00\">Đặc biệt</h3>\n");
      out.write("                        <ol tyle=\"1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <li>  Giao hàng tận nơi, không tính phí</li>\n");
      out.write("                            <li>Có giảm giá cho khách hàng thân thiết</li>\n");
      out.write("                            <li>Giảm giá cho các dịp lễ và Tết</li>\n");
      out.write("                        </ol>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <button onclick=\"if (document.getElementById('spoiler').style.display == 'none') {\n");
      out.write("                                document.getElementById('spoiler').style.display = ''\n");
      out.write("                            } else {\n");
      out.write("                                document.getElementById('spoiler').style.display = 'none'\n");
      out.write("                            }\" title=\"Click to show/hide\" style=\"background-color:#FFF\" style=\"border-color:#FFF\">See more/Hidden</button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div style=\"padding-left: 20px;\"> <!—mục 4 -->\n");
      out.write("                    <div class=\"cong\" style=\"margin-top: 10px;padding-left:20px; font-size:25px;padding-top:7px;\n");
      out.write("                         background-color:#8C0209; color:#FFFFFF; height:30px; width: 92%\" align=\"center\"><b>Thời Trang Thiên Thanh</b>\n");
      out.write("                        </h2>\n");
      out.write("                        <p align=\"right\">\n");
      out.write("                            <input type=\"text\" id=\"txtTim\" style=\"margin: 13px 0px 0 0px;\n");
      out.write("                                   width: 180px;height: 25px; border: 1px solid #CA8186;fontstyle: italic; color:#787878;\" value=\"Tên sản phẩm\" />\n");
      out.write("\n");
      out.write("                            <input type=\"image\" id=\"btnTim\" title=\"Tìm sản phẩm\"\n");
      out.write("                                   src=\"img/1488486340_icon-111-search.svg\" style=\"height:25px; margin-left:\n");
      out.write("                                   26px; position:relative;top:8px;width: 23px;border: none;\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div style=\"margin-top: 4px\"> \n");
      out.write("                        <h2>Phổ biến gần đây</h2> \n");
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <table cellpadding=\"1\" cellspacing=\"15px\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <td valign=\"top\">\n");
      out.write("                                        <p>\n");
      out.write("                                            <img src=\"SanPham/Nam/ao1.jpg\" width=\"249\" height=\"297\" class=\"hinh\" />\n");
      out.write("                                        </p>\n");
      out.write("                                        <h3 align=\"center\">\n");
      out.write("                                            <img src=\"img/shopping-cart.svg\" width=\"25\" height=\"25\">Áo Khoác Nam<br /><p style=\"color:#666\">650,000</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <td valign=\"top\">\n");
      out.write("                                                <p>\n");
      out.write("                                                    <img src=\"SanPham/Nam/ao2.jpg\"  width=\"249\" height=\"297\" class=\"hinh\" />\n");
      out.write("\n");
      out.write("                                                </p>\n");
      out.write("                                                <h3 align=\"center\"><img src=\"img/shopping-cart.svg\" width=\"25\" height=\"25\">Áo Len: Sang Trọng – Tinh Tế<br /><p style=\"color:#666\">430,000</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    <td valign=\"top\">\n");
      out.write("                                                        <p><img src=\"SanPham/Nam/ao3.jpg\" width=\"249\" height=\"297\" class=\"hinh\" /></a></p>\n");
      out.write("                                                        <h3 align=\"center\"><img src=\"img/shopping-cart.svg\" width=\"25\" height=\"25\">Áo Hoodie<br /><p style=\"color:#666\">480,000</td>\n");
      out.write("\n");
      out.write("                                                                </tr>\n");
      out.write("                                                            <tr>\n");
      out.write("                                                                <td valign=\"top\">\n");
      out.write("                                                                    <p>\n");
      out.write("                                                                        <img src=\"SanPham/Nam/quan12.jpg\" width=\"249\" height=\"297\" class=\"hinh\" />\n");
      out.write("                                                                        </a></p>\n");
      out.write("                                                                    <h3 align=\"center\"><img src=\"img/shopping-cart.svg\" width=\"25\" height=\"25\">Quần Shooc Nam<br /><p style=\"color:#666\">490,000</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                        <td valign=\"top\">\n");
      out.write("                                                                            <p><img src=\"SanPham/Nam/ao13.jpg\"  width=\"249\" height=\"297\" class=\"hinh\" />\n");
      out.write("                                                                                </a></p>\n");
      out.write("                                                                            <h3 align=\"center\"><img src=\"img/shopping-cart.svg\" width=\"25\" height=\"25\">Áo So Mi Kẻ Caro<br /><p style=\"color:#666\">499,000</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                <td valign=\"top\">\n");
      out.write("                                                                                    <p><img src=\"SanPham/Nữ/ao12.jpg\" width=\"249\" height=\"297\" class=\"hinh\" /></a></p>\n");
      out.write("                                                                                    <h3 align=\"center\"><img src=\"img/shopping-cart.svg\" width=\"25\" height=\"25\">Đầm xòe thêu bướm màu trắng<br /><p style=\"color:#666\">300,000</td>\n");
      out.write("\n");
      out.write("                                                                                            </tr>\n");
      out.write("                                                                                        <tr>\n");
      out.write("                                                                                            <td valign=\"top\">\n");
      out.write("                                                                                                <p>\n");
      out.write("                                                                                                    <img src=\"SanPham/Nữ/ao9.jpg\" width=\"249\" height=\"297\" class=\"hinh\" />\n");
      out.write("                                                                                                    </a></p>\n");
      out.write("                                                                                                <h3 align=\"center\"><img src=\"img/shopping-cart.svg\" width=\"25\" height=\"25\">Đầm xòe dự tiệc hoa nhí sang trọng<br /><p style=\"color:#666\">290,000</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                                    <td valign=\"top\">\n");
      out.write("                                                                                                        <p><img src=\"SanPham/Nữ/ao3.jpg\"  width=\"249\" height=\"297\" class=\"hinh\" />\n");
      out.write("                                                                                                            </a></p>\n");
      out.write("                                                                                                        <h3 align=\"center\"><img src=\"img/shopping-cart.svg\" width=\"25\" height=\"25\">Đầm yếm xòe đính hạt màu đỏ<br /><p style=\"color:#666\">400,000</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                                            <td valign=\"top\">\n");
      out.write("                                                                                                                <p><img src=\"SanPham/Nữ/ao7.jpg\" width=\"249\" height=\"297\" class=\"hinh\" /></a></p>\n");
      out.write("                                                                                                                <h3 align=\"center\"><img src=\"img/shopping-cart.svg\" width=\"25\" height=\"25\">Sơ mi sọc đứng lạ<br /><p style=\"color:#666\">300,000</td>\n");
      out.write("\n");
      out.write("                                                                                                                        </tr>\n");
      out.write("\n");
      out.write("                                                                                                                    <tr align=\"center\">\n");
      out.write("                                                                                                                        <td >\n");
      out.write("                                                                                                                        <th><h3 style=\"color:#63F\"><a href=\"Thanh phan/sanpham.html\">See more</h3></th>\n");
      out.write("                                                                                                                        </td>\n");
      out.write("                                                                                                                    </tr>\t \n");
      out.write("\n");
      out.write("                                                                                                                    </table> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                                                    </div>\n");
      out.write("                                                                                                                    </div>\n");
      out.write("                                                                                                                    </div>\n");
      out.write("                                                                                                                    </div>\n");
      out.write("                                                                                                                    </form>\n");
      out.write("                                                                                                                    <!-- end content -->\n");
      out.write("                                                                                                                    <div style=\"clear: both;\"></div>\n");
      out.write("                                                                                                                    </div>\n");
      out.write("                                                                                                                    <!-- end page -->\n");
      out.write("                                                                                                                    <!— start Footer-->\n");
      out.write("                                                                                                                    <div id=\"footer\" style=\"width: 960px;height: 70px; margin: auto 120px;padding: 0 20px;\n");
      out.write("                                                                                                                         background-color: #FFFFFF; border: 1px solid #8C0209; border-radius: 30px 30px 30px 30px;\">\n");
      out.write("                                                                                                                        2009 All Rights Reserved <br />\n");
      out.write("                                                                                                                        Design by Hoành Sơn\n");
      out.write("                                                                                                                    </div>\n");
      out.write("                                                                                                                    </body>\n");
      out.write("                                                                                                                    </html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("p");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${frame.select()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                        <tr>\n");
          out.write("                            <td style=\"font-size: 16px; color: #C00\">\n");
          out.write("                                ");
          if (_jspx_meth_c_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${r}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_url_0.setVar("r");
    _jspx_th_c_url_0.setValue("DetailServlet");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_1[0]++;
        _jspx_th_c_url_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_url_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_1[0]--;
    }
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_0 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_0.setPageContext(_jspx_page_context);
    _jspx_th_c_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_0);
    _jspx_th_c_param_0.setName("productID");
    _jspx_th_c_param_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.producid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_0 = _jspx_th_c_param_0.doStartTag();
    if (_jspx_th_c_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
    return false;
  }

  private boolean _jspx_meth_c_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_1 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_1.setPageContext(_jspx_page_context);
    _jspx_th_c_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_0);
    _jspx_th_c_param_1.setName("image");
    _jspx_th_c_param_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_1 = _jspx_th_c_param_1.doStartTag();
    if (_jspx_th_c_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
    return false;
  }
}
