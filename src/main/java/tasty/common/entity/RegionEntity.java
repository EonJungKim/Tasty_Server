package tasty.common.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @ToString
public class RegionEntity {

    private int idx;        // 순번
    private String code;    // 지역 코드
    private String name;    // 지역명
}
