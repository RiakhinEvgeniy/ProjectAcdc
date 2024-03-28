<%@ page contentType="text/html;charset=UTF-8" %>
<%@include file="head.jsp" %>

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
        button {
            padding: 10px 20px; /* Паддинги для кнопок */
            background-color: #007bff; /* Цвет фона кнопок */
            color: white; /* Цвет текста */
            border: none; /* Убрать стандартную рамку */
            cursor: pointer; /* Курсор в виде руки */
            transition: background-color 0.3s; /* Плавное изменение цвета */
        }
        button:hover {
            background-color: #0056b3; /* Цвет фона при наведении */
        }
    </style>

<body>

<div class="container">

<h1>${requestScope.article} ${requestScope.word}</h1>
<br>
<h2>Правильно</h2>
<br>
<form action="list-word" method="GET">
    <button type="submit" >К списку слов</button>
</form>

</div>

</body>