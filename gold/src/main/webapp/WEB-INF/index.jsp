<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ninja Gold Game</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <h1>Ninja Gold Game</h1>
        <h3>Your Gold: <span>${sessionScope.gold}</span></h3>

        <div class="actions">
            <form action="/process_gold" method="POST">
                <input type="hidden" name="building" value="farm">
                <button type="submit">Find Gold at the Farm</button>
            </form>
            <form action="/process_gold" method="POST">
                <input type="hidden" name="building" value="cave">
                <button type="submit">Find Gold in the Cave</button>
            </form>
            <form action="/process_gold" method="POST">
                <input type="hidden" name="building" value="house">
                <button type="submit">Find Gold in the House</button>
            </form>
            <form action="/process_gold" method="POST">
                <input type="hidden" name="building" value="quest">
                <button type="submit">Go on a Quest</button>
            </form>
        </div>

        <div class="activities">
            <h3>Activities:</h3>
            <ul>
                <c:forEach var="activity" items="${sessionScope.activities}">
                    <li>${activity}</li>
                </c:forEach>
            </ul>
        </div>
    </div>
</body>
</html>
