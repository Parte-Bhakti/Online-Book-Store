<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Online Bookstore</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f8f1e4; 
            margin: 0;
            padding: 0;
            color: #3e4b5b; 
        }

        header {
            text-align: center;
            padding: 20px;
            background: #2a9d8f; 
            color: #fefae0; 
        }

        header h1 {
            font-size: 48px;
            font-weight: bold;
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
            background: transparent; 
        }

        nav a:hover {
            background-color: #e76f51;
            color: #f8f1e4; 
        }

        .hero-section {
            text-align: center;
            color: #fefae0; 
            padding: 150px 20px;
            background: url('images/hero-book1.jpg') no-repeat center center / cover; 
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.4);
        }

        .hero-section h1 {
            font-size: 48px;
            margin-bottom: 20px;
        }

        .hero-section button {
            background-color: #e76f51;
            color: #fefae0; 
            font-size: 18px;
            padding: 15px 30px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .hero-section button:hover {
            background-color: #f4a261; 
        }

        .bestsellers {
            padding: 50px 0;
            text-align: center;
            background: url('images/bg.jpg') no-repeat center center / cover; 
            color: #fefae0; 
        }

        .bestsellers h2 {
            font-size: 36px;
            margin-bottom: 20px;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.4);
        }

        .bestsellers .books-container {
            display: flex; 
            justify-content: center; 
            gap: 20px; 
            flex-wrap: wrap; 
            padding: 50px;
        }

        .book-card {
            background: rgba(255, 255, 255, 0.8); 
            padding: 15px;
            border-radius: 10px;
            text-align: center;
            color: #264653; 
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.2);
        }

        .book-card img {
           border: 2px solid #e76f51; 
           border-radius: 10px;
           width: 150px;
           height: 200px;
        }

        footer {
            background-color: #264653; 
            text-align: center;
            padding: 10px;
            color: #fefae0; 
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>
<body>
    <header>
        <h1>Welcome to Our Online Bookstore 📚</h1>
    </header>

    <nav>
        <a href="index.jsp">Home</a>
        <a href="books.jsp" class="box-link">Books</a>
        <a href="cart.jsp">Cart</a>
        <a href="login.jsp">Login</a>
        <a href="aboutus.jsp">About Us</a>
    </nav>

    <div class="hero-section">
        <h1>Explore Our Wide Collection of Books</h1>
        <button onclick="window.location.href='books.jsp'">Browse Books</button>
    </div>

    <div class="bestsellers">
        <h2>Best Selling Books</h2>
        <div class="books-container">
            <div class="book-card fiction">
                 <img src="images/fiction2.jpg" alt="Pride and Prejudice">
                 <h3>Pride and Prejudice</h3>
                 <p>Author: Jane Austen</p>
                 <p>Price: ₹250</p>
                 <p>A classic romance novel exploring themes of class and marriage.</p>
            </div>
            <div class="book-card nonfiction">
                 <img src="images/nonfiction1.jpg" alt="Sapiens">
                 <h3>Sapiens</h3>
                 <p>Author: Yuval Noah Harari</p>
                 <p>Price: ₹499</p>
                 <p>A historical exploration of humanity's evolution and societies.</p>
            </div>
            <div class="book-card children">
                <img src="images/children3.jpg" alt="Harry Potter and the Philosopher's Stone">
                <h3>Harry Potter and the Philosopher's Stone</h3>
                <p>Author: J.K. Rowling</p>
                <p>Price: ₹450</p>
                <p>The first book in the magical Harry Potter series.</p>
            </div>
        </div>
    </div>

    <footer>
        <p>© 2025 Online Bookstore</p>
    </footer>
</body>
</html>
