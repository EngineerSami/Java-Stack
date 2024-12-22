<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Travel Tracker</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-4">
        <h1>All Travels</h1>
        <a href="#newTravel" class="btn btn-secondary" data-toggle="collapse">Add New Travel</a>
        
        <div id="newTravel" class="collapse mt-3">
            <div class="card">
                <div class="card-header">
                    <h2>New Travel</h2>
                </div>
                <div class="card-body">
                    <form:form action="/Travels" method="post" modelAttribute="Travel">
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
                            <form:label path="description" class="form-label" for="description">description</form:label>
                            <form:errors path="description" cssClass="text-danger" />
                            <form:input path="description" class="form-control" id="description" />
                        </div>
                        <input type="submit" class="btn btn-primary" value="Submit">
                    </form:form>
                </div>
                <div class="card-footer">
                    <a href="/Travels" class="btn btn-secondary">Go Back</a>
                </div>
            </div>
        </div>
        <div class="Travels-table mt-4">
            <table class="table table-hover">
                <thead class="thead-light">
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Expense Name</th>
                    <th scope="col">Vendor</th>
                    <th scope="col">amount</th>
                    <th scope="col">Edit</th> 
                    <th scope="col">Delet</th> 
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${Travels}" var="Travel">
                    <tr>
                        <th scope="row"><c:out value="${Travel.id}" /></th>
                        <td><a href="/Travels/${Travel.id}"><c:out value="${Travel.expenseName}" /></a></td>
                        <td><c:out value="${Travel.vendor}" /></td>
                        <td><c:out value="${Travel.amount}" /></td>
                        <td>
                            <a href="/Travels/edit/${Travel.id}" class="btn btn-primary">Edit</a> 
                        </td>
                        <td>
                            <form action="/Travels/delete/${Travel.id}" method="post">
                                <input type="hidden" name="_method" value="delete">
                                <input type="submit" value="Delete">
                            </form>
                            
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