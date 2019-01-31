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
                <td><a href="/developer/info/${developer.id}">Info</a></td>
                <td>
                    <form id="deleteDeveloper" action="/developer/delete/">
                        <input name="id" value="${developer.id}" type="submit"/>
                    </form>
                </td>
                <td><a href="/developer/delete/${developer.id}">Remove</a></td>
            </tr>
        </c:forEach>

    </table>
    <a href="/developer/create">Create new developer</a>
</div>
<script src="/resources/js/script.js"/>
</body>
</html>
