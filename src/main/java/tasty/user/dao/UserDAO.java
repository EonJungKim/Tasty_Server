package tasty.user.dao;

import org.springframework.stereotype.Repository;
import tasty.common.dao.AbstractDAO;
import tasty.common.entity.UserInfoEntity;
import tasty.user.dto.ChkUserPwdDTO;
import tasty.user.dto.LoginDTO;
import tasty.user.dto.RegUserInfoDTO;
import tasty.user.dto.UdtUserInfoDTO;

@Repository("UserDAO")
public class UserDAO extends AbstractDAO {

    public UserInfoEntity getUserInfo(LoginDTO loginDTO) {
        return (UserInfoEntity) selectOne("User.getUserInfo", loginDTO);
    }

    public String getUserId(String userNm) {
        return (String) selectOne("User.getUserId", userNm);
    }

    public String getUserPwd(ChkUserPwdDTO chkUserPwdDTO) {
        return (String) selectOne("User.getUserPwd", chkUserPwdDTO);
    }

    public void regUserInfo(RegUserInfoDTO regUserInfoDTO) {
        insert("User.regUserInfo", regUserInfoDTO);
    }

    public void udtUserInfo(UdtUserInfoDTO udtUserInfoDTO) {
        update("User.udtUserInfo", udtUserInfoDTO);
    }

    public void delUserInfo(String userId) {
        delete("User.delUserInfo", userId);
    }
}
