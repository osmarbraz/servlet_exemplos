
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author osmar
 */
@WebServlet(urlPatterns = {"/ServletHTTPAnotado"})
public class ServletHTTPAnotado extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head></head><body>");
        out.println("<h1>Hello, World Anotado!</h1>");
        out.println("</body></html>");
        out.close();
    }
}
