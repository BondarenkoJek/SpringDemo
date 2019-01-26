<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id= "developer" scope= "page"
             class= "ua.bondarenkojek.model.Developer" type= "ua.bondarenkojek.model.Developer"/>
<html>
<head>
    <title>developer</title>
</head>
<body>
${developer.id}
</body>
</html>
