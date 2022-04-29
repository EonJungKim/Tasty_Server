package tasty.map.dao;

import org.springframework.stereotype.Repository;
import tasty.common.dao.AbstractDAO;
import tasty.common.entity.MenuInfoEntity;
import tasty.common.entity.RstntInfoEntity;
import tasty.map.dto.*;

import java.util.List;

@Repository("MapDAO")
public class MapDAO extends AbstractDAO {

    public List<?> getRstntLocList(LatLngDTO latLngDTO) {
        return selectList("Map.getRstntLocList", latLngDTO);
    }

    public RstntInfoEntity getRstntInfo(int idx) {
        return (RstntInfoEntity) selectOne("Map.getRstntInfo", idx);
    }

    public void regRstntInfo(RegRstntInfoDTO regRstntInfoDTO) {
        insert("Map.regRstntInfo", regRstntInfoDTO);
    }

    public void udtRstntInfo(UdtRstntInfoDTO udtRstntInfoDTO) {
        update("Map.udtRstntInfo", udtRstntInfoDTO);
    }

    public void delRstntInfo(int idx) {
        delete("Map.delRstntInfo", idx);
    }

    public List<?> getMenuList(int rstntIdx) {
        return selectList("Map.getMenuList", rstntIdx);
    }

    public MenuInfoEntity getMenuInfo(int idx) {
        return (MenuInfoEntity) selectOne("Map.getMenuInfo", idx);
    }

    public void regMenuInfo(RegMenuInfoDTO regMenuInfoDTO) {
        insert("Map.regMenuInfo", regMenuInfoDTO);
    }

    public void udtMenuInfo(UdtMenuInfoDTO udtMenuInfoDTO) {
        update("Map.udtMenuInfo", udtMenuInfoDTO);
    }

    public void delMenuInfo(int idx) {
        delete("Map.delMenuInfo", idx);
    }
}
