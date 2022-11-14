package tasty.common.entity;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class FileMngEntity {

    private int fileGrp;        // 파일 관리번호
    private String prpCde;      // 파일 용도
    private String regDate;     // 등록일
    private String udtDate;     // 수정일
}
