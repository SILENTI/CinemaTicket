<%--
  Created by IntelliJ IDEA.
  User: Cherise
  Date: 2021/6/23
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>电影详情</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="layui/css/layui.css">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="layui/css/layui.css" media="all">
</head>
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo layui-hide-xs layui-bg-blue">
            <li class="l"><a href="Main"><span style="font-size: 30px;">无限电影</span></a></li>
        </div>
        <!-- 头部区域（可配合layui 已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <!-- 移动端显示 -->
            <li class="layui-nav-item layui-show-xs-inline-block layui-hide-sm" lay-header-event="menuLeft">
                <i class="layui-icon layui-icon-spread-left"></i>
            </li>

            <li class="layui-nav-item layui-hide-xs"><a href="Main">首页</a></li>
            <li class="layui-nav-item layui-hide-xs"><a href="">电影</a></li>
            <li class="layui-nav-item layui-hide-xs"><a href="">影院</a></li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item layui-hide layui-show-md-inline-block">
                <a href="javascript:;">
                    <img src="//tva1.sinaimg.cn/crop.0.0.118.118.180/5db11ff4gw1e77d3nqrv8j203b03cweg.jpg" class="layui-nav-img">
                    李时珍
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">Your Profile</a></dd>
                    <dd><a href="">Settings</a></dd>
                    <dd><a href="">Sign out</a></dd>
                </dl>
            </li>
        </ul>
    </div>
</div>


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
                    </strong>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
