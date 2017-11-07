<%-- 
    Document   : DangKy
    Created on : Oct 26, 2017, 12:14:05 AM
    Author     : quach
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dang Ky</title>
        <link rel="stylesheet" type="text/css" href="projectcs.css" >
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
        <div id="header">
            <%@include  file="header1.jsp" %>
        </div>
        <div>
            <form action="SignUpServlet" method="POST" >
                <table style="position: absolute; margin-left: 34%;top: 35%;" cellspacing="25">
                    <tr>
                        <td>*Tên Đăng Nhập:</td>
                        <td><input type="text" name="txtUsername" value="${param.txtUsername}" autofocus required pattern="[a-zA-Z0-9]{4,30}"/></td>
                    </tr>
                    <tr>
                        <td>*Mật khẩu:</td>
                        <td><input type="password" name="txtPassword"required value="${param.txtPassword}" pattern=".{6,30}"/></td>
                    </tr>
                    <tr>
                        <td>*Nhập lại Mật khẩu:</td>
                        <td><input type="password" name="txtPasswordMatch" value="${param.txtPasswordMatch}"required/></td>
                    </tr>
                    <tr>
                        <td>*Họ và tên:</td>
                        <td><input type="text" name="txtName" value="${param.txtName}"required pattern="[a-zA-Z ]{3,30}" title="input invalid"/></td>
                    </tr>
                    <tr>
                        <td>*Email:</td>
                        <td><input type="email" name="txtEmail" value="${param.txtEmail}"required/></td>
                    </tr>
                    <tr>
                        <td> Số điện thoại:</td>
                        <td><input type="text" name="txtPhone" value="${param.txtPhone}" pattern="[0-9+]{8,11}"/></td>
                    </tr>
                    <tr>
                        <td style="position: absolute;right: 10%; bottom: 22%">
                            <p style="font-size: 11px;color: red"></p>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" style="position: absolute;bottom: 20%;margin-left: 35%;margin-right: auto;">
                            <input type="submit" name="btnSubmit" value="Đăng kí"/>
                        </td>
                    </tr>
                    <tr>
                        <c:if test="${SignUpError != null}">
                            <td colspan="2"><p>${SignUpError}</p></td>
                                </c:if>     
                                <c:if test="${SignUpError == null}">
                            <td><p></p></td>
                        </c:if>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>

