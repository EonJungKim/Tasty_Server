package tasty.user.controller;

import org.json.simple.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tasty.common.controller.BaseController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

	@RequestMapping(value="test.do", method=RequestMethod.GET)
	public void testGet(HttpServletResponse res, HttpServletRequest req) {
		JSONObject result = new JSONObject();
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		JSONObject status = new JSONObject();
		status.put("resultCd", HttpStatus.OK);
		status.put("resultMsg", "success");
		
		JSONObject userInfo = new JSONObject();
		userInfo.put("id", id);
		userInfo.put("pwd", pwd);
		userInfo.put("name", "김언중");
		
		result.put("status", status);
		result.put("userInfo", userInfo);
		
		sendResult(res, result);
	}
	
	@RequestMapping(value="test.do", method=RequestMethod.POST)
	public void testPost(HttpServletResponse res, HttpServletRequest req) {
		JSONObject result = new JSONObject();
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");

		JSONObject status = new JSONObject();
		status.put("resultCd", HttpStatus.OK);
		status.put("resultMsg", "success");
		
		JSONObject userInfo = new JSONObject();
		userInfo.put("id", id);
		userInfo.put("pwd", pwd);
		userInfo.put("name", "김언중");
		
		result.put("status", status);
		result.put("userInfo", userInfo);

		sendResult(res, result);
	}
}
