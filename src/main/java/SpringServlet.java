import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.springframework.web.context.support.WebApplicationContextUtils.getWebApplicationContext;

public class SpringServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        WebApplicationContext context = getWebApplicationContext(getServletContext());
        response.getWriter().println(context.getBean("bean"));
    }

}
