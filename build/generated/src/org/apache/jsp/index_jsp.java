package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("    <title>Online Bookstore</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background: #f8f1e4; /* Cream Background */\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            color: #3e4b5b; /* Slate Gray for Text */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        header {\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 20px;\n");
      out.write("            background: #2a9d8f; /* Teal Header Background */\n");
      out.write("            color: #fefae0; /* Light Cream Header Text */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        header h1 {\n");
      out.write("            font-size: 48px;\n");
      out.write("            font-weight: bold;\n");
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
      out.write("            color: #fefae0; /* Light Cream Text for Links */\n");
      out.write("            margin: 0 15px;\n");
      out.write("            font-size: 18px;\n");
      out.write("            padding: 8px 15px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            background: transparent; /* No background box color */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav a:hover {\n");
      out.write("            background-color: #e76f51; /* Orange Hover Effect */\n");
      out.write("            color: #f8f1e4; /* Cream Text on Hover */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .hero-section {\n");
      out.write("            text-align: center;\n");
      out.write("            color: #fefae0; /* Light Cream for Text */\n");
      out.write("            padding: 150px 20px;\n");
      out.write("            background: url('images/hero-book1.jpg') no-repeat center center / cover; /* Background Image */\n");
      out.write("            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.4);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .hero-section h1 {\n");
      out.write("            font-size: 48px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .hero-section button {\n");
      out.write("            background-color: #e76f51; /* Orange Button */\n");
      out.write("            color: #fefae0; /* Light Cream Text */\n");
      out.write("            font-size: 18px;\n");
      out.write("            padding: 15px 30px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition: background-color 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .hero-section button:hover {\n");
      out.write("            background-color: #f4a261; /* Light Orange Hover Effect */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .bestsellers {\n");
      out.write("            padding: 50px 0;\n");
      out.write("            text-align: center;\n");
      out.write("            background: url('images/bg.jpg') no-repeat center center / cover; /* Background Image */\n");
      out.write("            color: #fefae0; /* Light Cream Text */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .bestsellers h2 {\n");
      out.write("            font-size: 36px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.4);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .bestsellers .books-container {\n");
      out.write("            display: flex; /* Flexbox for books in one line */\n");
      out.write("            justify-content: center; /* Center the books */\n");
      out.write("            gap: 20px; /* Add space between books */\n");
      out.write("            flex-wrap: wrap; /* Allow wrapping if needed */\n");
      out.write("            padding: 50px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .book-card {\n");
      out.write("            background: rgba(255, 255, 255, 0.8); /* Semi-transparent background */\n");
      out.write("            padding: 15px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("            color: #264653; /* Deep Green Text */\n");
      out.write("            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .book-card img {\n");
      out.write("           border: 2px solid #e76f51; /* Orange Border for Images */\n");
      out.write("           border-radius: 10px;\n");
      out.write("           width: 150px;\n");
      out.write("           height: 200px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        footer {\n");
      out.write("            background-color: #264653; /* Deep Green Footer Background */\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 10px;\n");
      out.write("            color: #fefae0; /* Light Cream Text */\n");
      out.write("            position: fixed;\n");
      out.write("            bottom: 0;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <h1>Welcome to Our Online Bookstore 📚</h1>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <nav>\n");
      out.write("        <a href=\"index.jsp\">Home</a>\n");
      out.write("        <a href=\"books.jsp\" class=\"box-link\">Books</a>\n");
      out.write("        <a href=\"cart.jsp\">Cart</a>\n");
      out.write("        <a href=\"login.jsp\">Login</a>\n");
      out.write("        <a href=\"aboutus.jsp\">About Us</a>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"hero-section\">\n");
      out.write("        <h1>Explore Our Wide Collection of Books</h1>\n");
      out.write("        <button onclick=\"window.location.href='books.jsp'\">Browse Books</button>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"bestsellers\">\n");
      out.write("        <h2>Best Selling Books</h2>\n");
      out.write("        <div class=\"books-container\">\n");
      out.write("            <div class=\"book-card fiction\">\n");
      out.write("                 <img src=\"images/fiction2.jpg\" alt=\"Pride and Prejudice\">\n");
      out.write("                 <h3>Pride and Prejudice</h3>\n");
      out.write("                 <p>Author: Jane Austen</p>\n");
      out.write("                 <p>Price: ₹250</p>\n");
      out.write("                 <p>A classic romance novel exploring themes of class and marriage.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"book-card nonfiction\">\n");
      out.write("                 <img src=\"images/nonfiction1.jpg\" alt=\"Sapiens\">\n");
      out.write("                 <h3>Sapiens</h3>\n");
      out.write("                 <p>Author: Yuval Noah Harari</p>\n");
      out.write("                 <p>Price: ₹499</p>\n");
      out.write("                 <p>A historical exploration of humanity's evolution and societies.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"book-card children\">\n");
      out.write("                <img src=\"images/children3.jpg\" alt=\"Harry Potter and the Philosopher's Stone\">\n");
      out.write("                <h3>Harry Potter and the Philosopher's Stone</h3>\n");
      out.write("                <p>Author: J.K. Rowling</p>\n");
      out.write("                <p>Price: ₹450</p>\n");
      out.write("                <p>The first book in the magical Harry Potter series.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
