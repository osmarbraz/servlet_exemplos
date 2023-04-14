
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
public class ValoresRequest extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>HTTPServletRequest</title></head><body>");
        out.println("<b>Demonstrando a saida com o objeto HttpServletRequest </b><br>");
        out.println("<br>Porta Servidor: " + request.getServerPort());
        out.println("<br>Nome Servidor: " + request.getServerName());
        out.println("<br>Protocolo: " + request.getProtocol());
        out.println("<br>Character Encoding: " + request.getCharacterEncoding());
        out.println("<br>Tipo Conteudo: " + request.getContentType());
        out.println("<br>Método da requisição: " + request.getMethod());
        out.println("<br>Tamanho Conteudo: " + request.getContentLength());
        out.println("<br>Endereco Remoto: " + request.getRemoteAddr());
        out.println("<br>Endereco Servidor: " + request.getRemoteHost());
        out.println("<br>Esquema: " + request.getScheme());
        out.println("<br>Contexto: " + request.getContextPath());
        out.println("<br><br>=>Parametros e Atributos");
        Enumeration parametros = request.getParameterNames();
        while (parametros.hasMoreElements()) {
            String nomeParametro = (String) parametros.nextElement();
            out.println("<br>Nome Parametro: " + nomeParametro);
            out.println("<br>Valor Parametro: " + request.getParameter(nomeParametro));
        }
        Enumeration atributos = request.getAttributeNames();
        while (atributos.hasMoreElements()) {
            String atributo = (String) atributos.nextElement();
            out.println("<br>Nome Atributo: " + atributo);
            out.println("<br>Valor Atributo: " + request.getAttribute(atributo));
        }
        out.println("</body></html>");
    }
}
