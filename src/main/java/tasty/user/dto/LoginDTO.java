package tasty.user.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class LoginDTO {

    private String userId;
    private String userPwd;
}
