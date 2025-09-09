package iuh.fit.se.tuan02_22690761_nguyenhuynhthebao.bai02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

@WebServlet(name = "fileUploadServlet", urlPatterns = {"/file-upload"})
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024, // 1 MB
        maxFileSize = 1024 * 1024 * 5,   // 5 MB
        maxRequestSize = 1024 * 1024 * 10 // 10 MB
)
public class FileUploadServlet extends HttpServlet {

    private String uploadPathToSource; // src/main/webapp/uploads
    private String uploadPathToTarget; // target/.../uploads

    @Override
    public void init() throws ServletException {
        // 1. Đường dẫn tới src/main/webapp/uploads
        String projectDir = System.getProperty("user.dir");
        uploadPathToSource = projectDir + "/src/main/webapp/uploads";
        File srcDir = new File(uploadPathToSource);
        if (!srcDir.exists()) srcDir.mkdirs();

        // 2. Đường dẫn tới target/.../uploads (Tomcat chạy)
        uploadPathToTarget = getServletContext().getRealPath("/uploads");
        File targetDir = new File(uploadPathToTarget);
        if (!targetDir.exists()) targetDir.mkdirs();

        System.out.println("Source folder = " + uploadPathToSource);
        System.out.println("Target folder = " + uploadPathToTarget);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        for (Part filePart : req.getParts()) {
            String fileName = filePart.getSubmittedFileName();
            if (fileName == null || fileName.isEmpty()) continue;

            // Lưu vào src/main/webapp/uploads (lâu dài)
            File fileSrc = new File(uploadPathToSource, fileName);
            Files.copy(filePart.getInputStream(), fileSrc.toPath(),
                    StandardCopyOption.REPLACE_EXISTING);

            // Lưu vào target/.../uploads (để Tomcat hiển thị)
            File fileTarget = new File(uploadPathToTarget, fileName);
            Files.copy(filePart.getInputStream(), fileTarget.toPath(),
                    StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Saved to: " + fileSrc.getAbsolutePath());
            System.out.println("Saved to: " + fileTarget.getAbsolutePath());
        }

        resp.sendRedirect(req.getContextPath() + "/list-images");
    }
}
