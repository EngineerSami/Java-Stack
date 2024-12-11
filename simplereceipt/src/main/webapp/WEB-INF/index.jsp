<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Purchase Receipt</title>
</head>
<body>
    <h1>Purchase Receipt</h1>
    <p><strong>Customer Name:</strong> <c:out value="${name}"></c:out></p>
    <p><strong>Item:</strong> <c:out value="${itemName}" ></c:out></p>
    <p><strong>Price:</strong> $<c:out value="${price}" ></c:out></p>
    <p><strong>Description:</strong> <c:out value="${description}" ></c:out></p>
    <p><strong>Vendor:</strong> <c:out value="${vendor}" ></c:out></p>
</body>
</html>
