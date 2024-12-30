<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <title>Create New User</title>
</head>
<body>
    <h1>Create New User</h1>
    <form action="/users/new" method="post" th:object="${user}">
        <label>Name:</label>
        <input type="text" th:field="*{name}" />
        <button type="submit">Create User</button>
    </form>
    <a href="/users/">Back to Users</a>
</body>
</html>
