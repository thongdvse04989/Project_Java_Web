<%-- 
    Document   : FrameLeft
    Created on : Oct 25, 2017, 11:41:58 PM
    Author     : quach
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Frame Left</title>
    </head>
    <style>
        #sidebar1 a{
            text-decoration: none;
        }
    </style>
    <body>
        <!--use bean to show left frame-->
           <jsp:useBean id="frame" class="com.model.ShowleftModel" scope="session"/>
           
           
        <div id="sidebar1" style="width: 220px;font-size: 12px;float: left;">
            <div style="border: 1px solid #FFFFFF;"> <!—Mục 1 -->
                <div style="height: 40px;background-color:#8C0209;color: #FFFFFF; border-radius: 20px 0px 20px 0px; padding: 10px 5px 0px 5px;"">

                    <h1 align="center" style="margin-top: 0px"> Sản phẩm mới</h1> 

                </div>            
                <table align="center" style="margin-top: 5px;">

                    <c:forEach var="p" items="${frame.select()}"> 
                        <tr>
                            <td style="font-size: 16px; color: #C00">
                                <c:url var="r" value="DetailServlet">
                                    <c:param name="productID" value="${p.producid}"/>
                                    <c:param name="image" value="${p.image}"/>
                                </c:url><a href="${r}">${p.productName}</a>
                            </td>
                        </tr>
                    </c:forEach>
                        <tr>Xem thêm sản phẩm</tr>
                </table>

            </div>
                
                
                
                <!--Ho tro truc tuyen--> 
                
            <div style="border: 1px solid #FFFFFF;"> <!—Mục 2 -->
                <div style="height: 40px;background-color:#8C0209;color: #FFFFFF; border-radius: 20px 0px 20px 0px">
                    <h2 align="center">Hỗ trợ trực tuyến</h2>
                </div>
                <div style="height: 220px;" >
                    <br />
                    <img src="img/yahoo.png" width="170" height="154" /><br />

                    <h2 align="center" style="color:#09F"> Hot line: 0914 024 357 </h2>
                </div>
            </div>
                
                <!--Thong ke-->
                
                
            <div style="border: 1px solid #FFFFFF;"> <!—Mục 3 -->
                <div style="height: 40px;background-color:#8C0209;color: #FFFFFF; border-radius: 20px 0px 20px 0px">
                    <h2 align="center">Thống kê</h2>
                </div>
                <div style="height: 100px">
                    <h3 align="center" style="color:#090">Số người online: 100500<br />
                        Số người truy cập: 300100  </h3>
                    <p><br />
                    </p>
                    <hr />
                </div>
            </div>
        </div>
    </body>
</html>
