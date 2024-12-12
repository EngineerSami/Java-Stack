<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Visit Counter</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='styles.css' />">
</head>
<body>
    <h1>Page Visit Counter</h1>
    <p>The page has been visited <strong>${visitCount}</strong> times during your session.</p>
    <a href="/">Go back to the main page</a>
</body>
</html>
