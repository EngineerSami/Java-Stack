<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Increment Counter</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='styles.css' />">
</head>
<body>
    <div class="container">
        <h1>Welcome!</h1>
        <p>The visit counter has been incremented. Check the current count <a href="/counter">here</a>.</p>
    </div>
</body>
</html>
