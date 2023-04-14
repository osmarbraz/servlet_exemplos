
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author osmar
 */
@WebServlet(urlPatterns = {"/servlet/RespostaConsole"})
public class RespostaConsole extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("<html>");
        System.out.println("<body><head><title>HttpServletResponse</title ></head >");
	System.out.println("<h1>Exibindo dados via HttpServletResponse Console</h1>");
	System.out.println("</body></html>");
    }
}
