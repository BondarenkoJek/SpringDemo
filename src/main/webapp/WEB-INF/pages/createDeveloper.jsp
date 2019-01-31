<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
    <link href="/resources/styles/style.css" rel="stylesheet"/>
</head>
<body>
<form class="form-style" action="/developer/create" method="post">
    <h2>Create developer</h2>
    <label for="name">Name</label>
    <input id="name" name="name" type="text"/>

    <label for="age">Age</label>
    <input id="age" name="age" type="number"/>

    <label for="salary">Salary</label>
    <input id="salary" name="salary" type="number"/>

    <input value="Create developer" type="submit">
</form>
</body>
</html>
