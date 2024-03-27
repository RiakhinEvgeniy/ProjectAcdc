<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp" %>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            display: flex;
            /*flex-direction: column; !* Колонка для вертикального расположения *!*/
            justify-content: center; /* Центрирование содержимого по вертикали */
            align-items: flex-start; /* Центрирование содержимого по горизонтали */
            height: 100vh;
            margin: 0;
            padding: 30px 0; /* Верхний отступ для содержимого */
        }
        .container {
            text-align: center; /* Центрирование текста и кнопок внутри контейнера */
        }
        .buttons {
            display: flex;
            justify-content: center;
            gap: 20px; /* Расстояние между кнопками */
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
</head>
<body>

<c:set var="savedArticle" value="${requestScope.word.article}"/>
<c:set var="savedWord" value="${requestScope.word.word}"/>

<div class="container">
    <h1>${savedWord}</h1>
    <div class="buttons">
        <!-- Формы и кнопки -->
        <form action="check-article" method="GET">
            <input type="hidden" name="id" value="${savedWord}">
            <input type="hidden" name="article" value="der">
            <button type="submit" style="background-color: #0056b3">der</button>
        </form>

        <form action="check-article" method="GET">
            <input type="hidden" name="id" value="${savedWord}">
            <input type="hidden" name="article" value="die">
            <button type="submit" style="background-color: darkred">die</button>
        </form>

        <form action="check-article" method="GET">
            <input type="hidden" name="id" value="${savedWord}">
            <input type="hidden" name="article" value="das">
            <button type="submit" style="background-color: green">das</button>
        </form>
    </div>
</div>

</body>
