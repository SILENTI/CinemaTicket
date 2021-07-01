
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>电影详情</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="layui/css/layui.css" media="all">
</head>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.css"/>

<style type="text/css">
    body {
        background: #2E323B;
    }

    #register table tr {
        height: 50px;
    }

    .detailed {
        background: white;
        border-radius: 20px;
        padding-bottom: 50px;
    }

</style>
<body>

<div class="container">
    <div class="container detailed">
        <div class="container" style="margin-top: 20px;">
            <div>
                <strong id="biaoti" style="font-size: 26px;">${film.name}</strong>
            </div>
            <img style="float: left; display: block; height: 350px; width: 250px; margin-right: 20px;"
                 src="${pageContext.request.contextPath}${detailVo.imgPath}"/>
            <div>
                <div style="padding-top: 15px;line-height: 25px;">
                    <p>导演: ${detailVo.director}</p>
                    <p>主演: ${detailVo.player}</p>
                    <p>类型: ${detailVo.type}</p>
                    <p>片长: ${detailVo.length}分钟</p>
                    <p>国家: ${detailVo.country}</p>
                    <p>剧情简介: ${detailVo.synopsis}</p>
                    <strong>
                        <a href="shopping?detailVoId=${detailVo.filmId}">购票</a>
                        <a href="Play?filmid=${detailVo.filmId}">排片信息</a>
                    </strong>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="layui/layui.js" charset="utf-8"></script>
<script>
    layui.use('element', function(){
        var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块

        //监听导航点击
        element.on('nav(demo)', function(elem){
            //console.log(elem)
            layer.msg(elem.text());
        });
    });
</script>
</body>
</html>
