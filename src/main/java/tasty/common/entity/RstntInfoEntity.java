package tasty.common.entity;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class RstntInfoEntity {

    private int idx;            // 식당 순번
    private String rstntNm;     // 상호명
    private String rstntCat;    // 식당 분류
    private String rstntPhn;    // 전화번호
    private String rstntAdr;    // 주소
    private String offDate;     // 휴일
    private String memo;        // 메모
    private String geom;        // 좌표
}