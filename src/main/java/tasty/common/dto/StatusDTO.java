package tasty.common.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter @Setter @ToString
public class StatusDTO {

    private final static String API_NOT_FND = "정보를 조회할 수 없습니다.";
    private final static String API_ERR_MSG = "서버에 문제가 발생하였습니다. 관리자에게 문의하세요.";

    private HttpStatus resultCd;
    private String resultMsg;

    public StatusDTO(HttpStatus resultCd) {
        this.resultCd = resultCd;
    }

    public StatusDTO(HttpStatus resultCd, String resultMsg) {
        this.resultCd = resultCd;
        this.resultMsg = resultMsg;
    }

    public static StatusDTO success() {
        return new StatusDTO(HttpStatus.OK);
    }

    public static StatusDTO notFnd() {
        return new StatusDTO(HttpStatus.NOT_FOUND, API_NOT_FND);
    }

    public static StatusDTO intServErr() {
        return new StatusDTO(HttpStatus.INTERNAL_SERVER_ERROR, API_ERR_MSG);
    }
}
