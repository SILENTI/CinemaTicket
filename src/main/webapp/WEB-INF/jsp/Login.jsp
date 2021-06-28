<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>无限</title>
    <link rel="stylesheet" type="text/css" href="layui/css/layui.css" media="all">
    <script src="layui/layui.all.js"></script>
    <style>
        .wrap{
            width: 100%;
            height: 100%;
            /*background-color: #ffffff;*/

            /*background: rgba(29,29,31,0.72);*/
            /*position:absolute;*/
            /*backdrop-filter: saturate(180%) blur(20px);*/

            /*z-index:-1;*/
            /*filter:blur(10px) contrast(.8);*/

            /*透明效果*/
            /*background-color: rgba(0,0,0,0.1);*/

            background-size: cover;

            /*白色毛玻璃效果*/
            /* width: 287px;
             height: 285px;
             background: inherit;
             -webkit-filter: blur(5px);
             -moz-filter: blur(5px);
             -ms-filter: blur(5px);
             -o-filter: blur(5px);
             filter: blur(5px);
             filter: progid:DXImageTransform.Microsoft.Blur(PixelRadius=4, MakeShadow=false);*/



        }
        .usernameDiv{
            width: 300px;
            height: 40px;
            padding-left: 130px;
            padding-top: 30px;

        }
        .adminInput{
            width: 200px;
            height: 40px;
            font-size: 15px;
            border-radius: 0.5em;
        }
        .passwordDiv{
            width: 300px;
            height: 40px;
            padding-left: 130px;
            padding-top: 28px;
        }

        i{
            position: absolute;
        }
        .adminIcon{
            font-size: 22px;
            margin-top: 8px;
            margin-left: 165px;
        }
        .logoHead{
            width: 250px;
            height: 60px;
            padding-left: 90px;
            padding-top: 25px;
        }
        .usernameLabel{
            width: 60px;
            height: 30px;
            font-size: 16px;
            float: left;
            margin-left: 55px;
            margin-top: 40px;
        }

        .usernameWrapDiv{
            width: 400px;
            height: 70px;
        }
        .submitDiv{
            width: 150px;
            height: 40px;
            padding-left: 20px;
            padding-top: 28px;
            float: left;

        }
        .submit{
            width: 100px;
            height: 40px;
            margin-top:25px;
            border-radius: 1em;
        }
        img{
            position: absolute;
        }

        p,input,button{
            text-align: center;

        }
        .container{
            width: 420px;
            height: 320px;
            min-height: 320px;
            max-height: 320px;
            position: absolute;
            top: 0;
            left: 0;
            bottom: 0;
            right: 0;
            margin: auto;
            padding: 20px;
            z-index: 130;
            border-radius: 8px;
            /*background-color: #fff;*/
            background-size: cover;

            background-color: rgba(0,0,0,0.1);

            /*毛玻璃效果*/
            /*background: rgba(29,29,31,0.72);*/
            /*backdrop-filter: saturate(180%) blur(20px);*/

            /*filter:blur(10px) contrast(.8);*/
            /*box-shadow: 0 3px 18px rgba(100, 0, 0, 0.5);*/
            /*font-size: 16px;*/
            background-position: center 0;

        }

        body {
            background:url("/CinemaTicket/img/鬼刀.png")  no-repeat center center;   /*加载背景图*/   /* 背景图不平铺 */
            background-size:cover;  /* 让背景图基于容器大小伸缩 */
            background-attachment:fixed;        /* 当内容高度大于图片高度时，背景图像的位置相对于viewport固定 */    //此条属性必须设置否则可能无效/
        background-color:#CC;   /* 设置背景颜色，背景图加载过程中会显示背景色 */
        }
    </style>
</head>
<body>

<div class="container">
    <div class="wrap">
        <div>
            <form action="UserLogin" method="post">
                <div class="logoHead">
                    <h1 align="center" style="margin-top: 15px">无限</h1>
                </div>
                <div class="usernameWrapDiv">
                    <div class="usernameLabel">
                        <label>用户名:</label>
                    </div>
                    <div class="usernameDiv">
                        <i class="layui-icon layui-icon-username adminIcon"></i>
                        <input id="loginUsername" class="layui-input adminInput" type="text" name="userName" placeholder="输入用户名" >
                    </div>
                </div>
                <div class="usernameWrapDiv">
                    <div class="usernameLabel">
                        <label>密码:</label>
                    </div>
                    <div class="passwordDiv">
                        <i class="layui-icon layui-icon-password adminIcon"></i>
                        <input id="loginPassword" class="layui-input adminInput" type="password" name="passWord" placeholder="输入密码">
                    </div>

                </div>

                <input type="submit" class="submit layui-btn layui-btn-primary" value="登录"></input>
                <div class="submitDiv" ></div>
            </form>
        </div>
    </div>

</div>
</body>

</html>