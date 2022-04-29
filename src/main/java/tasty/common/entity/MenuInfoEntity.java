package tasty.common.entity;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class MenuInfoEntity {

    private int idx;
    private int rstntIdx;
    private String menuNm;
    private int menuPrc;
    private int fileGrp;
    private String regDate;
    private String udtDate;
}
