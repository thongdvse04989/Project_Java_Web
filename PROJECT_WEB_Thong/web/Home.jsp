<%-- 
    Document   : PROJECT_WEB
    Created on : Oct 25, 2017, 10:23:41 PM
    Author     : quach
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" type="text/css" href="projectcs.css" >
    </head>
    <style type="text/css">
        #header {
            overflow: hidden;

            position: fixed;
            top: 0;
            width: 99%;

        }
        #header a {
            float: left;

            color: #f2f2f2;
            text-align: center;
            padding: 14px 10px;
            text-decoration: none;
            font-size: 17px;
        }

    </style>
    <body style="margin-top:20px; padding:0; background:url(img/background.png);">
        <!-- start header -->
        <div id="header">
            <%@include file="header1.jsp" %>
        </div>
        <!-- end menu -->

        <div id="mainContainer" style="width: 98%; margin: 150px 10px; background-color: #FFFFFF; border: 1px solid #8C0209;
             padding: 10px 5px 0px 5px;">
            <!-- start sidebar1 -->
            <!-- Page ben trai -->

            <div style="width: 15%; padding-left: 0px;">

                <%@include file="FrameLeft.jsp" %>
            </div>
            <!---Page ben phai-->

            <div>

                <%@include file="FrameRight.jsp" %>

            </div>
            <!-- end sidebar1 -->
            <!--start sidebar 2-->

            <!--end sidebar 2-->






            <!-- PAGE CONTENT -->
            <div id="maincontent" style="width: 70%; padding: 10px 17% 0px 17%;">
                <div align="center" style="height:400px;width: 93%; background-color: #dedff9;background-image:url(img/shop.jpg);
                     ;margin-left:10px;">


                    <marquee scrolldelay="60" width="40%" direction="left">

                        <p style="font-weight: bold; text-align:
                           center;font-size:25px; color:#909 ;">&laquo;&laquo;&nbsp;&nbsp;Cửa hàng
                    </marquee> 
                    <marquee scrolldelay="60" width="60%" direction="right" style="font-weight: bold; text-align:
                             center;font-size:25px; color:#909 ;">của chúng tôi&nbsp;&nbsp;&raquo;&raquo;

                    </marquee>


                </div> <!—mục 1 -->
                <div> <!—mục 2 -->

                    <div class="cong" style="margin-top: 10px;margin-left:10px;padding-left:20px; font-size:25px;padding-top:7px;
                         background-color:#8C0209; color:#FFFFFF; height:30px;width:92%" align="center"><b>Thời Trang cực hot!!!</b>



                    </div>

                </div>
                <!—mục 3 -->
                <div style="padding-bottom: 0px;line-height: 200%;padding-left: 20px;">
                    Chào mừng bạn đến với shop quần áo rẻ đẹp!<br />
                    Hãy thỏa sức shopping online cùng shop quần áo rẻ đẹp nhé <br />
                    <div>
                        <img src="img/welcome/W.jpg" width="10%" height="148" />
                        <img src="img/welcome/E1.jpg" width="10%" height="122" />
                        <img src="img/welcome/L.jpg" width="10%" height="130" />
                        <img src="img/welcome/C.jpg" width="10%" height="125" />
                        <img src="img/welcome/O.png" width="10%" height="131" />
                        <img src="img/welcome/M.jpg" width="10%" height="122" />
                        <img src="img/welcome/E.jpg" width="10%" height="130" />

                    </div>
                    Để chuẩn bị cho một ngày mới năng động và hiệu quả, bạn không thể lơ là
                    trong việc chọn lựa cho mình một bộ cánh tươm tất và thật xinh xắn. Diện cho mình những
                    bộ áo quần hợp thời trang, vừa thanh lịch lại vừa rất trẻ trung, duyên dáng, sành điệu… đó chính là điều mà Shop Thiên Thanh muốn giới thiệu với các bạn...<br />
                    <div id="spoiler" style="display: none;">
                        Để chuẩn bị cho một ngày mới năng động và hiệu quả, bạn không thể lơ là trong việc chọn lựa cho mình một bộ cánh tươm tất và thật xinh xắn. Diện cho mình những bộ áo quần hợp thời trang, vừa thanh lịch lại vừa rất trẻ trung, duyên dáng, sành điệu… đó chính là điều mà Shop Thiên Thanh muốn giới thiệu với các bạn.

                        Shop thời trang Thiên Thanh với nhiều sản phẩm phong phú, đa dạng: Quần áo, dây lưng, ví da, kính mắt nam nữ… với mẫu mã, kiểu dáng model nhất được cập nhật liên tục theo xu hướng thời trang trẻ. Với những chiếc áo sơ mi, quần âu lịch sự nhưng rất tôn vóc dáng của bạn, dáng đầm ngắn đa dạng về màu sắc và kiểu dáng tôn nên vẻ đẹp nhẹ nhàng và nữ tính, giản dị nhưng kiêu sa và rất hợp với xu hướng hiện đại. Hòa nhịp cùng những bộ phụ trang như vòng đeo tay hay ví nhỏ, dây lưng, kính mắt, bông tai, giày cao gót… khiến bộ trang phục của bạn thật nổi bật và cá tính khi bạn đến với Shop thời trang Thiên Thanh chúng tôi.

                        Chúng tôi sẽ giao hàng tận nơi trong thời gian nhanh nhất! Hãy đến với Shop thời trang Thiên Thanh để chọn cho mình những bộ trang phục duyên dáng và hợp với mình nhất nha bạn!

                        Liên hệ trực tiếp: Shop Thời Trang Thiên Thanh
                        Địa chỉ: 357 Lê Hồng Phong, Q.10, TP.HCM 
                        Holine: 0914 024 357
                        <h2 style="color:#C00;font-size:30px"><b>Thông tin về chúng tôi</b></h2>
                        <hr />
                        <h3  style="color:#C00">Danh sách cửa hàng</h3>
                        <ul style="">
                            <li>Shop Thiên Thanh 1, 233 Hai Bà Trưng, Quận 3, Tp.HCM</li>
                            <li>Shop Thiên Thanh 2, 227 Nguyễn Văn Cừ, Quận 5, Tp.HCM</li>
                            <li>Shop Thiên Thanh 3, số 2 Trần Quang Khải, Quận 1, Tp.HCM</li>
                        </ul>
                        <h3 style="color:#C00">Đặc biệt</h3>
                        <ol tyle="1">



                            <li>  Giao hàng tận nơi, không tính phí</li>
                            <li>Có giảm giá cho khách hàng thân thiết</li>
                            <li>Giảm giá cho các dịp lễ và Tết</li>
                        </ol>

                    </div>
                    <button onclick="if (document.getElementById('spoiler').style.display == 'none') {
                                document.getElementById('spoiler').style.display = ''
                            } else {
                                document.getElementById('spoiler').style.display = 'none'
                            }" title="Click to show/hide" style="background-color:#FFF" style="border-color:#FFF">See more/Hidden</button>
                </div>

                <div style="padding-left: 20px;"> <!—mục 4 -->
                    <div class="cong" style="margin-top: 10px;padding-left:20px; font-size:25px;padding-top:7px;
                         background-color:#8C0209; color:#FFFFFF; height:30px; width: 92%" align="center"><b>Thời Trang Thiên Thanh</b>
                        </h2>
                        <p align="right">
                            <input type="text" id="txtTim" style="margin: 13px 0px 0 0px;
                                   width: 180px;height: 25px; border: 1px solid #CA8186;fontstyle: italic; color:#787878;" value="Tên sản phẩm" />

                            <input type="image" id="btnTim" title="Tìm sản phẩm"
                                   src="img/1488486340_icon-111-search.svg" style="height:25px; margin-left:
                                   26px; position:relative;top:8px;width: 23px;border: none;"/>



                    </div>
                    <div style="margin-top: 4px"> 
                        <h2>Phổ biến gần đây</h2> 

                        <div>
                            <table cellpadding="1" cellspacing="15px">
                                <tr>
                                    <td valign="top">
                                        <p>
                                            <img src="SanPham/Nam/ao1.jpg" width="249" height="297" class="hinh" />
                                        </p>
                                        <h3 align="center">
                                            <img src="img/shopping-cart.svg" width="25" height="25">Áo Khoác Nam<br /><p style="color:#666">650,000</td>


                                            <td valign="top">
                                                <p>
                                                    <img src="SanPham/Nam/ao2.jpg"  width="249" height="297" class="hinh" />

                                                </p>
                                                <h3 align="center"><img src="img/shopping-cart.svg" width="25" height="25">Áo Len: Sang Trọng – Tinh Tế<br /><p style="color:#666">430,000</td>


                                                    <td valign="top">
                                                        <p><img src="SanPham/Nam/ao3.jpg" width="249" height="297" class="hinh" /></a></p>
                                                        <h3 align="center"><img src="img/shopping-cart.svg" width="25" height="25">Áo Hoodie<br /><p style="color:#666">480,000</td>

                                                                </tr>
                                                            <tr>
                                                                <td valign="top">
                                                                    <p>
                                                                        <img src="SanPham/Nam/quan12.jpg" width="249" height="297" class="hinh" />
                                                                        </a></p>
                                                                    <h3 align="center"><img src="img/shopping-cart.svg" width="25" height="25">Quần Shooc Nam<br /><p style="color:#666">490,000</td>


                                                                        <td valign="top">
                                                                            <p><img src="SanPham/Nam/ao13.jpg"  width="249" height="297" class="hinh" />
                                                                                </a></p>
                                                                            <h3 align="center"><img src="img/shopping-cart.svg" width="25" height="25">Áo So Mi Kẻ Caro<br /><p style="color:#666">499,000</td>


                                                                                <td valign="top">
                                                                                    <p><img src="SanPham/Nữ/ao12.jpg" width="249" height="297" class="hinh" /></a></p>
                                                                                    <h3 align="center"><img src="img/shopping-cart.svg" width="25" height="25">Đầm xòe thêu bướm màu trắng<br /><p style="color:#666">300,000</td>

                                                                                            </tr>
                                                                                        <tr>
                                                                                            <td valign="top">
                                                                                                <p>
                                                                                                    <img src="SanPham/Nữ/ao9.jpg" width="249" height="297" class="hinh" />
                                                                                                    </a></p>
                                                                                                <h3 align="center"><img src="img/shopping-cart.svg" width="25" height="25">Đầm xòe dự tiệc hoa nhí sang trọng<br /><p style="color:#666">290,000</td>


                                                                                                    <td valign="top">
                                                                                                        <p><img src="SanPham/Nữ/ao3.jpg"  width="249" height="297" class="hinh" />
                                                                                                            </a></p>
                                                                                                        <h3 align="center"><img src="img/shopping-cart.svg" width="25" height="25">Đầm yếm xòe đính hạt màu đỏ<br /><p style="color:#666">400,000</td>


                                                                                                            <td valign="top">
                                                                                                                <p><img src="SanPham/Nữ/ao7.jpg" width="249" height="297" class="hinh" /></a></p>
                                                                                                                <h3 align="center"><img src="img/shopping-cart.svg" width="25" height="25">Sơ mi sọc đứng lạ<br /><p style="color:#666">300,000</td>

                                                                                                                        </tr>

                                                                                                                    <tr align="center">
                                                                                                                        <td >
                                                                                                                        <th><h3 style="color:#63F"><a href="Thanh phan/sanpham.html">See more</h3></th>
                                                                                                                        </td>
                                                                                                                    </tr>	 

                                                                                                                    </table> 




                                                                                                                    </div>
                                                                                                                    </div>
                                                                                                                    </div>
                                                                                                                    </div>
                                                                                                                    </form>
                                                                                                                    <!-- end content -->
                                                                                                                    <div style="clear: both;"></div>
                                                                                                                    </div>
                                                                                                                    <!-- end page -->
                                                                                                                    <!— start Footer-->
                                                                                                                    <div id="footer" style="width: 960px;height: 70px; margin: auto 120px;padding: 0 20px;
                                                                                                                         background-color: #FFFFFF; border: 1px solid #8C0209; border-radius: 30px 30px 30px 30px;">
                                                                                                                        2009 All Rights Reserved <br />
                                                                                                                        Design by Hoành Sơn
                                                                                                                    </div>
                                                                                                                    </body>
                                                                                                                    </html>

