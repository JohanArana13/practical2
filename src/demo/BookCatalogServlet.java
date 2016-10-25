package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by HaouJohan on 10/24/2016.
 */

@WebServlet(name = "BookCatalogServlet", urlPatterns = "/bookcatalog")
public class BookCatalogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest resquest, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>" + "<head><title>Duke's Bookstore</title></head>" +
                "<body  bgcolor=\"#ffffff\">" + "<center>" +
                "<hr> <br> &nbsp;" + "<h1>" +
                "<font size=\"+3\" color=\"#CC0066\">Duke's </font> <img src=\"" +
                "./duke.books.gif\" alt=\"Duke holding books\"\">" +
                "<font size=\"+3\" color=\"black\">Bookstore</font>" + "</h1>" +
                "</center>" + "<br> &nbsp; <hr> <br> ");

        try {
            BookDBAO db = new BookDBAO();
            List<BookDetails> list = db.getAllBooks();
            out.println("<h3>Please choose from our selections:</h3>");
            out.println("<table align=\"center\">");
            for (int i = 0; i < list.size(); i++) {
                out.println("<tr>");
                out.println("<td bgcolor=\"yellow\"><a href=\"\">" + list.get(i).getTitle() + "</a></td>");
                out.println("<td rowspan=\"2\" bgcolor=\"yellow\">" + list.get(i).getPrice() + "</td>");
                out.println("<td rowspan=\"2\" bgcolor=\"yellow\"><a href=\"\">" + "Add to Cart" + "</a></td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>" + "by " + "<i>" + list.get(i).getFirstName() + " " + list.get(i).getSurname() + "</i></td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }
}