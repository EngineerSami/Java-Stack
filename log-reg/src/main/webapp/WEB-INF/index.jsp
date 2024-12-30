<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login & Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/css/style.css">
</head>

<body>
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-8 col-lg-6">
                <div class="card shadow-lg">
                    <div class="card-body">
                        <h2 class="text-center mb-4">Welcome to Our Platform</h2>
                        <p class="text-center">Join our growing community and stay connected!</p>

                        <div class="form-section">
                            <h4 class="text-center">Register</h4>
                            <form:form action="/register" method="post" modelAttribute="newPeople">
                                <div class="mb-3">
                                    <form:label path="peopleName" cssClass="form-label" for="PeopleName">Peoplename</form:label>
                                    <form:input path="peopleName" id="PeopleName" class="form-control" placeholder="Enter your Peoplename" />
                                    <form:errors path="peopleName" cssClass="text-danger" />
                                </div>

                                <div class="mb-3">
                                    <form:label path="email" cssClass="form-label" for="registerEmail">Email</form:label>
                                    <form:input path="email" id="registerEmail" class="form-control" placeholder="Enter your Email" />
                                    <form:errors path="email" cssClass="text-danger" />
                                </div>

                                <div class="mb-3">
                                    <form:label path="password" cssClass="form-label" for="registerPassword">Password</form:label>
                                    <form:input path="password" id="registerPassword" type="password" class="form-control" placeholder="Enter your Password" />
                                    <form:errors path="password" cssClass="text-danger" />
                                </div>

                                <div class="mb-3">
                                    <form:label path="confirm" cssClass="form-label" for="confirmPassword">Confirm Password</form:label>
                                    <form:input path="confirm" id="confirmPassword" type="password" class="form-control" placeholder="Confirm your Password" />
                                    <form:errors path="confirm" cssClass="text-danger" />
                                </div>

                                <div class="d-grid">
                                    <button type="submit" class="btn btn-primary">Register</button>
                                </div>
                            </form:form>
                        </div>

                        <div class="form-section mt-4">
                            <h4 class="text-center">Already have an account? Log in</h4>
                            <form:form action="/login" method="post" modelAttribute="newLogin">
                                <div class="mb-3">
                                    <form:label path="email" cssClass="form-label" for="loginEmail">Email</form:label>
                                    <form:input path="email" id="loginEmail" class="form-control" placeholder="Enter your Email" />
                                    <form:errors path="email" cssClass="text-danger" />
                                </div>

                                <div class="mb-3">
                                    <form:label path="password" cssClass="form-label" for="loginPassword">Password</form:label>
                                    <form:input path="password" id="loginPassword" type="password" class="form-control" placeholder="Enter your Password" />
                                    <form:errors path="password" cssClass="text-danger" />
                                </div>

                                <div class="d-grid">
                                    <button type="submit" class="btn btn-success">Log In</button>
                                </div>
                            </form:form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>