package iuh.fit.se.tuan01_22690761_nguyenhuynhthebao;

// @author: The Bao

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "bai02", urlPatterns = "/bai02")
public class Bai02 extends HttpServlet {
    private String message;
    public void init () {
        message = "Bai 02 nha";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1 style='color: blue'>" + message + "</h1>");
    }
}
