package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Login - Online Bookstore</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f8f1e4; /* Cream Background */\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            color: #3e4b5b; /* Slate Gray Text */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        header {\n");
      out.write("            background-color: #2a9d8f; /* Teal Header Background */\n");
      out.write("            color: #fefae0; /* Light Cream Header Text */\n");
      out.write("            padding: 15px;\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 28px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            background-color: #264653; /* Deep Green Navigation Bar */\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #fefae0; /* Light Cream Text */\n");
      out.write("            margin: 0 15px;\n");
      out.write("            font-size: 18px;\n");
      out.write("            padding: 8px 15px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav a:hover {\n");
      out.write("            background-color: #e76f51; /* Orange Hover Effect */\n");
      out.write("            color: #f8f1e4; /* Cream Text on Hover */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container {\n");
      out.write("            background-color: white;\n");
      out.write("            padding: 30px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);\n");
      out.write("            width: 300px;\n");
      out.write("            margin: 50px auto;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container h1 {\n");
      out.write("            color: #2a9d8f; /* Teal Header */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container input {\n");
      out.write("            padding: 10px;\n");
      out.write("            margin: 10px 0;\n");
      out.write("            border: 2px solid #e76f51;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container button {\n");
      out.write("            background-color: #e76f51;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            padding: 10px;\n");
      out.write("            width: 100%;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container button:hover {\n");
      out.write("            background-color: #f4a261;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container a {\n");
      out.write("            color: #264653;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container a:hover {\n");
      out.write("            text-decoration: underline;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header><b>Login to Your Account</b></header>\n");
      out.write("    <nav>\n");
      out.write("        <a href=\"index.jsp\">Home</a>\n");
      out.write("        <a href=\"books.jsp\">Books</a>\n");
      out.write("        <a href=\"cart.jsp\">Cart</a>\n");
      out.write("        <a href=\"login.jsp\">Login</a>\n");
      out.write("        <a href=\"aboutus.jsp\">About Us</a>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"login-container\">\n");
      out.write("        <h1>Login</h1>\n");
      out.write("        <form action=\"login.jsp\" method=\"post\">\n");
      out.write("            <input type=\"text\" name=\"username\" placeholder=\"Username\" required>\n");
      out.write("            <input type=\"password\" name=\"password\" placeholder=\"Password\" required>\n");
      out.write("            <button type=\"submit\">Login</button>\n");
      out.write("        </form>\n");
      out.write("        ");

            // Check if the form is submitted
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if (username != null && password != null) {
                try {
                    // Database connection
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhaktiparte5329", "root", "Bhakti#123");

                    // Query to match entered username and password
                    PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
                    ps.setString(1, username);
                    ps.setString(2, password);
                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) {
                        // If credentials are valid, set the user_id in the session
                        int userId = rs.getInt("id");
                        session.setAttribute("user_id", userId);

                        // Redirect to the books page after successful login
                        response.sendRedirect("books.jsp");
                    } else {
                        out.println("<p style='color:red;'>Invalid credentials, please try again.</p>");
                    }

                    rs.close();
                    ps.close();
                    con.close();
                } catch (Exception e) {
                    out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
                }
            }
        
      out.write("\n");
      out.write("        <p>Don't have an account? <a href=\"registration.jsp\">Register here</a></p>\n");
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
