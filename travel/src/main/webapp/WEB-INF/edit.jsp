<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Edit Travel</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-4">
        <h1>Edit Travel</h1>
        <form:form action="/Travels/${Travel.id}" method="post" modelAttribute="Travel">
            <div class="form-group">
                <form:label path="expenseName" class="form-label" for="expenseName">Expense Name</form:label>
                <form:errors path="expenseName" cssClass="text-danger" />
                <form:input path="expenseName" class="form-control" id="expenseName" />
            </div>
            <div class="form-group">
                <form:label path="vendor" class="form-label" for="vendor">Vendor</form:label>
                <form:errors path="vendor" cssClass="text-danger" />
                <form:input path="vendor" class="form-control" id="vendor" />
            </div>
            <div class="form-group">
                <form:label path="amount" class="form-label" for="amount">amount</form:label>
                <form:errors path="amount" cssClass="text-danger" />
                <form:input path="amount" class="form-control" id="amount" />
            </div>
            <div class="form-group">
                <form:label path="description" class="form-label" for="description">Description</form:label>
                <form:errors path="description" cssClass="text-danger" />
                <form:input path="description" class="form-control" id="description" />
            </div>
            <input type="submit" class="btn btn-primary" value="Update">
        </form:form>
        <a href="/Travels" class="btn btn-secondary mt-3">Go Back</a>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>