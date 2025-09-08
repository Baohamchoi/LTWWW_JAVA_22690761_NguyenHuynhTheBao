package iuh.fit.se.tuan01_22690761_nguyenhuynhthebao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet(name = "Bai05", urlPatterns = "/Bai05")
public class Bai05 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp, "GET");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp, "POST");
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp, String method) throws IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        String fullname = req.getParameter("fullname");
        String email = req.getParameter("email");
        String password = req.getParameter("password"); // không hiển thị ra
        String gender = req.getParameter("gender");
        String[] hobbies = req.getParameterValues("hobby");
        String about = req.getParameter("about");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h2>Kết quả đăng ký (method: " + method + ")</h2>");
        if (fullname != null && email != null && password != null) {
            out.println("<p><b>Họ tên:</b> " + fullname + "</p>");
            out.println("<p><b>Email:</b> " + email + "</p>");
            out.println("<p><b>Giới tính:</b> " + gender + "</p>");
            out.println("<p><b>Sở thích:</b> " + (hobbies != null ? Arrays.toString(hobbies) : "Không chọn") + "</p>");
            out.println("<p><b>Giới thiệu:</b> " + about + "</p>");
        } else {
            out.println("<p style='color:red'>Vui lòng nhập đầy đủ thông tin!</p>");
        }
        out.println("</body></html>");
    }
}
