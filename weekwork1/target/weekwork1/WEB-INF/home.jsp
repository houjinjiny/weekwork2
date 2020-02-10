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
            /*margin-top: -20px;*/
            width: 85%;
            height: 100%;
            float: right;
        }
        #right form{
            height: 50px;
            width: 100%;
            line-height: 50px;
            text-align: center;
            font-size: 18px;
        }
        #right form input{
            height: 30px;
        }
        #put1{
            width: 50px;
        }
        table{
            border-collapse: collapse;
            margin-top: 10px;
            margin-left: 10px;
            margin-right: 20px;
        }
        tr{
            width: 100%;
            height: 20px;
            text-align: center;
        }
        td{
            font-size: 14px;
        }
        td,th{
            width: 8.2%;
            border:1px solid black;
        }
    </style>
</head>
<body>
<div class="wk">
    <div class="top">
        <jsp:include page="top.jsp"></jsp:include>
    </div>
    <div class="bottom">
        <div id="left">
            <jsp:include page="left.jsp"></jsp:include>
        </div>
        <div id="right">
            <c:if test="${not empty li}">
                <table>
                    <thead>
                    <tr>
                        <th>序号</th>
                        <th>姓名</th>
                        <th>生日</th>
                        <th>兴趣</th>
                        <th>手机号</th>
                        <th>QQ</th>
                        <th>相识时间</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <c:forEach items="${li}" var="u" >
                        <tbody>
                        <tr>
                            <td>${u.id}</td>
                            <td>${u.userName}</td>
                            <td>${u.birthDay}</td>
                            <td>${u.interest}</td>
                            <td>${u.phoneNumber}</td>
                            <td>${u.qq}</td>
                            <td>${u.creatTime}</td>
                            <td>
                                <button onclick="deleteOne(this)">删除</button>
                            </td>
                        </tr>
                        </tbody>
                    </c:forEach>
                </table>
            </c:if>

            <c:if test="${empty li}">
                没有好友
            </c:if>
        </div>
    </div>
</div>
</body>
<script src="../../js/jquery-3.3.1.js"></script>
<script>
    $(function () {
        $("tbody tr:even").css("background-color","#D1D1D1");
    });
    function deleteOne(btu) {
        var id=$(btu).parent().parent().children().first().text();
        $.post(
            "/user/deleteOne.do",
            {"id":id},
            function (data) {
                if(data!=null){
                    alert("已加入回收站");
                }
            }
        )
    }
</script>
</html>

