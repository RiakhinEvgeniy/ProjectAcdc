<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
    <title>Your Title Here</title>
    <!-- Ваши внешние стили и скрипты здесь -->
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: flex-start;
            height: 100vh; /* Задает высоту страницы по высоте видимой области окна браузера */
            margin: 0;
            padding: 30px 0; /* Верхний отступ для содержимого */
        }
        .container {
            text-align: center; /* Выравнивание содержимого по центру */
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
<div class="container">
    <h2>Начни учить артикли немецкого языка в этом тренажере на запоминание.</h2>
    <br>
    <h5>В немецком языке, очень важно знать артикли к существительным.</h5>
    <h5>Без знания артиклей, ты никогда не сможешь правильно понимать и говорить на немецком языке.</h5>
    <h5>У каждого существительного обязательно есть один из трех артиклей.</h5>
    <h5>Это артикль der - обозначающий мужской род.</h5>
    <h5>Это артикль die - обозначающий женский род.</h5>
    <h5>И артикль das - обозначающий средний род.</h5>
    <br>
    <div class="row">
        <div class="col">
    <form action="list-word" method="get">
        <button type="submit">К списку слов</button>
    </form>
        </div>
    </div>
</div>
</body>
