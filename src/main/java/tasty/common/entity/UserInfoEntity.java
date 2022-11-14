package tasty.common.entity;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class UserInfoEntity {

    private int idx;            // 순번
    private String userId;      // 아이디
    private String userPwd;     // 비밀번호
    private String userNm;      // 사용자 이름
    private String regDate;     // 등록일
}
