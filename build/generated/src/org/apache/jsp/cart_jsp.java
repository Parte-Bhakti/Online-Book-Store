package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Cart - Online Bookstore</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f8f1e4;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            color: #3e4b5b;\n");
      out.write("        }\n");
      out.write("        header {\n");
      out.write("            background-color: #2a9d8f;\n");
      out.write("            color: #fefae0;\n");
      out.write("            padding: 15px;\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 28px;\n");
      out.write("        }\n");
      out.write("        .cart-container {\n");
      out.write("            width: 80%;\n");
      out.write("            margin: 20px auto;\n");
      out.write("            background-color: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("        .cart-item {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            padding: 10px;\n");
      out.write("            border-bottom: 1px solid #ccc;\n");
      out.write("        }\n");
      out.write("        .cart-item:last-child {\n");
      out.write("            border-bottom: none;\n");
      out.write("        }\n");
      out.write("        .cart-item h3 {\n");
      out.write("            margin: 0;\n");
      out.write("            color: #264653;\n");
      out.write("        }\n");
      out.write("        .cart-item p {\n");
      out.write("            margin: 5px 0;\n");
      out.write("            color: #2a9d8f;\n");
      out.write("        }\n");
      out.write("        .remove-btn, .buy-btn {\n");
      out.write("            background-color: #e76f51;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            padding: 8px 12px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .remove-btn:hover, .buy-btn:hover {\n");
      out.write("            background-color: #f4a261;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <header><b>Shopping Cart</b></header>\n");
      out.write("\n");
      out.write("    <div class=\"cart-container\">\n");
      out.write("        <h2>Your Cart</h2>\n");
      out.write("\n");
      out.write("        ");

            String title = request.getParameter("title");
            String author = request.getParameter("author");
            String price = request.getParameter("price");

            if (title != null && author != null && price != null) {
        
      out.write("\n");
      out.write("            <div class=\"cart-item\">\n");
      out.write("                <div>\n");
      out.write("                    <h3>");
      out.print( title );
      out.write("</h3>\n");
      out.write("                    <p>Author: ");
      out.print( author );
      out.write("</p>\n");
      out.write("                    <p>Price: ₹");
      out.print( price );
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <button class=\"remove-btn\" onclick=\"removeFromCart()\">Remove</button>\n");
      out.write("                    <button class=\"buy-btn\" onclick=\"buyBook()\">Buy</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("            <p>Your cart is empty.</p>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function removeFromCart() {\n");
      out.write("            window.location.href = \"cart.jsp\"; // Reload without parameters\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function buyBook() {\n");
      out.write("            // Redirect to buy.jsp with book details as parameters\n");
      out.write("            var title = \"");
      out.print( title );
      out.write("\";\n");
      out.write("            var author = \"");
      out.print( author );
      out.write("\";\n");
      out.write("            var price = \"");
      out.print( price );
      out.write("\";\n");
      out.write("            window.location.href = \"buy.jsp?title=\" + encodeURIComponent(title) + \"&author=\" + encodeURIComponent(author) + \"&price=\" + encodeURIComponent(price);\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
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
