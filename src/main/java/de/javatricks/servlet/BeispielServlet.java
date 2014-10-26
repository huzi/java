package de.javatricks.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/*")
public class BeispielServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        writer.println("&lt;html>");
        writer.println("&lt;head>&lt;title>Java Beispiel Servlet&lt;/title>&lt;/head>");
        writer.println("&lt;body>");
        writer.println("&lt;h1>Servlet Beispiel&lt;/h1>");
        writer.println("&lt;p>Inhalt der HTML-Seite&lt;/p>");
        writer.println("&lt;body>");
        writer.println("&lt;/html>");

        writer.close();
    }
}