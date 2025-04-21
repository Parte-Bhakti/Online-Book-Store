<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - Online Bookstore</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f1e4; /* Cream Background */
            margin: 0;
            padding: 0;
            color: #3e4b5b; /* Slate Gray Text */
        }

        header {
            background-color: #2a9d8f; /* Teal Header Background */
            color: #fefae0; /* Light Cream Header Text */
            padding: 15px;
            text-align: center;
            font-size: 28px;
        }

        nav {
            display: flex;
            justify-content: center;
            background-color: #264653; /* Deep Green Navigation Bar */
            padding: 10px;
        }

        nav a {
            text-decoration: none;
            color: #fefae0; /* Light Cream Text */
            margin: 0 15px;
            font-size: 18px;
            padding: 8px 15px;
            border-radius: 5px;
        }

        nav a:hover {
            background-color: #e76f51; /* Orange Hover Effect */
            color: #f8f1e4; /* Cream Text on Hover */
        }

        .login-container {
            background-color: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            width: 300px;
            margin: 50px auto;
            text-align: center;
        }

        .login-container h1 {
            color: #2a9d8f; /* Teal Header */
        }

        .login-container input {
            padding: 10px;
            margin: 10px 0;
            border: 2px solid #e76f51;
            border-radius: 5px;
            width: 100%;
        }

        .login-container button {
            background-color: #e76f51;
            color: white;
            border: none;
            padding: 10px;
            width: 100%;
            border-radius: 5px;
            cursor: pointer;
        }

        .login-container button:hover {
            background-color: #f4a261;
        }

        .login-container a {
            color: #264653;
            text-decoration: none;
        }

        .login-container a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <header><b>Login to Your Account</b></header>
    <nav>
        <a href="index.jsp">Home</a>
        <a href="books.jsp">Books</a>
        <a href="cart.jsp">Cart</a>
        <a href="login.jsp">Login</a>
        <a href="aboutus.jsp">About Us</a>
    </nav>

    <div class="login-container">
        <h1>Login</h1>
        <form action="login.jsp" method="post">
            <input type="text" name="username" placeholder="Username" required>
            <input type="password" name="password" placeholder="Password" required>
            <button type="submit">Login</button>
        </form>
        <%
            // Check if the form is submitted
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if (username != null && password != null) {
                try {
                    // Database connection
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhaktiparte5329", "root", "Bhakti#123");

                    // Query to match entered username and password
                    PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
                    ps.setString(1, username);
                    ps.setString(2, password);
                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) {
                        // If credentials are valid, set the user_id in the session
                        int userId = rs.getInt("id");
                        session.setAttribute("user_id", userId);

                        // Redirect to the books page after successful login
                        response.sendRedirect("books.jsp");
                    } else {
                        out.println("<p style='color:red;'>Invalid credentials, please try again.</p>");
                    }

                    rs.close();
                    ps.close();
                    con.close();
                } catch (Exception e) {
                    out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
                }
            }
        %>
        <p>Don't have an account? <a href="registration.jsp">Register here</a></p>
    </div>
</body>
</html>
