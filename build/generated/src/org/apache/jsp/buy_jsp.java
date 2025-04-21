package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class buy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Bill - Online Bookstore</title>\n");
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
      out.write("        .bill-container {\n");
      out.write("            width: 80%;\n");
      out.write("            margin: 20px auto;\n");
      out.write("            background-color: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("        .bill-item {\n");
      out.write("            padding: 10px;\n");
      out.write("            border-bottom: 1px solid #ccc;\n");
      out.write("        }\n");
      out.write("        .bill-item:last-child {\n");
      out.write("            border-bottom: none;\n");
      out.write("        }\n");
      out.write("        .bill-item h3 {\n");
      out.write("            margin: 0;\n");
      out.write("            color: #264653;\n");
      out.write("        }\n");
      out.write("        .bill-item p {\n");
      out.write("            margin: 5px 0;\n");
      out.write("            color: #2a9d8f;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <header><b>Bill - Online Bookstore</b></header>\n");
      out.write("\n");
      out.write("    <div class=\"bill-container\">\n");
      out.write("        <h2>Purchase Details</h2>\n");
      out.write("\n");
      out.write("        ");

            // Check if user is logged in
            Integer userId = (Integer) session.getAttribute("id");
            if (userId == null) {
                // Redirect to login page if not logged in
                response.sendRedirect("login.jsp");
                return;
            }
            
            String title = request.getParameter("title");
            String author = request.getParameter("author");
            String price = request.getParameter("price");
            String quantity = request.getParameter("quantity");

            if (title != null && author != null && price != null && quantity != null) {
                // Calculate total price
                double total = Double.parseDouble(price) * Integer.parseInt(quantity);

                // Insert purchase details into the database
                Connection conn = null;
                PreparedStatement pstmt = null;
                try {
                    // Assuming you have a method to get a connection
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_bookstore", "root", "Bhakti#123");

                    String query = "INSERT INTO purchases (user_id, book_title, book_author, price, quantity, total) VALUES (?, ?, ?, ?, ?, ?)";
                    pstmt = conn.prepareStatement(query);
                    pstmt.setInt(1, userId); // Using the user_id from session
                    pstmt.setString(2, title);
                    pstmt.setString(3, author);
                    pstmt.setDouble(4, Double.parseDouble(price));
                    pstmt.setInt(5, Integer.parseInt(quantity));
                    pstmt.setDouble(6, total);

                    int rowsAffected = pstmt.executeUpdate();

                    if (rowsAffected > 0) {
                        out.println("<p>Purchase details saved successfully!</p>");
                    } else {
                        out.println("<p>Something went wrong while saving purchase details!</p>");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                    out.println("<p>Database error! Please try again later.</p>");
                } finally {
                    try {
                        if (pstmt != null) pstmt.close();
                        if (conn != null) conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
        
      out.write("\n");
      out.write("            <!-- Displaying purchase details -->\n");
      out.write("            <div class=\"bill-item\">\n");
      out.write("                <h3>");
      out.print( title );
      out.write("</h3>\n");
      out.write("                <p>Author: ");
      out.print( author );
      out.write("</p>\n");
      out.write("                <p>Price: ₹");
      out.print( price );
      out.write("</p>\n");
      out.write("                <p>Quantity: ");
      out.print( quantity );
      out.write("</p>\n");
      out.write("                <p>Total: ₹");
      out.print( total );
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("            <p>No book details available. Something went wrong!</p>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </div>\n");
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
