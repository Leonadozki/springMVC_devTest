<%--
  Created by IntelliJ IDEA.
  User: kinsuway
  Date: 2019/11/12
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>error page</title>
</head>
    <body>
        <h1>哦豁， 出错了!</h1>
        <h2>异常信息： ${ errorMsg }</h2>
        <% System.out.println("error视图内print执行..."); %>
    </body>
</html>
