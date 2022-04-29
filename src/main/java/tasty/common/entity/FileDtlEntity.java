package tasty.common.entity;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class FileDtlEntity {

    private int idx;
    private int fileGrp;
    private String fileCat;
    private String fileExt;
    private String filePath;
    private String orgFileNm;
    private String savFileNm;
    private String regDate;
}
