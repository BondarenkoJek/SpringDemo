<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <link href="/resources/styles/registration.css" rel="stylesheet"/>
    <script src="/resources/js/jquery-3.3.1.js"></script>
</head>
<body>
<div>
    <form id="registrationForm" class="form" method="post">
        <h2>Registration</h2>
        <label for="login">Login</label>
        <input id="login" name="login" type="text"/>

        <label for="email">Email</label>
        <input id="email" name="email" type="email"/>

        <label for="password">Password</label>
        <input id="password" name="password" type="password"/>

        <input value="Create your account" type="submit">

        <div class="div_a">Already have an account?<a href="/">login</a></div>
    </form>
</div>

<script src="/resources/js/registration.js"></script>
</body>
</html>
