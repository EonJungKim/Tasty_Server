package tasty.map.service;

import tasty.common.entity.MenuInfoEntity;
import tasty.common.entity.RstntInfoEntity;
import tasty.map.dto.*;

import java.util.List;

public interface MapService {

    List<?> getRstntLocList(LatLngDTO latLngDTO) throws Exception;

    RstntInfoEntity getRstntInfo(int idx) throws Exception;

    void regRstntInfo(RegRstntInfoDTO regRstntInfoDTO) throws Exception;

    void udtRstntInfo(UdtRstntInfoDTO udtRstntInfoDTO) throws Exception;

    void delRstntInfo(int idx) throws Exception;

    List<?> getMenuList(int rstntIdx) throws Exception;

    MenuInfoEntity getMenuInfo(int idx) throws Exception;

    void regMenuInfo(RegMenuInfoDTO regMenuInfoDTO) throws Exception;

    void udtMenuInfo(UdtMenuInfoDTO udtMenuInfoDTO) throws Exception;

    void delMenuInfo(int idx) throws Exception;
}
