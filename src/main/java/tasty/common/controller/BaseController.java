package tasty.common.controller;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

@Controller
public class BaseController {

	protected void sendResult(HttpServletResponse res, Object result) {
        try {
            Gson gson = new Gson();
            String json = gson.toJson(result);
            res.setContentType("text/html;charset=utf-8");
            res.getWriter().print(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void sendFile(HttpServletResponse res, File file, String fileName) throws Exception {
        if (file != null && file.exists()) {
            res.setHeader("Content-Disposition", new String(fileName.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1));
            res.setContentType("Content-type:application/octet-stream;charset=MS949");
            res.setContentLength((int) file.length());
            res.setHeader("Content-Transfer-Encoding", "binary");
            res.setHeader("Pragma", "no-cache");
            res.setHeader("Expires", "-1;");

            OutputStream out = res.getOutputStream();
            FileInputStream fis = new FileInputStream(file);
            FileCopyUtils.copy(fis, out);
            fis.close();
            out.flush();
            out.close();
        }
    }
}
