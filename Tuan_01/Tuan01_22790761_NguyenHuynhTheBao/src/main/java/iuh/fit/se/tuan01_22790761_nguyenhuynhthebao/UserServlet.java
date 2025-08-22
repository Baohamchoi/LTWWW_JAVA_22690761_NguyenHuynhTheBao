package iuh.fit.se.tuan01_22790761_nguyenhuynhthebao;

import com.fasterxml.jackson.databind.ObjectMapper;
import iuh.fit.se.tuan01_22790761_nguyenhuynhthebao.models.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "userServlet", value = "/userServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User("The Bao", 21);

        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);
        resp.getWriter().write(json);
    }
}
