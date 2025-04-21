<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration - Online Bookstore</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f1e4;
            margin: 0;
            padding: 0;
            color: #3e4b5b;
        }

        header {
            background-color: #2a9d8f;
            color: #fefae0;
            padding: 15px;
            text-align: center;
            font-size: 28px;
        }

        nav {
            display: flex;
            justify-content: center;
            background-color: #264653;
            padding: 10px;
        }

        nav a {
            text-decoration: none;
            color: #fefae0;
            margin: 0 15px;
            font-size: 18px;
            padding: 8px 15px;
            border-radius: 5px;
        }

        nav a:hover {
            background-color: #e76f51;
            color: #f8f1e4;
        }

        .registration-form {
            max-width: 400px;
            margin: 50px auto;
            padding: 20px;
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }

        .registration-form h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #2a9d8f;
        }

        .registration-form input {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #e76f51;
            border-radius: 5px;
        }

        .registration-form button {
            width: 100%;
            padding: 10px;
            background-color: #e76f51;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }

        .registration-form button:hover {
            background-color: #f4a261;
        }

        .message {
            text-align: center;
            margin-top: 20px;
        }

        .message a {
            color: #264653;
            text-decoration: none;
        }

        .message a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <header><b>Register for an Account</b></header>
    <nav>
        <a href="index.jsp">Home</a>
        <a href="books.jsp">Books</a>
        <a href="cart.jsp">Cart</a>
        <a href="login.jsp">Login</a>
        <a href="aboutus.jsp">About Us</a>
    </nav>

    <div class="registration-form">
        <h2>Sign Up</h2>
        <form action="registration.jsp" method="post">
            <input type="text" name="username" placeholder="Username" required>
            <input type="email" name="email" placeholder="Email" required>
            <input type="password" name="password" placeholder="Password" required>
            <button type="submit">Register</button>
        </form>

        <%
            // Retrieve form data
            String username = request.getParameter("username");
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            if (username != null && email != null && password != null) {
                try {
                    // Database connection details
                    String dbURL = "jdbc:mysql://localhost:3306/bhaktiparte5329";
                    String dbUser = "root";
                    String dbPassword = "Bhakti#123";

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(dbURL, dbUser, dbPassword);

                    // Check if username already exists
                    String checkQuery = "SELECT * FROM users WHERE username = ?";
                    PreparedStatement checkStmt = con.prepareStatement(checkQuery);
                    checkStmt.setString(1, username);
                    ResultSet checkRs = checkStmt.executeQuery();

                    if (checkRs.next()) {
                        out.println("<p style='color:red;'>Username already exists! Please choose a different one.</p>");
                    } else {
                        // Insert the new user into the database
                        String insertQuery = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
                        PreparedStatement ps = con.prepareStatement(insertQuery);
                        ps.setString(1, username);
                        ps.setString(2, email);
                        ps.setString(3, password); // Save password as plain text

                        int rowsAffected = ps.executeUpdate();

                        if (rowsAffected > 0) {
                            out.println("<p style='color:green;'>Registration successful! <a href='login.jsp'>Login here</a></p>");
                        } else {
                            out.println("<p style='color:red;'>Error during registration, please try again.</p>");
                        }
                    }

                    // Close connections
                    checkRs.close();
                    checkStmt.close();
                    con.close();
                } catch (Exception e) {
                    out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
                }
            }
        %>
    </div>

    <div class="message">
        <p>Already have an account? <a href="login.jsp">Login here</a></p>
    </div>
</body>
</html>
