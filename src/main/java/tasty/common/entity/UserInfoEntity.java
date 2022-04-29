package tasty.common.entity;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class UserInfoEntity {

    private int idx;
    private String userId;
    private String userPwd;
    private String userNm;
    private String regDate;
}
