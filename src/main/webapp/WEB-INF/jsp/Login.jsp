<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>无限</title>
    <link rel="stylesheet" type="text/css" href="../css/styles.css">
</head>

<body>

<img style="display: inline-block; width: 100%; max-width: 100%; height: auto;" src="/CinemaTicket/img/鬼刀.png" />


<div class="htmleaf-container">
    <div class="wrapper">
        <div class="container">
            <h1>Welcome</h1>

            <form class="form" action="UserLogin" method="post">
                <input type="text" placeholder="Username">
                <input type="password" placeholder="Password">
                <button type="submit" id="login-button">Login</button>
            </form>
        </div>

    </div>
</div>

<script src="../js/jquery-2.1.1.min.js" type="text/javascript"></script>
<script>
    $('#login-button').click(function (event) {
        event.preventDefault();
        $('form').fadeOut(500);
        $('.wrapper').addClass('form-success');
    });
</script>

</body>
</html>