<%--
  Created by IntelliJ IDEA.
  User: 17591
  Date: 2020/2/10
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        .bottom #left{
            width: 15%;
            height: 100%;
            float: left;
            background-color: #F1F3F4;
            text-align: center;
        }
        #right{
            width: 85%;
            height: 100%;
            float: right;
        }
    </style>
</head>
<body>
<div class="wk">
    <div class="top">
        <jsp:include page="/WEB-INF/top.jsp"></jsp:include>
    </div>
    <div class="bottom">
        <div id="left">
            <jsp:include page="/WEB-INF/left.jsp"></jsp:include>
        </div>
        <div id="right">
        </div>
    </div>
</div>
</body>

</html>

