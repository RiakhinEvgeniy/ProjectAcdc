<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp" %>

<html>
<head>
    <title>Title</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
          crossorigin="anonymous">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>

</head>

<body>

<%--<h1>${requestScope.word.article}</h1>--%>
<%--<h1>${requestScope.word}</h1>--%>

<c:set var="savedArticle" value="${requestScope.word.article}" />
<c:set var="savedWord" value="${requestScope.word.word}" />

<%--<c:out value="${savedArticle}" />--%>
<%--<h1><c:out value="${savedWord}" /></h1>--%>
<h1>${savedWord}</h1>


<form action="check-article" method="GET">
    <input type="hidden" name="id" value="${savedWord}">
        <input type="hidden" name="article" value="der">
    <button type="submit">der</button>
</form>

<form action="check-article" method="GET">
    <input type="hidden" name="id" value="${savedWord}">
    <input type="hidden" name="article" value="die">
    <button type="submit">die</button>
</form>

<form action="check-article" method="GET">
    <input type="hidden" name="id" value="${savedWord}">
    <input type="hidden" name="article" value="das">
    <button type="submit">das</button>
</form>



<%--<a href="check-article?id=${savedWord}">${savedWord}</a>--%>
<%--<h2><a href="article-word-train?id=das"></a>das</h2>--%>
<%--<h2><a href="article-word-train?id=die"></a>die</h2>--%>

<%--<c:if test="${savedArticle!=requestScope.word.article}">--%>
<%--    WWWWW--%>
<%--</c:if>--%>
<%--SSSSSS--%>






<%--<div class="container">--%>
<%--    <form class="form-horizontal" method="get">--%>
<%--        <fieldset>--%>

<%--            <!-- Form Name -->--%>
<%--            <legend>Edit user:</legend>--%>

<%--            <!-- Text input-->--%>
<%--            <div class="form-group">--%>
<%--                <label class="col-md-4 control-label" for="login">Login</label>--%>
<%--                <div class="col-md-4">--%>
<%--                    <input--%>
<%--                            id="login"--%>
<%--                            name="login"--%>
<%--                            type="text"--%>
<%--                            value="${requestScope.word.word}"--%>
<%--                            placeholder="your login"--%>
<%--                            class="form-control input-md"--%>
<%--                            required="">--%>
<%--                    <span class="help-block">min 3 symbols</span>--%>
<%--                </div>--%>
<%--            </div>--%>


<%--            <!-- Select Basic -->--%>
<%--            <div class="form-group">--%>
<%--                <label class="col-md-4 control-label" for="role">Role</label>--%>
<%--                <div class="col-md-4">--%>
<%--                    <select id="role" name="role" class="form-control">--%>
<%--                        <c:forEach var="role" items="${applicationScope.roles}">--%>
<%--                            <option value="${role}" ${role==requestScope.user.role?"selected":""}>${role}</option>--%>
<%--                        </c:forEach>--%>
<%--                    </select>--%>
<%--                </div>--%>
<%--            </div>--%>

<%--            <!-- Button (Double) -->--%>
<%--            <div class="form-group">--%>
<%--                <label class="col-md-4 control-label" for="createButton">Operation</label>--%>
<%--                <div class="col-md-8">--%>
<%--                    <c:if test="${requestScope.user==null}">--%>
<%--                        <button id="createButton" name="createButton" class="btn btn-success">Create</button>--%>
<%--                    </c:if>--%>
<%--                    <c:if test="${requestScope.user!=null}">--%>
<%--                        <button id="update" name="update" class="btn btn-primary">Update</button>--%>
<%--                    </c:if>--%>

<%--                </div>--%>
<%--            </div>--%>

<%--        </fieldset>--%>
<%--    </form>--%>
<%--</div>--%>


</body>


<%--</html>--%>
