
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html lang="en">
<head>

    <!-- 합쳐지고 최소화된 최신 CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

    <!-- 부가적인 테마 -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

    <!-- 합쳐지고 최소화된 최신 자바스크립트 -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>


    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Nearby Park Info</title>

    <!-- Bootstrap core CSS -->
    <link href="../../dist/css/bootstrap.min.css" rel="stylesheet">


    <style type="text/css" >
        #wrapper {
            width:320px;
            margin : 0 auto ;
        }
    </style>



    <!-- Custom styles for this template -->
    <style>
        .box1 {
            float:left; width:160px; height:100px;}
        .box2 {
            display:inline-block; width:160px; height:100px; }
    </style>

    <style>

        .login_wrapper {
            width:600px;
            height:375px;
            background: rgba( 255, 255, 255, 0.4 );
            margin:0 auto;
            background-position: center;
        }
        .login_wrapper h1 {
            padding-top:30px;
            text-align:center;
            color:#fff;
        }
        .login_wrapper input[type=text] {
            width:80%;
            height: 25px;
            margin-left: 10%;
            margin-top: 10px;
        }

        body {
            background: url(../resources/images/background-main.jpg) no-repeat center center fixed;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;
        }
        .form-signin2 {
            max-width: 165px;
            padding: 5px;
        }

        .form-signin {
            max-width: 580px;
            padding: 15px;
            margin: 0 auto;
        }
        .form-signin .form-signin-heading,
        .form-signin .checkbox {
            margin-bottom: 10px;
        }
        .form-signin .checkbox {
            font-weight: normal;
        }
        .form-signin .form-control {
            position: relative;
            height: auto;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
            padding: 10px;
            font-size: 16px;
        }
        .form-signin .form-control:focus {
            z-index: 2;
        }
        .form-signin input[type="Address"] {
            margin-bottom: -1px;
            border-bottom-right-radius: 0;
            border-bottom-left-radius: 0;
        }
        .form-signin input[type="lists"] {
            margin-bottom: 10px;
            border-top-left-radius: 0;
            border-top-right-radius: 0;
        }
    </style>

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
<div class="container" style="padding-top:100px">
    <div class="login_wrapper">
        <form class="form-signin" action="/my/park/view" method="GET">
            <h1 class="form-signin-heading">
                Nearby park info search</h1>
            <label for="inputaddress" class="sr-only">My address</label>
            <input type="Address" id="inputaddress" name="address" class="form-control" placeholder="My address" required autofocus>
            <label for="inputlists" class="sr-only">Number of lists</label>
            <input type="lists" id="inputlists" name="parkc" class="form-control" placeholder="Number of lists" required>


            <button class="btn btn-lg btn-primary btn-block" type="submit">submit</button>
        </form>

        <div id="wrapper">
            <div class="box1"><form class="form-signin2" action="/seoul/park/info" method="GET">
                <button class="btn btn-lg btn-primary btn-block" type="submit">ParkInfo</button>
            </form></div>
            <div class="box2"> <form class="form-signin2" action="/seoul/park/neareststation" method="GET">
                <button class="btn btn-lg btn-primary btn-block" type="submit">NearestStation</button>
            </form></div>

        </div>
    </div>
</div> <!-- /container -->


<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script>
    (function () {
        'use strict';
        if (navigator.userAgent.match(/IEMobile\/10\.0/)) {
            var msViewportStyle = document.createElement('style')
            msViewportStyle.appendChild(
                    document.createTextNode(
                            '@-ms-viewport{width:auto!important}'
                    )
            )
            document.querySelector('head').appendChild(msViewportStyle)
        }
    })();
</script>
</body>
</html>
