<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Create Ninja</title>
</head>
<body>
    <h1>Create New Ninja</h1>
    <form action="${pageContext.request.contextPath}/api/ninjas" method="post">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" required><br>

        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" required><br>

        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required><br>

        <label for="dojoSelect">Select Dojo:</label>
        <select id="dojoSelect" name="dojoId" required>
            <c:forEach var="dojo" items="${dojos}">
                <option value="${dojo.id}">${dojo.name}</option>
            </c:forEach>
        </select><br>

        <button type="submit">Add Ninja</button>
    </form>
    <a href="${pageContext.request.contextPath}/">Back to Home</a>
</body>
</html>