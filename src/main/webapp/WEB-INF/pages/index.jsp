<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>MateAcademy</title>
    <link href="/resources/styles/style.css" rel="stylesheet"/>
</head>
<body>
<div>
    <table class="table_blur">
        <tr>
            <th>Name</th>
            <th>Info</th>
            <th>Edit</th>
            <th>Remove</th>
        </tr>
        <c:forEach var="developer" items="${developers}">
            <tr>
                <td>${developer.name}</td>
                <td><a href="/developer/info/${developer.id}">info</a></td>
                <td><a href="/developer/info/${developer.id}">edit</a></td>
                <td>
                    <form class="deleteForm">
                        <button type="submit" name="delete" value="${developer.id}">delete</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>

    <a href="/developer/create">Create new developer</a>
</div>

<script src="/resources/js/jquery-3.3.1.js"></script>
<script src="/resources/js/script.js"></script>
</body>
</html>
