package tasty.map.controller;

import org.json.simple.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tasty.common.controller.BaseController;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Controller
@RequestMapping("/map")
public class MapController extends BaseController {

    @RequestMapping(value="/restInfo", method= RequestMethod.GET)
    public void getRestInfo(HttpServletResponse res) {
        JSONObject result = new JSONObject();

        String id = req.getParameter("id");

        System.out.println("id : " + id);
        System.out.println("pwd : " + pwd);

        JSONObject status = new JSONObject();
        status.put("resultCd", HttpStatus.OK);
        status.put("resultMsg", "success");

        JSONObject userInfo = new JSONObject();
        userInfo.put("id", id);
        userInfo.put("pwd", pwd);
        userInfo.put("name", "김언중");

        result.put("status", status);
        result.put("userInfo", userInfo);

        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        out.print(result);
    }
}
