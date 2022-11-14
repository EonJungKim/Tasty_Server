package tasty.common.entity;

import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class FileDtlEntity {

    private int idx;            // 파일 순번
    private int fileGrp;        // 파일 관리번호
    private String fileCat;     // 파일 유형
    private String fileExt;     // 파일 확자자
    private String filePath;    // 파일 저장 경로
    private String orgFileNm;   // 원본 파일명
    private String savFileNm;   // 저장된 파일명
    private String regDate;     // 등록일
}
