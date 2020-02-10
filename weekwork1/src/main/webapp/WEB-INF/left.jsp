<%--
  Created by IntelliJ IDEA.
  User: 17591
  Date: 2020/2/10
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>左侧</title>
    <style>
        .wk{
            background-color: #F1F3F4;
            text-align: center;
        }
        .li{
            margin-top: 20px;
        }
        a{
            color: black;
            text-decoration: none;
            font-size: 18px;
        }
    </style>
</head>
<body>
<div class="wk">
    <div class="li"><a href="/user/getall.do">全部好友</a></div>
    <div class="li"><a href="/user/fastbirth.do">最近生日</a></div>
    <div class="li"><a href="/user/tiao.do">添加好友</a></div>
    <div class="li"><a>回收站</a></div>
</div>
</body>
</html>
