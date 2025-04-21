<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bill - Online Bookstore</title>
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
        .bill-container {
            width: 80%;
            margin: 20px auto;
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
        }
        .bill-item {
            padding: 10px;
            border-bottom: 1px solid #ccc;
        }
        .bill-item:last-child {
            border-bottom: none;
        }
        .bill-item h3 {
            margin: 0;
            color: #264653;
        }
        .bill-item p {
            margin: 5px 0;
            color: #2a9d8f;
        }
    </style>
</head>
<body>

    <header><b>Bill - Online Bookstore</b></header>

    <div class="bill-container">
        <h2>Purchase Details</h2>

        <%
            // Check if user is logged in
            Integer userId = (Integer) session.getAttribute("user_id");
            if (userId == null) {
                // Redirect to login page if not logged in
                response.sendRedirect("login.jsp");
                return;
            }
            
            String title = request.getParameter("title");
            String author = request.getParameter("author");
            String price = request.getParameter("price");

            if (title != null && author != null && price != null) {
        %>
            <div class="bill-item">
                <h3><%= title %></h3>
                <p>Author: <%= author %></p>
                <p>Price: ₹<%= price %></p>
            </div>
            <div class="bill-item">
                <h3>Total Bill:</h3>
                <p>₹<%= price %></p>
            </div>
        <% } else { %>
            <p>No book details available. Something went wrong!</p>
        <% } %>
    </div>

</body>
</html>
