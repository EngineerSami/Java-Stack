<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register & Login</title>
</head>
<body>
    <h1>Registration and Login</h1>

    <!-- Registration Form -->
    <h2>Register</h2>
    <form action="/register" method="post">
        <div>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" value="${user.username}" required />
            <div style="color: red;" id="username-error">
                <c:if test="${not empty error.user}">
                    ${error.user}
                </c:if>
            </div>
        </div>
        
        <div>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" value="${user.email}" required />
            <div style="color: red;" id="email-error">
                <c:if test="${not empty error.email}">
                    ${error.email}
                </c:if>
            </div>
        </div>

        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required />
            <div style="color: red;" id="password-error">
                <c:if test="${not empty error.password}">
                    ${error.password}
                </c:if>
            </div>
        </div>

        <div>
            <label for="confirmPassword">Confirm Password:</label>
            <input type="password" id="confirmPassword" name="confirmPassword" required />
            <div style="color: red;" id="confirm-password-error">
                <c:if test="${not empty error.confirmPassword}">
                    ${error.confirmPassword}
                </c:if>
            </div>
        </div>

        <button type="submit">Register</button>
    </form>

    <hr>

    <!-- Login Form -->
    <h2>Login</h2>
    <form action="/login" method="post">
        <div>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required />
        </div>

        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required />
        </div>

        <button type="submit">Login</button>

        <c:if test="${not empty error}">
            <div style="color: red;">
                ${error}
            </div>
        </c:if>
    </form>

</body>
</html>
