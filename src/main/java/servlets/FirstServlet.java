package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter pw  = resp.getWriter();
        pw.println("<html>\n" +
                "<head>\n" +
                "    <title>Hello</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>Hello from Servlet</h1>\n" +
                "</body>\n" +
                "</html>");

    }
}