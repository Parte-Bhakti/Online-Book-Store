<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Us - Online Bookstore</title>
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

        .contact-container {
            padding: 30px;
            text-align: center;
        }

        .contact-container h2 {
            color: #2a9d8f; /* Teal Text */
            font-size: 36px;
            margin-bottom: 20px;
        }

        .contact-container p {
            font-size: 18px;
            line-height: 1.6;
            margin: 20px 0;
        }

        .contact-form {
            display: flex;
            flex-direction: column;
            align-items: center;
            margin-top: 30px;
        }

        .contact-form input, .contact-form textarea {
            width: 80%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .contact-form button {
            width: 80%;
            padding: 10px;
            background-color: #ff69b4; /* Hot pink */
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }

        .contact-form button:hover {
            background-color: #ffb6c1; /* Lighter pink on hover */
        }

        footer {
            background-color: #264653; /* Deep Green Footer Background */
            color: #fefae0; /* Light Cream Text */
            padding: 10px;
            text-align: center;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>
<body>
    <header><b>Contact Us</b></header>
    <nav>
        <a href="index.jsp">Home</a>
        <a href="books.jsp">Books</a>
        <a href="cart.jsp">Cart</a>
        <a href="login.jsp">Login</a>
        <a href="aboutus.jsp">About Us</a>
        <a href="contact.jsp">Contact Us</a>
    </nav>

    <div class="contact-container">
        <h2>Get in Touch</h2>
        <p>If you have any questions, feedback, or suggestions, we would love to hear from you! Please fill out the form below, and we will get back to you as soon as possible.</p>

        <div class="contact-form">
            <form action="sendMessage.jsp" method="post">
                <input type="text" name="name" placeholder="Your Name" required>
                <input type="email" name="email" placeholder="Your Email" required>
                <textarea name="message" placeholder="Your Message" rows="5" required></textarea>
                <button type="submit">Send Message</button>
            </form>
        </div>
    </div>

    <footer>
        <p>© 2025 Online Bookstore</p>
    </footer>
</body>
</html>
