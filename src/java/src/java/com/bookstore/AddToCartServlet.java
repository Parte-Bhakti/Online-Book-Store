package src.java.com.bookstore;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToCartServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the current session, creating one if it doesn't exist
        HttpSession session = request.getSession(true);

        // Retrieve or initialize the cart
        Object cartObj = session.getAttribute("cart");
        List<String> cart;
        if (cartObj instanceof List) {
            cart = (List<String>) cartObj;
        } else {
            cart = Collections.synchronizedList(new ArrayList<>());
        }

        // Get the book title from the request
        String bookTitle = request.getParameter("title");

        // Validate the book title
        if (bookTitle == null || bookTitle.trim().isEmpty()) {
            response.setContentType("text/plain");
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().write("Invalid book title!");
            return;
        }

        bookTitle = bookTitle.trim(); // Trim whitespace

        // Avoid duplicates in the cart
        if (!cart.contains(bookTitle)) {
            cart.add(bookTitle);
        }

        // Save the updated cart back into the session
        session.setAttribute("cart", cart);

        // Respond to the client with a success message
        response.setContentType("application/json");
        response.getWriter().write("{\"message\":\"Book added to cart successfully!\"}");
    }
}
