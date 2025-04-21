package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import src.java.com.bookstore.CartItem;
import javax.servlet.http.HttpSession;
import src.java.com.bookstore.Cart;
import src.java.com.bookstore.order;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Order Summary - Online Bookstore</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f8f1e4;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            color: #3e4b5b;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            min-height: 100vh;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        header {\n");
      out.write("            background-color: #2a9d8f;\n");
      out.write("            color: #fefae0;\n");
      out.write("            padding: 15px;\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 28px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            background-color: #264653;\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #fefae0;\n");
      out.write("            margin: 0 15px;\n");
      out.write("            font-size: 18px;\n");
      out.write("            padding: 8px 15px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav a:hover {\n");
      out.write("            background-color: #e76f51;\n");
      out.write("            color: #f8f1e4;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .order-container {\n");
      out.write("            margin: 20px;\n");
      out.write("            padding: 20px;\n");
      out.write("            flex-grow: 1;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .order-container table {\n");
      out.write("            width: 100%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .order-container th, .order-container td {\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .order-container th {\n");
      out.write("            background-color: #264653;\n");
      out.write("            color: #fefae0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .order-container td {\n");
      out.write("            background-color: #f8f1e4;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .order-container button {\n");
      out.write("            background-color: #e76f51;\n");
      out.write("            color: white;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .order-container button:hover {\n");
      out.write("            background-color: #f4a261;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        footer {\n");
      out.write("            background-color: #264653;\n");
      out.write("            color: #fefae0;\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: auto;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        footer p {\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header><b>Order Summary</b></header>\n");
      out.write("    <nav>\n");
      out.write("        <a href=\"index.jsp\">Home</a>\n");
      out.write("        <a href=\"books.jsp\">Books</a>\n");
      out.write("        <a href=\"cart.jsp\">Cart</a>\n");
      out.write("        <a href=\"login.jsp\">Login</a>\n");
      out.write("        <a href=\"aboutus.jsp\">About Us</a>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"order-container\">\n");
      out.write("        <h2>Your Order</h2>\n");
      out.write("        ");

            // Retrieve the cart from session (session is automatically available)
            Cart cart = (Cart) session.getAttribute("cart");

            if (cart != null) {
                List<CartItem> cartItems = cart.getCartItems();
                int totalAmount = 0;

                // Calculate total amount
                for (CartItem item : cartItems) {
                    switch (item.getBookId()) {
                        case 1: totalAmount += 200 * item.getQuantity(); break;
                        case 2: totalAmount += 300 * item.getQuantity(); break;
                        case 3: totalAmount += 400 * item.getQuantity(); break;
                        case 4: totalAmount += 250 * item.getQuantity(); break;
                    }
                }

                // Create the order
                String userName = "John Doe";  // You can replace this with the logged-in user's name
                String address = "123 Main St, City, Country";  // Replace with actual address
                order order = new order(cartItems, totalAmount, userName, address);

                out.println("<h3>Order Summary</h3>");
                out.println("<p>User Name: " + order.getUserName() + "</p>");
                out.println("<p>Address: " + order.getAddress() + "</p>");

                out.println("<table>");
                out.println("<tr><th>Book Title</th><th>Quantity</th><th>Price</th></tr>");
                for (CartItem item : cartItems) {
                    String bookTitle = ""; // Sample titles
                    int price = 0; // Sample prices
                    switch (item.getBookId()) {
                        case 1:
                            bookTitle = "Book Title 1";
                            price = 200;
                            break;
                        case 2:
                            bookTitle = "Book Title 2";
                            price = 300;
                            break;
                        case 3:
                            bookTitle = "Book Title 3";
                            price = 400;
                            break;
                        case 4:
                            bookTitle = "Book Title 4";
                            price = 250;
                            break;
                    }

                    out.println("<tr>");
                    out.println("<td>" + bookTitle + "</td>");
                    out.println("<td>" + item.getQuantity() + "</td>");
                    out.println("<td>" + price * item.getQuantity() + " INR</td>");
                    out.println("</tr>");
                }
                out.println("</table>");
                out.println("<h3>Total: " + totalAmount + " INR</h3>");
                out.println("<a href='payment.jsp'><button>Proceed to Payment</button></a>");
            } else {
                out.println("<p>Your cart is empty.</p>");
            }
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <p>© 2025 Online Bookstore</p>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
