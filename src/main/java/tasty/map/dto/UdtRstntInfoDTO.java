package tasty.map.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class UdtRstntInfoDTO {

    private int idx;
    private String rstntNm;
    private String rstntCat;
    private String rstntPhn;
    private String rstntAdr;
    private String offDate;
    private String memo;
    private double lat;
    private double lng;
}
