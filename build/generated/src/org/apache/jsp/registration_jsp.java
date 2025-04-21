package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Registration - Online Bookstore</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f8f1e4;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            color: #3e4b5b;\n");
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
      out.write("        .registration-form {\n");
      out.write("            max-width: 400px;\n");
      out.write("            margin: 50px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: white;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .registration-form h2 {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            color: #2a9d8f;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .registration-form input {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin: 10px 0;\n");
      out.write("            border: 1px solid #e76f51;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .registration-form button {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            background-color: #e76f51;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .registration-form button:hover {\n");
      out.write("            background-color: #f4a261;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .message {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .message a {\n");
      out.write("            color: #264653;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .message a:hover {\n");
      out.write("            text-decoration: underline;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header><b>Register for an Account</b></header>\n");
      out.write("    <nav>\n");
      out.write("        <a href=\"index.jsp\">Home</a>\n");
      out.write("        <a href=\"books.jsp\">Books</a>\n");
      out.write("        <a href=\"cart.jsp\">Cart</a>\n");
      out.write("        <a href=\"login.jsp\">Login</a>\n");
      out.write("        <a href=\"aboutus.jsp\">About Us</a>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"registration-form\">\n");
      out.write("        <h2>Sign Up</h2>\n");
      out.write("        <form action=\"registration.jsp\" method=\"post\">\n");
      out.write("            <input type=\"text\" name=\"username\" placeholder=\"Username\" required>\n");
      out.write("            <input type=\"email\" name=\"email\" placeholder=\"Email\" required>\n");
      out.write("            <input type=\"password\" name=\"password\" placeholder=\"Password\" required>\n");
      out.write("            <button type=\"submit\">Register</button>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");

            // Retrieve form data
            String username = request.getParameter("username");
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            if (username != null && email != null && password != null) {
                try {
                    // Database connection details
                    String dbURL = "jdbc:mysql://localhost:3306/online_bookstore";
                    String dbUser = "root";
                    String dbPassword = "Bhakti#123";

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(dbURL, dbUser, dbPassword);

                    // Check if username already exists
                    String checkQuery = "SELECT * FROM users WHERE username = ?";
                    PreparedStatement checkStmt = con.prepareStatement(checkQuery);
                    checkStmt.setString(1, username);
                    ResultSet checkRs = checkStmt.executeQuery();

                    if (checkRs.next()) {
                        out.println("<p style='color:red;'>Username already exists! Please choose a different one.</p>");
                    } else {
                        // Insert the new user into the database
                        String insertQuery = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
                        PreparedStatement ps = con.prepareStatement(insertQuery);
                        ps.setString(1, username);
                        ps.setString(2, email);
                        ps.setString(3, password); // Save password as plain text

                        int rowsAffected = ps.executeUpdate();

                        if (rowsAffected > 0) {
                            out.println("<p style='color:green;'>Registration successful! <a href='login.jsp'>Login here</a></p>");
                        } else {
                            out.println("<p style='color:red;'>Error during registration, please try again.</p>");
                        }
                    }

                    // Close connections
                    checkRs.close();
                    checkStmt.close();
                    con.close();
                } catch (Exception e) {
                    out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
                }
            }
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"message\">\n");
      out.write("        <p>Already have an account? <a href=\"login.jsp\">Login here</a></p>\n");
      out.write("    </div>\n");
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
