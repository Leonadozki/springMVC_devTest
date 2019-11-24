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
    <title>success page</title>
</head>
<body>
    <h1>Redirect Success !</h1>

    ${ msg }

    ${ sessionScope }

    <% System.out.println("success视图内print执行..."); %>
</body>
</html>
