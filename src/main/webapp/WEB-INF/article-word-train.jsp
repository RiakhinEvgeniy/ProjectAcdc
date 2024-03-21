<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 21.03.2024
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach var="word" items="${requestScope.articleWords}">
        <p>${word.word}</p>
    </c:forEach>
</body>
</html>
