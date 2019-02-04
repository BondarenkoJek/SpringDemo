<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
    <link href="/resources/styles/login.css" rel="stylesheet"/>
</head>
<body>
<div>
    <form id="loginForm" class="form" action="/login" method="post">
        <h2>Authorization</h2>
        <label for="login">Login</label>
        <input id="login" name="login" type="text"/>

        <label for="password">Password</label>
        <input id="password" name="password" type="password"/>

        <input value="Login" type="submit">
        <div class="div_a"><a href="/registration">registration</a></div>
    </form>
</div>
<script src="/resources/js/jquery-3.3.1.js"></script>
<script src="/resources/js/script.js"></script>
</body>
</html>