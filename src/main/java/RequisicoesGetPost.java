
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
public class RequisicoesGetPost extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Requisicao GET HTTP</title></head><body>");
        out.println("<h1>O Servlet Recebeu um GET.<br> Clique no botao abaixo.</h1><br>");
        out.println("<form method=POST action=RequisicoesGetPost >");
        out.println("<input type=submit value=submit>");
        out.println("</form></body></html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Requisicao POST HTTP</title></head><body>");
        out.println("<h1>O Servlet Recebeu um POST. </h1><br>");
        out.println("</body></html>");
        out.close();
    }
}
