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
  <table border="1">

      <c:forEach items="${list}" var="list">
          <tr>
              <td>
                  <c:out value="${list.tno}" />
              </td>
              <td>
                <c:out value="${list.title}" />
              </td>
              <td>
                  <c:out value="${list.memo}" />
              </td>
              <td>
                  <c:out value="${list.writedate}" />
              </td>
          </tr>
      </c:forEach>

  </table>
<br>
    <button onclick="location.href='/board/add'">Add</button>

</body>
</html>
