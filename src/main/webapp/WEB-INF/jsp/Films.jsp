<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>无限</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
</head>

<%--CSS样式--%>
<style type="text/css">
    body {
        background: #2E323B;
    }

    .piao {
        text-align: center;
        border-bottom-left-radius: 20px;
        border-bottom-right-radius: 20px;
        width: 238px;
        padding: 6px;
        line-height: 20px;
        background: #5f5f6d;
    }
</style>

<body>

<table  bgcolor="0" align="center">
    <tr>
        <c:forEach items="${filmVoList}" var="film" begin="0" end="3">
            <td>
                <div style="width: 250px; margin:10px;">
                    <a href="filmInfo?filmId=${film.filmId}">
                        <img src="${pageContext.request.contextPath}${film.imgPath}"
                             style="width: 250px;height: 380px"/>
                    </a>

                    <div class="piao">
                        <p style="color: white; top: 50px;">${film.name}</p>

                        <p style="color: white; top: 50px;">导演:${film.director}</p>
                    </div>
                </div>
            </td>
        </c:forEach>
    </tr>
    <tr>
        <c:forEach items="${filmVoList}" var="film" begin="4" end="7">
            <td>
                <div style="width: 250px; margin:10px;">
                    <a href="filmInfo?filmId=${film.filmId}">
                        <img src="${pageContext.request.contextPath}${film.imgPath}"
                             style="width: 250px;height: 380px"/>
                    </a>
                    <div class="piao">
                        <p style="color: white; top: 50px;">${film.name}</p>
                        <p style="color: white; top: 50px;">导演:${film.director}</p>
                    </div>
                </div>
            </td>
        </c:forEach>
    </tr>
</table>

</body>
</html>