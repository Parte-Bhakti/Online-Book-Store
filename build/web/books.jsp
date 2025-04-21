<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Books - Online Bookstore</title>
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

        .search-container {
            text-align: center;
            margin: 20px 0;
        }

        .search-container input {
            padding: 10px;
            width: 300px;
            border: 2px solid #e76f51;
            border-radius: 5px;
            font-size: 16px;
        }

        .search-container button {
            padding: 10px 15px;
            background-color: #e76f51;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }

        .search-container button:hover {
            background-color: #f4a261;
        }

        .categories-container {
            text-align: center;
            margin: 20px 0;
        }

        .categories-container button {
            padding: 10px 15px;
            background-color: #2a9d8f;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            margin: 5px;
            cursor: pointer;
        }

        .categories-container button:hover {
            background-color: #f4a261;
        }

        .books-container {
            display: flex;
            flex-direction: column;
            padding: 80px;
            gap: 20px;
            align-items: center;
            margin: 20px;
        }

        .book-card {
            display: flex;
            align-items: center;
            background-color: white;
            padding: 10px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
            width: 90%;
            max-width: 800px;
        }

        .book-card img {
            width: 120px;
            height: auto;
            margin-right: 20px;
            border-radius: 5px;
            border: 2px solid #e76f51;
        }

        .book-card h3 {
            font-size: 18px;
            margin: 0 0 5px;
            color: #264653;
        }

        .book-card p {
            margin: 5px 0;
            color: #2a9d8f;
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
    <script>
        function addToCart(title) {
            const xhr = new XMLHttpRequest();
            xhr.open("POST", "addToCart", true);
            xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
            xhr.onload = function () {
                if (xhr.status === 200) {
                    alert(xhr.responseText);
                } else {
                    alert("Failed to add the book to the cart.");
                }
            };
            xhr.send("title=" + encodeURIComponent(title));
        }

        function filterBooks(category) {
            const books = document.querySelectorAll(".book-card");
            books.forEach(book => {
                book.style.display = book.classList.contains(category) ? "flex" : "none";
            });
        }

        function showAllBooks() {
            const books = document.querySelectorAll(".book-card");
            books.forEach(book => {
                book.style.display = "flex";
            });
        }

        function searchBooks() {
            const query = document.querySelector(".search-container input").value.toLowerCase();
            const books = document.querySelectorAll(".book-card");

            books.forEach(book => {
                const title = book.querySelector("h3").textContent.toLowerCase();
                const author = book.querySelector("p:nth-of-type(1)").textContent.toLowerCase();
                const description = book.querySelector("p:nth-of-type(3)").textContent.toLowerCase();

                if (title.includes(query) || author.includes(query) || description.includes(query)) {
                    book.style.display = "flex";
                } else {
                    book.style.display = "none";
                }
            });
        }
    </script>
</head>
<body>
    <header><b>Explore Our Books</b></header>
    <nav>
        <a href="index.jsp">Home</a>
        <a href="books.jsp">Books</a>
        <a href="cart.jsp">Cart</a>
        <a href="login.jsp">Login</a>
        <a href="aboutus.jsp">About Us</a>
    </nav>

    <div class="search-container">
        <input type="text" placeholder="Search books by title, author, or genre...">
        <button onclick="searchBooks()">Search</button>
    </div>

    <div class="categories-container">
        <button onclick="filterBooks('fiction')">Fiction</button>
        <button onclick="filterBooks('nonfiction')">Non-Fiction</button>
        <button onclick="filterBooks('science')">Science</button>
        <button onclick="filterBooks('history')">History</button>
        <button onclick="filterBooks('children')">Children's Books</button>
        <button onclick="showAllBooks()">Show All</button>
    </div>


    <div class="books-container">
    <!-- Fiction Books -->
    <div class="book-card fiction">
        <img src="images/fiction1.jpg" alt="The Alchemist">
        <div class="book-details">
            <h3>The Alchemist</h3>
            <p>Author: Paulo Coelho</p>
            <p>Price: ₹399</p>
            <p>A mystical story about pursuing one’s dreams.</p>
            <button onclick="addToCart('The Alchemist', 'Paulo Coelho', '399', 'images/fiction1.jpg')">Add to Cart</button>
        </div>
    </div>

    <div class="book-card fiction">
        <img src="images/fiction2.jpg" alt="Pride and Prejudice">
        <div class="book-details">
            <h3>Pride and Prejudice</h3>
            <p>Author: Jane Austen</p>
            <p>Price: ₹250</p>
            <p>A classic romance novel exploring themes of class and marriage.</p>
            <button onclick="addToCart('Pride and Prejudice', 'Jane Austen', '250', 'images/fiction2.jpg')">Add to Cart</button>
        </div>
    </div>

    <!-- Non-Fiction Books -->
    <div class="book-card nonfiction">
        <img src="images/nonfiction1.jpg" alt="Sapiens">
        <div class="book-details">
            <h3>Sapiens</h3>
            <p>Author: Yuval Noah Harari</p>
            <p>Price: ₹499</p>
            <p>A historical exploration of humanity's evolution and societies.</p>
            <button onclick="addToCart('Sapiens', 'Yuval Noah Harari', '499', 'images/nonfiction1.jpg')">Add to Cart</button>
        </div>
    </div>

    <div class="book-card nonfiction">
        <img src="images/nonfiction2.jpg" alt="The Psychology of Money">
        <div class="book-details">
            <h3>The Psychology of Money</h3>
            <p>Author: Morgan Housel</p>
            <p>Price: ₹305</p>
            <p>Lessons on wealth, greed, and happiness.</p>
            <button onclick="addToCart('The Psychology of Money', 'Morgan Housel', '305', 'images/nonfiction2.jpg')">Add to Cart</button>
        </div>
    </div>

    <!-- Science Books -->
    <div class="book-card science">
        <img src="images/science1.jpg" alt="Brief Answers to the Big Questions">
        <div class="book-details">
            <h3>Brief Answers to the Big Questions</h3>
            <p>Author: Stephen Hawking</p>
            <p>Price: ₹450</p>
            <p>Insights into big questions about the universe and humanity’s future.</p>
            <button onclick="addToCart('Brief Answers to the Big Questions', 'Stephen Hawking', '450', 'images/science1.jpg')">Add to Cart</button>
        </div>
    </div>

    <div class="book-card science">
        <img src="images/science2.jpg" alt="Astrophysics for People in a Hurry">
        <div class="book-details">
            <h3>Astrophysics for People in a Hurry</h3>
            <p>Author: Neil deGrasse Tyson</p>
            <p>Price: ₹350</p>
            <p>A concise explanation of complex astrophysics concepts.</p>
            <button onclick="addToCart('Astrophysics for People in a Hurry', 'Neil deGrasse Tyson', '350', 'images/science2.jpg')">Add to Cart</button>
        </div>
    </div>

    <!-- History Books -->
    <div class="book-card history">
        <img src="images/history1.jpg" alt="The Silk Roads">
        <div class="book-details">
            <h3>The Silk Roads</h3>
            <p>Author: Peter Frankopan</p>
            <p>Price: ₹499</p>
            <p>A historical journey through the interconnected world via the Silk Roads.</p>
            <button onclick="addToCart('The Silk Roads', 'Peter Frankopan', '499', 'images/history1.jpg')">Add to Cart</button>
        </div>
    </div>

    <div class="book-card history">
        <img src="images/history2.jpg" alt="Guns, Germs, and Steel">
        <div class="book-details">
            <h3>Guns, Germs, and Steel</h3>
            <p>Author: Jared Diamond</p>
            <p>Price: ₹450</p>
            <p>An exploration of the forces that shaped civilizations.</p>
            <button onclick="addToCart('Guns, Germs, and Steel', 'Jared Diamond', '450', 'images/history2.jpg')">Add to Cart</button>
        </div>
    </div>

    <!-- Children's Books -->
    <div class="book-card children">
        <img src="images/children1.jpg" alt="My First Library">
        <div class="book-details">
            <h3>My First Library</h3>
            <p>Publisher: Wonder House Books</p>
            <p>Price: ₹399</p>
            <p>A set of books introducing concepts like colors, animals, and more to toddlers.</p>
            <button onclick="addToCart('My First Library', 'Wonder House Books', '399', 'images/children1.jpg')">Add to Cart</button>
        </div>
    </div>

    <div class="book-card children">
        <img src="images/children2.jpg" alt="The Gruffalo">
        <div class="book-details">
            <h3>The Gruffalo</h3>
            <p>Author: Julia Donaldson</p>
            <p>Price: ₹299</p>
            <p>A beloved rhyming tale for young readers.</p>
            <button onclick="addToCart('The Gruffalo', 'Julia Donaldson', '299', 'images/children2.jpg')">Add to Cart</button>
        </div>
    </div>
</div>
    
    <script>
function addToCart(title, author, price) {
    let url = "cart.jsp?title=" + encodeURIComponent(title) + "&author=" + encodeURIComponent(author) + "&price=" + encodeURIComponent(price);
    window.location.href = url;
}
</script>



    <footer>
        <p>© 2025 Online Bookstore</p>
    </footer>
</body>
</html>
