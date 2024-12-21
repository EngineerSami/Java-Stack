<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Burger Tracker</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-4">
        <h1>All Burgers</h1>
        <a href="#newBurger" class="btn btn-secondary" data-toggle="collapse">Add New Burger</a>
        
        <div id="newBurger" class="collapse mt-3">
            <div class="card">
                <div class="card-header">
                    <h2>New Burger</h2>
                </div>
                <div class="card-body">
                    <form:form action="/burgers" method="post" modelAttribute="burger">
                        <div class="form-group">
                            <form:label path="burgerName" class="form-label" for="burgerName">Burger Name</form:label>
                            <form:errors path="burgerName" cssClass="text-danger" />
                            <form:input path="burgerName" class="form-control" id="burgerName" />
                        </div>
                        <div class="form-group">
                            <form:label path="restaurantName" class="form-label" for="restaurantName">Restaurant Name</form:label>
                            <form:errors path="restaurantName" cssClass="text-danger" />
                            <form:input path="restaurantName" class="form-control" id="restaurantName" />
                        </div>
                        <div class="form-group">
                            <form:label path="rating" class="form-label" for="rating">Rating (1-5)</form:label>
                            <form:errors path="rating" cssClass="text-danger" />
                            <form:input path="rating" class="form-control" id="rating" />
                        </div>
                        <div class="form-group">
                            <form:label path="description" class="form-label" for="description">description</form:label>
                            <form:errors path="description" cssClass="text-danger" />
                            <form:input path="description" class="form-control" id="description" />
                        </div>
                        <input type="submit" class="btn btn-primary" value="Submit">
                    </form:form>
                </div>
                <div class="card-footer">
                    <a href="/burgers" class="btn btn-secondary">Go Back</a>
                </div>
            </div>
        </div>
        <div class="burgers-table mt-4">
            <table class="table table-hover">
                <thead class="thead-light">
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Burger Name</th>
                    <th scope="col">Restaurant Name</th>
                    <th scope="col">Rating</th>
                    <th scope="col">Actions</th> 
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${burgers}" var="burger">
                    <tr>
                        <th scope="row"><c:out value="${burger.id}" /></th>
                        <td><c:out value="${burger.burgerName}" /></td>
                        <td><c:out value="${burger.restaurantName}" /></td>
                        <td><c:out value="${burger.rating}" /></td>
                        <td>
                            <a href="/burgers/edit/${burger.id}" class="btn btn-primary">Edit</a> 
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>