package tasty.common.entity;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class MenuInfoEntity {

    private int idx;            // 메뉴 순번
    private int rstntIdx;       // 식당 순번
    private String menuNm;      // 메뉴명
    private int menuPrc;        // 메뉴 가격
    private int fileGrp;        // 메뉴 사진 파일 그룹번호
    private String regDate;     // 등록일
    private String udtDate;     // 수정일
}
