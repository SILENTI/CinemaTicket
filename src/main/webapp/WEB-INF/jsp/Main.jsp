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


                <c:if test="${sessionScope.user.username ==null && sessionScope.user.password ==null  }">
                    <a href="Login">
                        <img src="img/NotLogin.png" class="layui-nav-img">
                        未登录
                    </a>
                </c:if>

                <c:if test="${sessionScope.user.username != null && sessionScope.user.password != null }">
                    <a href="User">
                    <img src="//tva1.sinaimg.cn/crop.0.0.118.118.180/5db11ff4gw1e77d3nqrv8j203b03cweg.jpg" class="layui-nav-img">
                    ${sessionScope.user.username}
                    </a>
                    <dl class="layui-nav-child">
                        <dd><a href="">我的订单</a></dd>
                        <dd><a href="">基本信息</a></dd>
                        <dd><a href="SignOut">退出登录</a></dd>
                    </dl>
                </c:if>

            </li>
        </ul>
    </div>
</div>



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