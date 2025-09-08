package iuh.fit.se.tuan01_22690761_nguyenhuynhthebao;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name= "Bai04", urlPatterns = "/Bai04", initParams = {
        @WebInitParam(name = "username", value = "thebao")
})
public class Bai04 extends HttpServlet {
    private String message;
    private String username;
    private String password;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        message = "Bai 04";
        username = config.getInitParameter("username");
        password = config.getInitParameter("password");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h3>" + "Username: " + username + "</h3>");
        out.println("<h3>" + "Password: " + password + "</h3>");
        out.println("<h3>" + "Context param: " + this.getServletContext().getInitParameter("context-param") + "</h3>");
        out.println("</body></html>");

        out.flush();
        out.close();
    }
}
