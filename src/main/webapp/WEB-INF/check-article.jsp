<%@ page contentType="text/html;charset=UTF-8" %>
<%@include file="head.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>${requestScope.article} ${requestScope.word} right</h1>

<form action="list-word" method="GET">
    <button type="submit" >to list</button>
</form>

</body>
</html>
