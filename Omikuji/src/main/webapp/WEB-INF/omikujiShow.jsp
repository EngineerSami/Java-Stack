<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Your Omikuji</title>
</head>
<body>
    <h1>Here's Your Omikuji!</h1>
    <p>
        In <span>${number}</span> years, you will live in <span>${city}</span> with <span>${person}</span> as your roommate, <span>${hobby}</span> for a living. The next time you see a <span>${livingThing}</span>, you will have good luck. Also, <span>${niceMessage}</span>.
    </p>
    <a href="/omikuji">Go Back</a>
</body>
</html>
