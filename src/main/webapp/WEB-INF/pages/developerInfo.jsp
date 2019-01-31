<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>developer</title>
    <link href="/resources/styles/style.css" rel="stylesheet"/>
</head>
<body>
<div>
    <table class="table_blur">

        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Salary</th>
        </tr>
        <tr>
            <td>${developer.id}</td>
            <td>${developer.name}</td>
            <td>${developer.age}</td>
            <td>${developer.salary}</td>
        </tr>

    </table>
    <a href="/developer/">Developers</a>
</div>
</body>
</html>
