package servlets;

import logic.ItemHolder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ListServlet extends HttpServlet {

    private ItemHolder ih = new ItemHolder();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        if (name != null)
            ih.addToList(name);

        PrintWriter pw  = resp.getWriter();
        pw.println("<html>\n" +
                "<head>\n" +
                "    <title>List</title>\n" +
                "</head>\n" +
                "<body>\n" +

                ih.getAllItems() +

                "</body>\n" +
                "</html>");
    }
}
