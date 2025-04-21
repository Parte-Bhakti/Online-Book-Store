
package src.java.com.bookstore;


public class CartItem {
    private int bookId;
    private String bookTitle;
    private int quantity;
    private double price;

    public CartItem(int bookId, String bookTitle, int quantity, double price) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.quantity = quantity;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}





