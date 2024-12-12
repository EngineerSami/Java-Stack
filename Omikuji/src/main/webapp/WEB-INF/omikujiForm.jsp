<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Omikuji Form</title>
</head>
<body>
    <h1>Send an Omikuji!</h1>
    <form action="/omikuji/process" method="POST">
        <label>Pick any number from 5 to 25:</label><br>
        <input type="number" name="number" min="5" max="25" required><br><br>

        <label>Enter the name of any city:</label><br>
        <input type="text" name="city" required><br><br>

        <label>Enter the name of any real person:</label><br>
        <input type="text" name="person" required><br><br>

        <label>Enter professional endeavor or hobby:</label><br>
        <input type="text" name="hobby" required><br><br>

        <label>Enter any type of living thing:</label><br>
        <input type="text" name="livingThing" required><br><br>

        <label>Say something nice to someone:</label><br>
        <textarea name="niceMessage" required></textarea><br><br>

        <button type="submit">Send</button>
    </form>
</body>
</html>
