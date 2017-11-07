<%-- 
    Document   : SearchResult
    Created on : Nov 1, 2017, 10:19:17 PM
    Author     : DoThong
--%>

<%@page import="com.model.CategoryModel"%>
<%@page import="com.entity.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
            <form action="SearchServlet" method="GET">
                <table cellspacing="25"  style="position: absolute;margin-left: 5%;margin-right: auto;top: 20%;text-align: left;">
                    <tr>
                        <th>Chọn loại sản phẩm:</th>
                            <%
                                CategoryModel model = new CategoryModel();
                                java.util.List<Category> categoryList = model.getCategories();
                            %>
                        <td>
                            <select name="categories">
                                <c:forEach var="category" items="<%=categoryList%>">
                                    <option value="${category.id}">${category.name}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>Chọn mức giá:</th>
                        <td><select name="priceList">
                                <option value="0">Mọi giá</option>
                                <option value="1"><= 249,000</option>
                                <option value="2">250,000 - 499,000</option>
                                <option value="3">500,000 - 749,000</option>
                                <option value="4">750,000 - 999,000</option>
                                <option value="5">1,000,000 - 1,249,000</option>
                                <option value="6">1,250,000 - 1,499,000</option>
                                <option value="7">1,500,000 - 1,749,000</option>
                                <option value="8">1,750,000 - 1,999,000</option>
                                <option value="9">>= 2,000,000</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th>Hiển thị theo thứ tự:</th>
                        <td><input type="checkbox" name="mostViews"/> Có nhiều lượt xem nhất</td>
                        <td><input type="checkbox" name="Newest"/> Mới nhất</td>
                    </tr>
                    <tr>
                        <td colspan="3">
                            <input type="submit" name="btnSearch" value="Tìm kiếm"/>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
        <c:if test="${param.btnSearch != null}">

            <div style="position: absolute;margin-left: 7%;margin-right: 5%;top: 50%;width: 90%;">
                <c:if test="${searchProducts.size() == 0}">
                    <h2>Not found</h2>
                </c:if>
                <c:if test="${searchProducts.size() != 0}">
                        <table style="position: absolute;margin-left: 0%;margin-right: 7%;top: 50%;width: 90%;text-align: center;background-color: #ff6666" border="1px solid">
                            <tr>
                                <th style="width: 15%">Hình ảnh</th>
                                <th width="200">Tên sản phẩm</th>
                                <th width="200">Số lượt xem</th>
                                <th width="300">Giá sản phẩm(VNĐ)</th>
                            </tr>
                    <c:forEach var="result" items="${searchProducts}">
                            <tr>
                                <td><img src="${result.getImage()}" width="200" height="200" style="float: left;"/></td>
                                <td style="font-weight: bold;">${result.getName()}</td>
                                <td style="font-weight: bold;">${result.getView()}</td>
                                <td style="font-weight: bold;font-size: 30px;"><fmt:formatNumber type="currency" value="${result.getPrice()}"/></td>
                            </tr>                      
                    </c:forEach>
                        </table>
                </c:if>
            </div>
        </c:if>
    </body>
</html>
