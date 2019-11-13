<%--
  Created by IntelliJ IDEA.
  User: kinsuway
  Date: 2019/11/12
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>写html前端跟写java的XML一样无聊</title>
</head>
<body>

<%--    <a href="/param/testParam?username=leo&password=1234">参数测试</a>--%>
    <form action="/param/testUser" method="post" />
用户名：<input type="text" name="username" /></body></br>
        密码：<input type="password" name="password" /></br>
        账户名: <input type="text" name="account.username" /></br>
        账户余额：<input type="text" name="account.money" /></br>
        <input type="submit" value="提交" />
    </form>

</body>
</html>
