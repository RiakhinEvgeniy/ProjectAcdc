<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <head>
        <title>Title</title>

<style>
    body {
        display: flex;
        justify-content: center;
        align-items: flex-start;
        /*flex-direction: column;*/
        height: 100vh;
        margin: 0;
        padding-top: 20px; /* Отступ сверху */
    }
    .container {
        text-align: center;
        margin-top: 20px; /* Отступ контейнера сверху */
    }
    div {
        text-align: start;
    }
    h2 a {
        color: darkred; /* Задайте нужный цвет текста */
        text-decoration: none; /* Убирает подчеркивание у ссылок */
        /* Добавьте любые дополнительные стили для ссылок */
    }
    h2 a:hover {
        color: #007bff; /* Цвет текста при наведении */
        /* Дополнительные стили для ссылок при наведении */
    }
</style>

    </head>
<body>

<div class="container">

    <h2>Нажмите на слово для тренировки артикля</h2>

    <c:set var="length" scope="session" value="${requestScope.articleWords.size()}"/>

<c:forEach var="word" items="${requestScope.articleWords}">

    <h2><a href="article-word-train?id=${word.word}">${word.word}</a></h2>

</c:forEach>

</div>

</body>

