<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<style>
    .small_img {
        width:80px;
    }
</style>

<%--데이터를 가져올때 해당 양만 가져와야 함--%>

<div class="col-sm-8 text-left">
    <div class="row content">
        <div class="col-sm-6 text-left">
            <h1>Item All Page</h1>
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>IMG</th>
                    <th>ID</th>
                    <th>NAME</th>
                    <th>PRICE</th>
                    <th>REGDATE</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="obj" items="${cpage.getList()}">
                    <tr>
                        <td><img class="small_img" src="/uimg/${obj.imgname}" /></td>
                        <td>${obj.id}</td>
                        <td>${obj.name}</td>
                        <td><fmt:formatNumber value="${obj.price}" type="currency" currencySymbol="$"/></td>
                        <td><fmt:formatDate value="${obj.regdate}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
                    </tr>
                </c:forEach>
                </tbody>
                <!-- pagination start -->
                <div class="col text-center">
                    <ul class="pagination ">
                        <c:choose>
                            <c:when test="${cpage.getPrePage() != 0}">
                                <li>
                                    <a href="/item/allpage?pageNo=${cpage.getPrePage()}">Previous</a>
                                </li>
                            </c:when>
                            <c:otherwise>
                                <li class="disabled">
                                    <a href="#">Previous</a>
                                </li>
                            </c:otherwise>
                        </c:choose>

                        <c:forEach begin="${cpage.getNavigateFirstPage() }" end="${cpage.getNavigateLastPage() }" var="page">
                            <c:choose>
                                <c:when test="${cpage.getPageNum() == page}">
                                    <li class="active">
                                        <a  href="/item/allpage?pageNo=${page}">${page }</a>
                                    </li>
                                </c:when>
                                <c:otherwise>
                                    <li>
                                        <a href="/item/allpage?pageNo=${page}">${page }</a>
                                    </li>
                                </c:otherwise>
                            </c:choose>

                        </c:forEach>
                        <c:choose>
                            <c:when test="${cpage.getNextPage() != 0}">
                                <li>
                                    <a href="/item/allpage?pageNo=${cpage.getNextPage()}">Next</a>
                                </li>
                            </c:when>
                            <c:otherwise>
                                <li class="disabled">
                                    <a href="#">Next</a>
                                </li>
                            </c:otherwise>
                        </c:choose>

                    </ul>
                </div>
                <!-- pagination end -->
            </table>
        </div>
    </div>
</div>