package Part5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/part5")
public class displayServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        response.setContentType("text/html");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Part 5</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("getInitParameter: " + this.getInitParameter("namespace"));

        out.println("getX() methods defined in the HttpServlet class: ");
        out.println("<br>");
        out.println("getLastModified: " + this.getLastModified(request));
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");

        out.println("getX() methods inherited from GenericServlet class: ");
        out.println("<br>");
        Enumeration<String> em = this.getInitParameterNames();
        while(em.hasMoreElements()){
            out.println("getInitParameterNames: " + em.nextElement());
            out.println("<br>");
        }
        out.println("ServletConfig: " + this.getServletConfig().toString());
        out.println("<br>");
        out.println("ServletContext: " + this.getServletContext().toString());
        out.println("<br>");
        out.println("ServletInfo: " + this.getServletInfo());
        out.println("<br>");
        out.println("ServletName: " + this.getServletName());
        out.println("<br>");

        out.println("</body>");
        out.println("</html>");
    }

}
