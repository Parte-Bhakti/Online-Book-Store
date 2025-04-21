<%@ page import="java.sql.*" %>
<%
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String message = request.getParameter("message");

    Connection conn = null;
    PreparedStatement pstmt = null;

    try {
        // Database connection details
        String dbURL = "jdbc:mysql://localhost:3306/bhaktiparte5329";
        String dbUser = "root";
        String dbPassword = "Bhakti#123";

        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);

        // Insert query
        String sql = "INSERT INTO contact_messages (name, email, message) VALUES (?, ?, ?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setString(2, email);
        pstmt.setString(3, message);

        int rows = pstmt.executeUpdate();

        if (rows > 0) {
%>
        <div style="background-color: #d4edda; color: #155724; border: 1px solid #c3e6cb; padding: 15px; margin: 20px; border-radius: 5px; font-family: Arial, sans-serif;">
            <h2>Message sent successfully!</h2>
        </div>
<%
        }
    } catch (Exception e) {
        e.printStackTrace();
%>
        <div style="background-color: #f8d7da; color: #721c24; border: 1px solid #f5c6cb; padding: 15px; margin: 20px; border-radius: 5px; font-family: Arial, sans-serif;">
            <h2>Error occurred: <%= e.getMessage() %></h2>
        </div>
<%
    } finally {
        try {
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
%>
