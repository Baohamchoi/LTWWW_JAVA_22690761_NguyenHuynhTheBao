package iuh.fit.se.tuan02_22690761_nguyenhuynhthebao.bai01;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;

@WebFilter(urlPatterns = { "*.png", "*.jpg", "*.jpeg", "*.gif" },
        initParams = {
                @WebInitParam(name = "notFoundImage", value = "/images/image_not_found.jpg")
        })
public class ImageFilter extends HttpFilter implements Filter {
    private String imageNotPath;
    @Override
    public void init(FilterConfig config) throws ServletException {
        this.imageNotPath = config.getInitParameter("notFoundImage");
    }

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        //Absolute path of the root directory of the WebApp (WebContent)
        String realRootPath = req.getServletContext().getRealPath("");
        String servletPath = req.getServletPath();

        // Absolute path to the image file
        String imageRealPath = realRootPath + servletPath;

        System.out.println("imageRealPath = " + imageRealPath);

        File file = new File(imageRealPath);
        // Check whether the image file exists”
        if (file.exists()) {
            // allow a request to continue
            // (To go to the requested image file)
            chain.doFilter(req, res);
        } else if (!servletPath.equals(this.imageNotPath)) {
            // Redirect to image file 'image-not-found.png'.
            res.sendRedirect(req.getContextPath() + this.imageNotPath);
        }
    }
}
