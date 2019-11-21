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
    <title>upload test</title>
</head>
    <body>
        <form action="/upload/oldWay" method="post" enctype="multipart/form-data">
            <input type="file" name="upload1" />
            <br>
            <input type="submit" value="上传">
        </form>

        <h3>SpringMVC上传方式</h3>

        <form action="/upload/springMvcWay" method="post" enctype="multipart/form-data">
            <input type="file" name="upload" />
            <br>
            <input type="submit" value="上传">
        </form>

        <h3>跨服务器上传方式</h3>

        <form action="/upload/serverWay" method="post" enctype="multipart/form-data">
            <input type="file" name="upload" />
            <br>
            <input type="submit" value="上传">
        </form>
    </body>
</html>
