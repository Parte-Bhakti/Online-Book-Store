package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Contact Us - Online Bookstore</title>\n");
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
      out.write("        .contact-container {\n");
      out.write("            padding: 30px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-container h2 {\n");
      out.write("            color: #2a9d8f; /* Teal Text */\n");
      out.write("            font-size: 36px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-container p {\n");
      out.write("            font-size: 18px;\n");
      out.write("            line-height: 1.6;\n");
      out.write("            margin: 20px 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-form {\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("            margin-top: 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-form input, .contact-form textarea {\n");
      out.write("            width: 80%;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin: 10px 0;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-form button {\n");
      out.write("            width: 80%;\n");
      out.write("            padding: 10px;\n");
      out.write("            background-color: #ff69b4; /* Hot pink */\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .contact-form button:hover {\n");
      out.write("            background-color: #ffb6c1; /* Lighter pink on hover */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        footer {\n");
      out.write("            background-color: #264653; /* Deep Green Footer Background */\n");
      out.write("            color: #fefae0; /* Light Cream Text */\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("            position: fixed;\n");
      out.write("            bottom: 0;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header><b>Contact Us</b></header>\n");
      out.write("    <nav>\n");
      out.write("        <a href=\"index.jsp\">Home</a>\n");
      out.write("        <a href=\"books.jsp\">Books</a>\n");
      out.write("        <a href=\"cart.jsp\">Cart</a>\n");
      out.write("        <a href=\"login.jsp\">Login</a>\n");
      out.write("        <a href=\"aboutus.jsp\">About Us</a>\n");
      out.write("        <a href=\"contact.jsp\">Contact Us</a>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"contact-container\">\n");
      out.write("        <h2>Get in Touch</h2>\n");
      out.write("        <p>If you have any questions, feedback, or suggestions, we would love to hear from you! Please fill out the form below, and we will get back to you as soon as possible.</p>\n");
      out.write("\n");
      out.write("        <div class=\"contact-form\">\n");
      out.write("            <form action=\"sendMessage.jsp\" method=\"post\">\n");
      out.write("                <input type=\"text\" name=\"name\" placeholder=\"Your Name\" required>\n");
      out.write("                <input type=\"email\" name=\"email\" placeholder=\"Your Email\" required>\n");
      out.write("                <textarea name=\"message\" placeholder=\"Your Message\" rows=\"5\" required></textarea>\n");
      out.write("                <button type=\"submit\">Send Message</button>\n");
      out.write("            </form>\n");
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
