
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author osmar
 */
public class CabecalhoRequest extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body><head><title>Recuperando todos os parametros do Cabeçalho</title ></head >");
        out.println("<h1>Recuperando todos os parametros do Cabeçalho</h1>");

        Enumeration campos = request.getHeaderNames();
        while (campos.hasMoreElements()) {
            String campo = (String) campos.nextElement();
            String valor = request.getHeader(campo);
            out.println("<li>" + campo + " = " + valor + "</li>");
        }

        out.println("</body></html>");
        out.close();
    }
}