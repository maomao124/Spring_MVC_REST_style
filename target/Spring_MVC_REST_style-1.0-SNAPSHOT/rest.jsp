<%--
  Created by IntelliJ IDEA.
  Project name(项目名称)：Spring_MVC_REST_style
  File name(文件名): rest
  Author(作者）: mao
  Author QQ：1296193245
  GitHub：https://github.com/maomao124/
  Date(创建日期)： 2022/3/10
  Time(创建时间)： 21:54
  Description(描述)： 无
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>发送GET请求</h4>
<a href="${pageContext.request.contextPath}/user/1">GET</a>


<h4>发送POST请求</h4>
<form action="${pageContext.request.contextPath}/user/2" method="post">
    <input type="submit" value="POST"/>
</form>


<!-- 发送PUT和DELETE请求时，需要添加一个隐藏域 -->
<h4>发送PUT请求</h4>
<form action="${pageContext.request.contextPath}/user/3" method="post">
    <input type="hidden" name="_method" value="PUT"/>
    <input type="submit" value="PUT"/>
</form>


<h4>发送DELETE请求</h4>
<input type="hidden" name="_method" value="DELETE"/>
<form action="${pageContext.request.contextPath}/user/4" method="post">
    <input type="hidden" name="_method" value="DELETE"/>
    <input type="submit" value="DELETE"/>
</form>
</body>
</html>
