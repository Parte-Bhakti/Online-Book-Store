package src.java.com.bookstore;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> cartItems;

    public Cart() {
        cartItems = new ArrayList<>();
    }

    // Method to add a book to the cart
    public void addBookToCart(int bookId, int quantity) {
        // Find the book in the cart, if it exists, increase quantity
        for (CartItem item : cartItems) {
            if (item.getBookId() == bookId) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        // If the book is not in the cart, create a new CartItem and add it
        CartItem newItem = new CartItem(bookId, "Book Title Placeholder", quantity, 10.0); // Replace with actual book data from DB
        cartItems.add(newItem);
    }

    // Method to remove a book from the cart
    public void removeBookFromCart(int bookId) {
        for (CartItem item : cartItems) {
            if (item.getBookId() == bookId) {
                cartItems.remove(item);
                break;
            }
        }
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }
}

