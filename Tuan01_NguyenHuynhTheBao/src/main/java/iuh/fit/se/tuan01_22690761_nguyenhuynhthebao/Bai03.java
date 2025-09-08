package iuh.fit.se.tuan01_22690761_nguyenhuynhthebao;

import com.fasterxml.jackson.databind.ObjectMapper;
import iuh.fit.se.tuan01_22690761_nguyenhuynhthebao.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "Bai03", urlPatterns = "/Bai03")
public class Bai03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User("U1", "The Bao", "thebao@example.com");

        // Set kiểu dữ liệu trả về JSON
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        // Dùng Jackson ObjectMapper để chuyển Object -> JSON string
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(user);

        // Ghi ra response
        resp.getWriter().write(jsonString);
    }
}
