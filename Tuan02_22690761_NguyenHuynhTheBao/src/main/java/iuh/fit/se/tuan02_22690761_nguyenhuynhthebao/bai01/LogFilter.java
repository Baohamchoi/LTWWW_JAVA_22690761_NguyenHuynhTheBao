package iuh.fit.se.tuan02_22690761_nguyenhuynhthebao.bai01;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Date;

@WebFilter(urlPatterns = "/*", asyncSupported = true)
public class LogFilter extends HttpFilter implements Filter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        String servletPath = req.getServletPath();

        System.out.println("#INFO " + new Date() + " - ServletPath :" + servletPath //
                + ", URL =" + req.getRequestURL());

        // Allow the request to continue
        chain.doFilter(req, res);
    }

    @Override
    public void init() throws ServletException {
        System.out.println("LogFilter init!");
    }

    @Override
    public void destroy() {
        System.out.println("LogFilter destroy!");
    }
}
