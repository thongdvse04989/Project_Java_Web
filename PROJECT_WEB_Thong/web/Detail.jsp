<%-- 
    Document   : Detail
    Created on : Nov 2, 2017, 2:39:31 PM
    Author     : quach
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="projectcs.css" >
        <title>JSP Page</title>
    </head>
    <style type="text/css">
        .detail{
            border-radius: 10px 10px 10px 10px;
            text-align: center;
            margin-top: 6%;
        }
    </style>


    <body style=" background:url(img/background.png);">

        <div id="header">
            <%@include file="header1.jsp" %>
        </div>
        <%--<jsp:useBean id="frame" class="com.model.ShowleftModel" scope="session"/>--%>
        <form action="AddtoCartServlet" method="POST">
            <table cellpadding="40" class="detail" align="center" style="background-color:#ffffcc;text-align: center;">
                <caption> <h1>Product Detail</h1></caption>
                <tr>
                    <th>Product name</th><th>Image</th><th>Price</th><th>Quantity</th>
                </tr>
                <%int count = 0;%>
                <c:forEach var="p" items="${detail}">
                    <tr>


                        <td>${p.productName}</td>


                        <!--slide show list anh-->

                        <td align="center">
                            <c:forEach var="r" items="${id}">
                                <!--<img  class="mySlides" src= style="width: 200px;height: 300px">-->
                                <img class="mySlides" src="${r.linkimage}" style="width:70%">
                                <%count++;%>
                            </c:forEach>

                        </td>

                        <!-------------->

                        <td>${p.price}</td>
                        <td>${p.quantity}</td>
                        <td><input type="submit" name="btnAddCart" value="Add to Cart"/></td>

                    </tr> 
                    <tr>
                        <td></td>

                        <td></td>
                    </tr>
                </c:forEach>
            </table>
            <%=count%>
        </form>
    </body>
    <script>
        var myIndex = 0;
        carousel();

        function carousel() {
            var i;
            var x = document.getElementsByClassName("mySlides");
            for (i = 0; i < x.length; i++) {
                x[i].style.display = "none";
            }
            myIndex++;
            if (myIndex > x.length) {
                myIndex = 1
            }
            x[myIndex - 1].style.display = "block";
            setTimeout(carousel, 1000); // Change image every 2 seconds
        }
    </script>
</html>
