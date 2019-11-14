<%--
  Created by IntelliJ IDEA.
  User: kinsuway
  Date: 2019/11/12
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
    <h1>welcome page</h1>
    <form action="/param/testClassCast" method="post">
        用户名：<input type="text" name="username" /></br>
        密码：<input type="password" name="password" /></br>
        生日：<input type="date" name="birthday"><br/>
        <input type="submit" value="提交" />
    </form>
</body>
</html>
