<%-- 
    Document   : LogIn
    Created on : Oct 31, 2017, 4:40:10 PM
    Author     : DoThong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <div>
            <form action="LoginServlet" method="POST" >
                <table style="position: absolute;margin-left: 35%;margin-right: auto;top: 50%;">
                    <tr>
                        <td>Tên đăng nhập: </td>
                        <td><input type="text" name="txtUsername" value="${txtUsername}" autofocus/></td>
                    </tr>
                    <tr>
                        <td>Mật khẩu:</td>
                        <td><input type="password" name="txtPassword" /></td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="Đăng nhập" name="btnLogIn"/>
                        </td>
                        <td><a href="ForgotPassword.jsp" style="font-size: 12px;">Quên mật khẩu?</a></td>
                    </tr>
                    <tr>
                        <c:if test="${sessionScope.LoginError != null}">
                            <td colspan="2"><p>${sessionScope.LoginError}</p></td>
                        </c:if>
                            <c:if test="${sessionScope.LoginError == null}">
                                <td><p></p></td>
                        </c:if>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>