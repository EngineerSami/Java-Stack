<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <title>Create New Course</title>
</head>
<body>
    <h1>Create New Course</h1>
    <form action="/courses/new" method="post" th:object="${course}">
        <label>Course Name:</label>
        <input type="text" th:field="*{name}" />
        <button type="submit">Create Course</button>
    </form>
    <a href="/courses/">Back to Courses</a>
</body>
</html>