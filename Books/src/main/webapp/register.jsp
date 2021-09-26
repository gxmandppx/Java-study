<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!-- 注册界面 -->
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>注册界面</title>
    <meta name="description" content="这是一个 index 页面">
    <meta name="keywords" content="index">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <meta name="apple-mobile-web-app-title" content="Amaze UI" />
    <link rel="stylesheet" href="static/css/amazeui.min.css" />
    <link rel="stylesheet" href="static/css/amazeui.datatables.min.css" />
    <link rel="stylesheet" href="static/css/app.css">
    <link rel="stylesheet" href="static/css/register.css">
    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>

</head>

<body data-type="login" >
<div class="am-g tpl-g" >
    <div class="tpl-login">
        <div class="tpl-login-content">
            <div class="tpl-login-title">注册用户</div>
            <span>
                  创建一个新的用户
              </span>


            <form class="am-form tpl-form-line-form" method="post" action="/books/RegisterServlet">
                <div class="am-form-group">
                    <input type="text" class="tpl-form-input" id="user-name" name="username" required="required" placeholder="请输入账号">

                </div>
                <div class="am-form-group">
                    <input type="password" class="tpl-form-input" id="user-name" name="password" required="required" placeholder="请输入密码">
                </div>
                <div class="am-form-group">
                    <input type="text" class="tpl-form-input" id="user-name" name="name" required="required" placeholder="请输入姓名">
                </div>
                <div class="am-form-group">
                    <input type="text" class="tpl-form-input" id="user-name" name="email" required="required" placeholder="请输入邮箱">
                </div>
                <div class="am-form-group">
                    <input type="text" class="tpl-form-input" id="user-name" name="phone" required="required" placeholder="请输入手机号">
                </div>


                <div class="am-form-group">

                    <button type="submit" class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success  tpl-login-btn">提交</button>

                </div>
                <div class="am-form-group">

                    <button type="button" onclick="location.href='/books/login.jsp';" class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success  tpl-login-btn">返回登录</button>

                </div>
            </form>
        </div>
    </div>
</div>
<script src="http://cdn.bootcss.com/amazeui/2.7.2/js/amazeui.min.js"></script>
<script src="static/js/app.js"></script>
</body>

</html>