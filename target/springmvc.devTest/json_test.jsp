<%--
  Created by IntelliJ IDEA.
  User: kinsuway
  Date: 2019/11/12
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>cookie test</title>
    <script src="js/jquery-3.4.1.min.js"></script>

    <script>
        $(function () {
            $("#btn").click(function () {
                alert("xss");
            });
        });
    </script>
</head>
    <body>
        <a href="/param/testCookies">测试Cookie</a>
        <a href="/param/testSessionAttributes">测试SessionAttributes</a>
    <br>
        <a href="/param/getSessionAttributes">session域取值测试</a>
    <br>
        <button id="btn">点击测试alert</button>
    </body>
</html>
