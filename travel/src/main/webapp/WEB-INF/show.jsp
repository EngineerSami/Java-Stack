<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Show Travel</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-4">
        <h1>Show Travel</h1>
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">Expense Name: <c:out value="${Travel.expenseName}" /></h5>
                <p class="card-text"><strong>Vendor:</strong> <c:out value="${Travel.vendor}" /></p>
                <p class="card-text"><strong>Amount:</strong> <c:out value="${Travel.amount}" /></p>
                <p class="card-text"><strong>Description:</strong> <c:out value="${Travel.description}" /></p>
            </div>
        </div>
        <a href="/Travels" class="btn btn-secondary mt-3">Go Back</a>
        <a href="/Travels/edit/${Travel.id}" class="btn btn-primary mt-3">Edit</a>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>