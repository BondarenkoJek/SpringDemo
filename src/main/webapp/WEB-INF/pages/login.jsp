<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
    <link href="/resources/styles/style.css" rel="stylesheet"/>
</head>
<body>
<form class="form-style" action="/login" method="post">
    <%--<h2>Registration</h2>--%>
    <label for="login">Login</label>
    <input id="login" name="login" type="text"/>

    <label for="password">Password</label>
    <input id="password" name="password" type="password"/>

    <input value="Login" type="submit">
</form>
</body>
</html>