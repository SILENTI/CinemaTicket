
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
