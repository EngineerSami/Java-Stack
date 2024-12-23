<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Ninja and Dojo Management</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        h1 {
            color: #333;
        }
        a {
            display: inline-block;
            margin: 10px 0;
            padding: 10px 15px;
            background-color: #007BFF;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }
        a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>Ninja and Dojo Management</h1>
    <a href="${pageContext.request.contextPath}/api/ninjas/create">Create New Ninja</a><br>
    <a href="${pageContext.request.contextPath}/api/dojos/create">Create New Dojo</a><br><br>

    <h2>List of Dojos</h2>
    <ul>
        <c:forEach var="dojo" items="${dojos}">
            <li>
                <a href="${pageContext.request.contextPath}/api/dojos/${dojo.id}">${dojo.name}</a>
            </li>
        </c:forEach>
    </ul>
</body>
</html>