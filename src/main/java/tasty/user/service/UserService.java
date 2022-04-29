package tasty.user.service;

import tasty.common.entity.UserInfoEntity;
import tasty.user.dto.ChkUserPwdDTO;
import tasty.user.dto.LoginDTO;
import tasty.user.dto.RegUserInfoDTO;
import tasty.user.dto.UdtUserInfoDTO;

public interface UserService {

    UserInfoEntity getUserInfo(LoginDTO loginDTO) throws Exception;

    String getUserId(String userNm) throws Exception;

    String getUserPwd(ChkUserPwdDTO chkUserPwdDTO) throws Exception;

    void regUserInfo(RegUserInfoDTO regUserInfoDTO) throws Exception;

    void udtUserInfo(UdtUserInfoDTO udtUserInfoDTO) throws Exception;

    void delUserInfo(String userId) throws Exception;
}
