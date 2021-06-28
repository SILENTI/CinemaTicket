<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/6/28
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>$Title$</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="../layui/css/layui.css"  media="all">
</head>
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


                <a href="Login">
                    <img src="img/NotLogin.png" class="layui-nav-img">
                    未登录
                </a>

            </li>
        </ul>
    </div>
</div>
<iframe src="Login_html.html"  scrolling="no" frameborder="0"  height="700px" width="100%"></iframe>

<script src="../layui/layui.js" charset="utf-8"></script>
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