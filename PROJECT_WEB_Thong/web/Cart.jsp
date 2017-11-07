<%-- 
    Document   : cart
    Created on : Nov 1, 2017, 10:19:45 PM
    Author     : DoThong
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
    </head>
    <body style="margin-top:20px; padding:0; background:url(img/background.png);">
        <!-- start header -->
        <div id="header">
            <%@include file="header1.jsp" %>
        </div>
        <div>
            <h1 style="position: absolute;margin-left: 0%;margin-right: 7%;top: 20%;">Your Cart:</h1>
            <form action="PayServlet" onsubmit="getQuantity()">
                <table style="position: absolute;margin-left: 0%;margin-right: 7%;top: 30%;width: 90%;text-align: center;background-color: #ff6666" border="1px solid">
                    <tr>
                        <th style="width: 15%">Hình ảnh</th>
                        <th width="200">Tên sản phẩm</th>
                        <th width="300">Giá sản phẩm(VNĐ)</th>
                        <th width="200">Số lượng mua</th>
                    </tr>
                    <c:forEach var="cartItem" items="${sessionScope.cart}">
                        <tr>
                            <td><img src="${cartItem.getProduct().getImage()}" width="200" height="200" style="float: left;"/></td>
                            <td style="font-weight: bold;">${cartItem.getProduct().getName()}</td>
                            <td style="font-weight: bold;font-size: 30px;"><fmt:formatNumber type="currency" value="${cartItem.getProduct().getPrice()}"/></td>
                            <td style="font-weight: bold;">
                                <input type="number" name="quantity" required title="must input the quantity"/>
                            </td>
                            <td><a href="RemoveCartItemServlet?productID=${cartItem.getProduct().getProductID()}">Remove Item</a></td>
                        </tr>                      
                    </c:forEach>
                    <tr>
                        <td colspan="5"><input type="submit" name="btnPay" value="Thanh toán" style="align-items: center;"/></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
