<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Current Time</title>
</head>
<body>
    <h1>Current Time</h1>
    <p><c:out value="${currentTime}"></c:out></p>
</body>
</html>