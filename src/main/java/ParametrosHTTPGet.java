
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
public class ParametrosHTTPGet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body><head><title>Recuperando todos os parametros  HTTP via GET</title ></head >");
        out.println("<h1>Recuperando todos os parametros do HTTP via GET</h1>");

        Enumeration campos = request.getParameterNames();
        while (campos.hasMoreElements()) {
            String campo = (String) campos.nextElement();
            String valor = request.getParameter(campo);
            out.println("<li>" + campo + " = " + valor + "</li>");
        }

        out.println("</body></html>");
        out.close();
    }
}
