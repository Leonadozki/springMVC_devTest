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

    <%-- 集合类参数绑定测试--%>
    <form action="/param/testList" method="post" />
        用户名：<input type="text" name="users[0].username" /></body></br>
        密码：<input type="password" name="users[0].password" /></br>
        <hr />
        用户名：<input type="text" name="map['first'].username" /></body></br>
        密码：<input type="password" name="map['first'].password" /></br>
        <input type="submit" value="提交" />
    </form>

</body>
</html>
