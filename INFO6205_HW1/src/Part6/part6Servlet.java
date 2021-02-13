package Part6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;

@WebServlet("/part6")
public class part6Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Part 6</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("Display all the getX() methods defined in the HttpServletRequest interface");
        out.println("getAuthType(): " + request.getAuthType());
        out.println("<br>");
        out.println("getContextPath(): " + request.getContextPath());
        out.println("<br>");
        out.println("getDateHeader(String name): " + request.getDateHeader("name"));
        out.println("<br>");
        out.println("getHeader(String name): " + request.getHeader("name"));
        out.println("<br>");
        Enumeration<String> e1 = request.getHeaderNames();
        while(e1.hasMoreElements()){
            out.println("getHeaderNames(): "+e1.nextElement());
            out.println("<br>");
        }
        Enumeration<String> e2 = request.getHeaders("name");
        while(e2.hasMoreElements()){
            out.println("getHeaders(String name): "+e2.nextElement());
            out.println("<br>");
        }
        out.println("<br>");
        out.println("<br>");
        out.println("getIntHeader(String name): " + request.getIntHeader("name"));
        out.println("<br>");
        out.println("getMethod(): " + request.getMethod());
        out.println("<br>");
        out.println("getPathInfo(): " + request.getPathInfo());
        out.println("<br>");
        out.println("getPathTranslated(): " + request.getPathTranslated());
        out.println("<br>");
        out.println("getQueryString(): " + request.getQueryString());
        out.println("<br>");
        out.println("getRemoteUser(): " + request.getRemoteUser());
        out.println("<br>");
        out.println("getRequestedSessionId(): " + request.getRequestedSessionId());
        out.println("<br>");
        out.println("getRequestURL(): " + request.getRequestURL());
        out.println("<br>");
        out.println("getRequestURL(): " + request.getRequestURL().toString());
        out.println("<br>");
        out.println("getServletPath(): " + request.getServletPath());
        out.println("<br>");

        out.println("Display the inherited getX() methods from ServletRequest: ");
        out.println("getAttribute(String name): "+ request.getAttribute("name"));
        out.println("<br>");
        Enumeration<String> e3 = request.getAttributeNames();
        while(e3.hasMoreElements()){
            out.println("AttributeName: "+ e3.nextElement());
            out.println("<br>");
        }

        out.println("getCharacterEncoding(): "+ request.getCharacterEncoding());
        out.println("<br>");
        out.println("getContentLength(): "+ request.getContentLength());
        out.println("<br>");
        out.println("getContentLengthLong(): "+ request.getContentLengthLong());
        out.println("<br>");
        out.println("getContentType(): "+ request.getContentType());
        out.println("<br>");
        out.println("getLocalAddr(): "+ request.getLocalAddr());
        out.println("<br>");
        out.println("getLocalName(): "+ request.getLocalName());
        out.println("<br>");
        out.println("getLocalPort(): "+ request.getLocalPort());
        out.println("<br>");
        out.println("getParameter(String name): "+ request.getParameter("name"));

        Enumeration<String> e4 = request.getParameterNames();
        while(e4.hasMoreElements()){
            out.println("getParameterNames(): "+e4.nextElement());
        }
        String[] values = request.getParameterValues("values");
        out.println("hobbies: "+ Arrays.toString(values));
        out.println("<br>");
        out.println("getProtocol(): " + request.getProtocol());
        out.println("<br>");
        out.println("getRemoteAddr: "+request.getRemoteAddr());
        out.println("<br>");
        out.println("getRemoteHost(): "+ request.getRemoteHost());
        out.println("<br>");
        out.println("getRemotePort(): "+ request.getRemotePort());
        out.println("<br>");
        out.println("getScheme(): "+ request.getScheme());
        out.println("<br>");
        out.println("getServerName(): "+ request.getServerName());
        out.println("<br>");
        out.println("getServerPort(): "+ request.getServerName());
        out.println("<br>");

        out.println("</body>");
        out.println("</html>");
    }
}
