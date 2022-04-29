package tasty.common.entity;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class RstntInfoEntity {

    private int idx;
    private String rstntNm;
    private String rstntCat;
    private String rstntPhn;
    private String rstntAdr;
    private String offDate;
    private String memo;
    private String geom;
}