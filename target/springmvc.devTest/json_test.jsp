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

            // ajax请求
            $("#aja").click(function () {
                $.ajax({
                    url:"/jsonTest/ajaxTest",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"leo","money":"500000.00"}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        // data为服务器响应的json数据
                    }
                })
            })

            // jackson转换请求
            $("#jackson").click(function () {
                $.ajax({
                    url:"/jsonTest/jacksonTest",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"jackson","money":"500000.00"}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        // data为服务器响应的json数据
                        alert(data);
                        alert(data.username);
                        alert(data.money);
                    }
                })
            })
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
        <button id="aja">点击测试ajax请求</button>
        <br>
        <button id="jackson">点击测试ajax后端jackson转换请求</button>
    </body>
</html>
