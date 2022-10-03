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
    <form action="/board/add" method="post">
      <div>
        title : <input name="title">
        <br><br>
        memo : <textarea name="memo"></textarea>
      </div>


      <br>
      <button type="submit">Post</button>
    </form>
  </body>

</html>
