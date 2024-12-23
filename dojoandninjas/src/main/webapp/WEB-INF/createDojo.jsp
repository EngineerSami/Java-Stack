<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Dojo</title>
</head>
<body>
    <h1>Create New Dojo</h1>
    <form action="${pageContext.request.contextPath}/api/dojos" method="post">
        <label for="dojoName">Dojo Name:</label>
        <input type="text" id="dojoName" name="name" required><br>

        <button type="submit">Add Dojo</button>
    </form>
    <a href="${pageContext.request.contextPath}/">Back to Home</a>
</body>
</html>