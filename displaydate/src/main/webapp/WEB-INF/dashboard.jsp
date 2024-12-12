<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <script type="text/javascript" src="script.js"></script>
</head>
<body>
    <h1>Welcome to the Dashboard</h1>
    <div class="links">
        <a href="/date" onclick="showAlert('Date')">Current Date</a>
        <a href="/time" onclick="showAlert('Time')">Current Time</a>
    </div>
</body>
</html>