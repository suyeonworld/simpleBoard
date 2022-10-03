<%--
  Created by IntelliJ IDEA.
  User: jeongsuyeon
  Date: 2022-10-03
  Time: 오전 1:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>list</title>
</head>

<body>
<%@include file="/WEB-INF/includes/header.jsp"%>
<form action="/board/detail" method="get">
    <h1 style="background-color: blueviolet">Detail Testing</h1>
    <div>

        title : <c:out value="${dto.title}" />
        <br><br>
        memo : <c:out value="${dto.memo}" />
        <br><br>
        write : <c:out value="${dto.writedate}" />
    </div>


    <br>
    <button type="submit">delete</button>
</form>
</body>

</html>
