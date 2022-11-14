package tasty.map.service.impl;

import org.springframework.stereotype.Service;
import tasty.common.entity.MenuInfoEntity;
import tasty.common.entity.RstntInfoEntity;
import tasty.map.dao.MapDAO;
import tasty.map.dto.*;
import tasty.map.service.MapService;

import javax.annotation.Resource;
import java.util.List;

@Service("mapService")
public class MapServiceImpl implements MapService {

    @Resource(name="MapDAO")
    private MapDAO mapDAO;

    @Override
    public List<?> getRstntLocList(LatLngDTO latLngDTO) {
        return mapDAO.getRstntLocList(latLngDTO);
    }

    @Override
    public RstntInfoEntity getRstntInfo(int idx) {
        return mapDAO.getRstntInfo(idx);
    }

    @Override
    public void regRstntInfo(RegRstntInfoDTO regRstntInfoDTO) {
        mapDAO.regRstntInfo(regRstntInfoDTO);
    }

    @Override
    public void udtRstntInfo(UdtRstntInfoDTO udtRstntInfoDTO) {
        mapDAO.udtRstntInfo(udtRstntInfoDTO);
    }

    @Override
    public void delRstntInfo(int idx) {
        mapDAO.delRstntInfo(idx);
    }

    @Override
    public List<?> getMenuList(int rstntIdx) {
        return mapDAO.getMenuList(rstntIdx);
    }

    @Override
    public MenuInfoEntity getMenuInfo(int idx) {
        return mapDAO.getMenuInfo(idx);
    }

    @Override
    public void regMenuInfo(RegMenuInfoDTO regMenuInfoDTO) {
        mapDAO.regMenuInfo(regMenuInfoDTO);
    }

    @Override
    public void udtMenuInfo(UdtMenuInfoDTO udtMenuInfoDTO) {
        mapDAO.udtMenuInfo(udtMenuInfoDTO);
    }

    @Override
    public void delMenuInfo(int idx) {
        mapDAO.delMenuInfo(idx);
    }
}
