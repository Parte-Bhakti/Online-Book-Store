package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class contactFormHandler_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Contact Messages</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f8f1e4;\n");
      out.write("            color: #3e4b5b;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("            color: #2a9d8f;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        form {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input, textarea {\n");
      out.write("            width: 50%;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin: 10px 0;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button {\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: #ff69b4;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button:hover {\n");
      out.write("            background-color: #ffb6c1;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            margin-top: 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table, th, td {\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            background-color: #2a9d8f;\n");
      out.write("            color: white;\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        td {\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Contact Messages</h1>\n");
      out.write("\n");
      out.write("    <form action=\"contactFormHandler.jsp\" method=\"post\">\n");
      out.write("        <input type=\"text\" name=\"name\" placeholder=\"Your Name\" required><br>\n");
      out.write("        <input type=\"email\" name=\"email\" placeholder=\"Your Email\" required><br>\n");
      out.write("        <textarea name=\"message\" placeholder=\"Your Message\" rows=\"5\" required></textarea><br>\n");
      out.write("        <button type=\"submit\">Submit</button>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <h2>Submitted Messages</h2>\n");
      out.write("    <table>\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Message</th>\n");
      out.write("                <th>Submitted At</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            ");

                // Get form data if submitted
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String message = request.getParameter("message");

                Connection conn = null;
                PreparedStatement stmt = null;
                Statement selectStmt = null;
                ResultSet rs = null;

                try {
                    // Database connection
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_bookstore", "root", "Bhakti#123");

                    // Insert form data into the database if submitted
                    if (name != null && email != null && message != null) {
                        String insertSQL = "INSERT INTO ContactMessages (name, email, message) VALUES (?, ?, ?)";
                        stmt = conn.prepareStatement(insertSQL);
                        stmt.setString(1, name);
                        stmt.setString(2, email);
                        stmt.setString(3, message);
                        stmt.executeUpdate();
                    }

                    // Retrieve all data from the database
                    String selectSQL = "SELECT * FROM ContactMessages ORDER BY submitted_at DESC";
                    selectStmt = conn.createStatement();
                    rs = selectStmt.executeQuery(selectSQL);

                    // Display data in the table
                    while (rs.next()) {
                        out.println("<tr>");
                        out.println("<td>" + rs.getInt("id") + "</td>");
                        out.println("<td>" + rs.getString("name") + "</td>");
                        out.println("<td>" + rs.getString("email") + "</td>");
                        out.println("<td>" + rs.getString("message") + "</td>");
                        out.println("<td>" + rs.getTimestamp("submitted_at") + "</td>");
                        out.println("</tr>");
                    }
                } catch (Exception e) {
                    out.println("<tr><td colspan='5'>Error: " + e.getMessage() + "</td></tr>");
                } finally {
                    // Close resources
                    if (rs != null) rs.close();
                    if (selectStmt != null) selectStmt.close();
                    if (stmt != null) stmt.close();
                    if (conn != null) conn.close();
                }
            
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
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
