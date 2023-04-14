
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author osmar
 */
public class Generico extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("Hello, World!");
        out.close();
    }
}
