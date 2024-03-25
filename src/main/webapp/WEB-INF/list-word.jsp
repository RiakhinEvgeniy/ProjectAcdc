<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
<c:forEach var="word" items="${requestScope.articleWords}">

    <h2><a href="article-word-train?id=${word.word}">${word.word}</a></h2>

</c:forEach>

</div>


</body>
</html>
