<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Create New Book</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.css" />
    <link rel="stylesheet" href="/css/styles.css" />

</head>
<body>
    <div class="form-container">
        <div class="form-content">
            <h2>New Book</h2>
            <form:form action="/books" method="post" modelAttribute="book">
                <div class="mb-3">
                    <form:label path="title" class="form-label" for="title">Title</form:label>
                    <form:errors path="title" cssClass="error" />
                    <form:input path="title" class="form-control" id="title" />
                </div>
                <div class="mb-3">
                    <form:errors path="description" cssClass="error" />
                    <form:label  path="description" class="form-label" for="description">Description</form:label>
                    <form:input  path="description" class="form-control" id="description" />
                </div>
                <div class="mb-3">
                    <form:label path="language" class="form-label" for="language">Language</form:label>
                    <form:errors path="language" cssClass="error" />
                    <form:input path="language" class="form-control" id="language" />
                </div>
                <div class="mb-3">
                    <form:label path="numberOfPages" class="form-label" for="numberOfPages">Number of Pages</form:label>
                    <form:errors path="numberOfPages" cssClass="error" />
                    <form:input path="numberOfPages" class="form-control" id="numberOfPages" />
                </div>
                <input type="submit" class="btn btn-primary" value="Submit">
            </form:form>
        </div>
        <a href="/books" class="btn btn-secondary">Go Back</a>
    </div>

    <script src="/webjars/bootstrap/js/bootstrap.js"></script>
    <script src="/js/script.js"></script>
</body>
</html>