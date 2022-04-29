package tasty.user.service.impl;

import org.springframework.stereotype.Service;
import tasty.common.entity.UserInfoEntity;
import tasty.user.dao.UserDAO;
import tasty.user.dto.ChkUserPwdDTO;
import tasty.user.dto.LoginDTO;
import tasty.user.dto.RegUserInfoDTO;
import tasty.user.dto.UdtUserInfoDTO;
import tasty.user.service.UserService;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource(name="UserDAO")
    private UserDAO userDAO;

    @Override
    public UserInfoEntity getUserInfo(LoginDTO loginDTO) {
        return userDAO.getUserInfo(loginDTO);
    }

    @Override
    public String getUserId(String userNm) {
        return userDAO.getUserId(userNm);
    }

    @Override
    public String getUserPwd(ChkUserPwdDTO chkUserPwdDTO) {
        return userDAO.getUserPwd(chkUserPwdDTO);
    }

    @Override
    public void regUserInfo(RegUserInfoDTO regUserInfoDTO) {
        userDAO.regUserInfo(regUserInfoDTO);
    }

    @Override
    public void udtUserInfo(UdtUserInfoDTO udtUserInfoDTO) {
        userDAO.udtUserInfo(udtUserInfoDTO);
    }

    @Override
    public void delUserInfo(String userId) {
        userDAO.delUserInfo(userId);
    }
}
