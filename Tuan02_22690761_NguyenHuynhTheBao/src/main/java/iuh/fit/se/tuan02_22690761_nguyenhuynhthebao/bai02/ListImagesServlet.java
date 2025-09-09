package iuh.fit.se.tuan02_22690761_nguyenhuynhthebao.bai02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "listImagesServlet", urlPatterns = {"/list-images"})
public class ListImagesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String imagePath = getServletContext().getRealPath("/imageUploads");
        File imageDir = new File(imagePath);

        out.println("<!DOCTYPE html>");
        out.println("<html><head><meta charset='UTF-8'><title>Uploaded Images</title></head><body>");
        out.println("<h2>Uploaded Images</h2>");

        if (imageDir.exists() && imageDir.isDirectory()) {
            File[] files = imageDir.listFiles();
            if (files != null && files.length > 0) {
                for (File file : files) {
                    String fileName = file.getName();
                    out.println("<div style='margin:10px; display:inline-block;'>");
                    out.println("<img src='imageUploads/" + fileName + "' width='200' style='border:1px solid #ccc;'/>");
                    out.println("<p>" + fileName + "</p>");
                    out.println("</div>");
                }
            } else {
                out.println("<p>No images uploaded yet.</p>");
            }
        } else {
            out.println("<p>Image directory not found!</p>");
        }

        out.println("</body></html>");
    }
}
