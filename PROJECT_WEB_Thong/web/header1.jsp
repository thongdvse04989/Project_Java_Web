<%-- 
    Document   : header1
    Created on : Oct 30, 2017, 8:03:06 PM
    Author     : DoThong
--%>

<%@page import="com.entity.Category"%>
<%@page import="com.model.CategoryModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="projectcs.css" >
        <style>
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
            body {
                font-family: "Lato", sans-serif;
                transition: background-color .5s;

            }
            table {
                margin-left: auto;
                margin-right: auto;
                margin-top: -13px;
            }
            .sidenav {
                height: 10%;
                width: 100%;
                position: fixed;
                z-index: 0;
                top: 0;
                left: 0;
                background-color: #cc3333;
                overflow-x: hidden;
                transition: 0.5s;
                padding-top: 30px;
            }

            .sidenav a {
                padding: 8px 8px 8px 30px;
                text-decoration: none;
                font-size: 18px;
                color: #818181;
                display: block;
                transition: 0.3s;
            }

            .account {
                position: absolute;
                right: 0;
                top: 0;
            }

            @media screen and (max-height: 450px) {
                .sidenav {}
                .sidenav a {font-size: 18px;}
            }
        </style>
    </head>
    <body>
        <div class="sidenav">
            <form action="CategoryServlet" method="GET">
                <table>
                    <td><a href="Home.jsp"><img src="img/bagheader.png" style="width: 55px;height: 55px; margin-top: -15px"/></a></td>
                    <td><a href="Home.jsp">Home</a></td>
                    <c:forEach items="${sessionScope.categoryList}" var="category">
                        <td>
                            <a href="CategoryServlet?index=${category.id}">${category.name}</a>
                        </td>
                    </c:forEach> 
                    <td><a href="Contact.jsp">Contact</a></td>
                    <td><a href="Sales.jsp">Sales</a></td>
                    <td>
                        <a href="SearchResult.jsp">
                            <img src="img/searchIcon.png" style="width: 22px;height: 22px"/>
                        </a>
                    </td>
                </table>
            </form>
            <div class="account">
                <c:if test="${sessionScope.username == null}">
                    <a href="DangKy.jsp">Sign Up</a>
                    <a href="LogIn.jsp">Log In</a>
                </c:if>
                <c:if test="${sessionScope.username != null}">
                    <a href="Customer.jsp">${sessionScope.username}</a>
                    <a href="LogoutServlet">Log out</a>
                </c:if>
            </div>
            <a href="Cart.jsp" style="position: absolute;right: 0%;bottom: 0;"> Your Cart 
                <img src="img/cart.png" style="width: 22px;height: 22px;"/></a>
        </div>
    </body>
</html>
