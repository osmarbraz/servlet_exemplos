
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author osmar
 */
public class LendoParametrosPost extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Recuperando parametros HTTP via POST</title></head><body>");
        out.println("<h1>Recuperando parametros HTTP via POST</h1>");
        out.println("<li>Nome = " + request.getParameter("nome") + "</li>");
        out.println("<li>Telefone = " + request.getParameter("fone") + "</li>");
        out.println("</body></html>");
        out.close();
    }
}
