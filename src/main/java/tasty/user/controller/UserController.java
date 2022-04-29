package tasty.user.controller;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import tasty.common.controller.BaseController;
import tasty.common.dto.StatusDTO;
import tasty.common.entity.UserInfoEntity;
import tasty.common.util.StrUtil;
import tasty.user.dto.ChkUserPwdDTO;
import tasty.user.dto.LoginDTO;
import tasty.user.dto.RegUserInfoDTO;
import tasty.user.dto.UdtUserInfoDTO;
import tasty.user.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings({"unchecked", "DuplicatedCode"})
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

	@Resource(name = "UserService")
	private UserService userService;

	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public void login(HttpServletResponse res, @ModelAttribute LoginDTO loginDTO) {
		JSONObject result = new JSONObject();

		try {
			UserInfoEntity userInfo = userService.getUserInfo(loginDTO);
			if (userInfo != null) {
				result.put("userInfo", userInfo);
				result.put("status", StatusDTO.success());
			} else {
				result.put("status", StatusDTO.notFnd());
			}
		} catch (Exception e) {
			result.put("status", StatusDTO.intServErr());
		}

		sendResult(res, result);
	}

	@RequestMapping(value = "userId.do", method = RequestMethod.GET)
	public void chkUserId(HttpServletResponse res, @RequestParam(value="userNm") String userNm) {
		JSONObject result = new JSONObject();

		try {
			String userId = userService.getUserId(userNm);
			if (StrUtil.chkNullStr(userId)) {
				result.put("userId", userId);
				result.put("status", StatusDTO.success());
			} else {
				result.put("status", StatusDTO.notFnd());
			}
		} catch (Exception e) {
			result.put("status", StatusDTO.intServErr());
		}

		sendResult(res, result);
	}

	@RequestMapping(value = "userPwd.do", method = RequestMethod.GET)
	public void chkUserPwd(HttpServletResponse res, @ModelAttribute ChkUserPwdDTO chkUserPwdDTO) {
		JSONObject result = new JSONObject();

		try {
			String userPwd = userService.getUserPwd(chkUserPwdDTO);
			if (StrUtil.chkNullStr(userPwd)) {
				result.put("userId", userPwd);
				result.put("status", StatusDTO.success());
			} else {
				result.put("status", StatusDTO.notFnd());
			}
		} catch (Exception e) {
			result.put("status", StatusDTO.intServErr());
		}

		sendResult(res, result);
	}

	@RequestMapping(value = "userInfo.do", method = RequestMethod.POST)
	public void regUserInfo(HttpServletResponse res, @ModelAttribute RegUserInfoDTO regUserInfoDTO) {
		JSONObject result = new JSONObject();

		try {
			userService.regUserInfo(regUserInfoDTO);
			result.put("status", StatusDTO.success());
		} catch (Exception e) {
			result.put("status", StatusDTO.intServErr());
		}

		sendResult(res, result);
	}

	@RequestMapping(value = "userInfo.do", method = RequestMethod.PUT)
	public void udtUserInfo(HttpServletResponse res, @ModelAttribute UdtUserInfoDTO udtUserInfoDTO) {
		JSONObject result = new JSONObject();

		try {
			userService.udtUserInfo(udtUserInfoDTO);
			result.put("status", StatusDTO.success());
		} catch (Exception e) {
			result.put("status", StatusDTO.intServErr());
		}

		sendResult(res, result);
	}

	@RequestMapping(value = "userInfo.do", method = RequestMethod.DELETE)
	public void delUserInfo(HttpServletResponse res, @RequestParam(value="userId") String userId) {
		JSONObject result = new JSONObject();

		try {
			userService.delUserInfo(userId);
			result.put("status", StatusDTO.success());
		} catch (Exception e) {
			result.put("status", StatusDTO.intServErr());
		}

		sendResult(res, result);
	}
}
