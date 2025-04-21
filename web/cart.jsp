<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cart - Online Bookstore</title>
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
        .cart-container {
            width: 80%;
            margin: 20px auto;
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
        }
        .cart-item {
            display: flex;
            align-items: center;
            justify-content: space-between;
            padding: 10px;
            border-bottom: 1px solid #ccc;
        }
        .cart-item:last-child {
            border-bottom: none;
        }
        .cart-item h3 {
            margin: 0;
            color: #264653;
        }
        .cart-item p {
            margin: 5px 0;
            color: #2a9d8f;
        }
        .remove-btn, .buy-btn {
            background-color: #e76f51;
            color: white;
            border: none;
            padding: 8px 12px;
            border-radius: 5px;
            cursor: pointer;
        }
        .remove-btn:hover, .buy-btn:hover {
            background-color: #f4a261;
        }
    </style>
</head>
<body>

    <header><b>Shopping Cart</b></header>

    <div class="cart-container">
        <h2>Your Cart</h2>

        <%
            String title = request.getParameter("title");
            String author = request.getParameter("author");
            String price = request.getParameter("price");

            if (title != null && author != null && price != null) {
        %>
            <div class="cart-item">
                <div>
                    <h3><%= title %></h3>
                    <p>Author: <%= author %></p>
                    <p>Price: ₹<%= price %></p>
                </div>
                <div>
                    <button class="remove-btn" onclick="removeFromCart()">Remove</button>
                    <button class="buy-btn" onclick="buyBook()">Buy</button>
                </div>
            </div>
        <% } else { %>
            <p>Your cart is empty.</p>
        <% } %>
    </div>

    <script>
        function removeFromCart() {
            window.location.href = "cart.jsp"; // Reload without parameters
        }

        function buyBook() {
            // Redirect to buy.jsp with book details as parameters
            var title = "<%= title %>";
            var author = "<%= author %>";
            var price = "<%= price %>";
            window.location.href = "buy.jsp?title=" + encodeURIComponent(title) + "&author=" + encodeURIComponent(author) + "&price=" + encodeURIComponent(price);
        }
    </script>

</body>
</html>
