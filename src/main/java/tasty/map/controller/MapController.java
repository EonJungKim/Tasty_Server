package tasty.map.controller;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import tasty.common.controller.BaseController;
import tasty.common.dto.StatusDTO;
import tasty.common.entity.MenuInfoEntity;
import tasty.common.entity.RstntInfoEntity;
import tasty.map.dto.*;
import tasty.map.service.MapService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@SuppressWarnings("unchecked")
@Controller
@RequestMapping("/map")
public class MapController extends BaseController {

    @Resource(name = "MapService")
    private MapService mapService;

    @RequestMapping(value = "/rstntLocList", method = RequestMethod.GET)
    public void getRstntLocList(HttpServletResponse res, @ModelAttribute LatLngDTO latLngDTO) {
        JSONObject result = new JSONObject();

        try {
            List<?> rstntLocList = mapService.getRstntLocList(latLngDTO);
            if (rstntLocList.size() > 0) {
                result.put("rstntLocList", rstntLocList);
                result.put("status", StatusDTO.success());
            } else {
                result.put("status", StatusDTO.notFnd());
            }
        } catch (Exception e) {
            result.put("status", StatusDTO.intServErr());
        }

        sendResult(res, result);
    }

    @RequestMapping(value = "/rstntInfo", method = RequestMethod.GET)
    public void getRstntInfo(HttpServletResponse res, @RequestParam(value="idx") int idx) {
        JSONObject result = new JSONObject();

        try {
            RstntInfoEntity rstntInfo = mapService.getRstntInfo(idx);
            if (rstntInfo != null) {
                result.put("rstntInfo", rstntInfo);
                result.put("status", StatusDTO.success());
            } else {
                result.put("status", StatusDTO.notFnd());
            }
        } catch (Exception e) {
            result.put("status", StatusDTO.intServErr());
        }

        sendResult(res, result);
    }

    @RequestMapping(value = "/rstntInfo", method = RequestMethod.POST)
    public void regRstntInfo(HttpServletResponse res, @ModelAttribute RegRstntInfoDTO regRstntInfoDTO) {
        JSONObject result = new JSONObject();

        try {
            mapService.regRstntInfo(regRstntInfoDTO);
            result.put("status", StatusDTO.success());
        } catch (Exception e) {
            result.put("status", StatusDTO.intServErr());
        }

        sendResult(res, result);
    }

    @RequestMapping(value = "/rstntInfo", method = RequestMethod.PUT)
    public void udtRstntInfo(HttpServletResponse res, @ModelAttribute UdtRstntInfoDTO udtRstntInfoDTO) {
        JSONObject result = new JSONObject();

        try {
            mapService.udtRstntInfo(udtRstntInfoDTO);
            result.put("status", StatusDTO.success());
        } catch (Exception e) {
            result.put("status", StatusDTO.intServErr());
        }

        sendResult(res, result);
    }

    @RequestMapping(value = "/rstntInfo", method = RequestMethod.DELETE)
    public void delRstntInfo(HttpServletResponse res, @RequestParam(value="idx") int idx) {
        JSONObject result = new JSONObject();

        try {
            mapService.delRstntInfo(idx);
            result.put("status", StatusDTO.success());
        } catch (Exception e) {
            result.put("status", StatusDTO.intServErr());
        }

        sendResult(res, result);
    }

    @RequestMapping(value = "/menuList", method = RequestMethod.GET)
    public void getMenuList(HttpServletResponse res, @RequestParam(value="rstntIdx") int rstntIdx) {
        JSONObject result = new JSONObject();

        try {
            List<?> menuList = mapService.getMenuList(rstntIdx);
            if (menuList.size() > 0) {
                result.put("menuList", menuList);
                result.put("status", StatusDTO.success());
            } else {
                result.put("status", StatusDTO.notFnd());
            }
        } catch (Exception e) {
            result.put("status", StatusDTO.intServErr());
        }

        sendResult(res, result);
    }

    @RequestMapping(value = "/menuInfo", method = RequestMethod.GET)
    public void getMenuInfo(HttpServletResponse res, @RequestParam(value="idx") int idx) {
        JSONObject result = new JSONObject();

        try {
            MenuInfoEntity menuInfo = mapService.getMenuInfo(idx);
            if (menuInfo != null) {
                result.put("menuInfo", menuInfo);
                result.put("status", StatusDTO.success());
            } else {
                result.put("status", StatusDTO.notFnd());
            }
        } catch (Exception e) {
            result.put("status", StatusDTO.intServErr());
        }

        sendResult(res, result);
    }

    @RequestMapping(value = "/menuInfo", method = RequestMethod.POST)
    public void regMenuInfo(HttpServletResponse res, @ModelAttribute RegMenuInfoDTO regMenuInfoDTO) {
        JSONObject result = new JSONObject();

        try {
            mapService.regMenuInfo(regMenuInfoDTO);
            result.put("status", StatusDTO.success());
        } catch (Exception e) {
            result.put("status", StatusDTO.intServErr());
        }

        sendResult(res, result);
    }

    @RequestMapping(value = "/menuInfo", method = RequestMethod.PUT)
    public void udtMenuInfo(HttpServletResponse res, @ModelAttribute UdtMenuInfoDTO udtMenuInfoDTO) {
        JSONObject result = new JSONObject();

        try {
            mapService.udtMenuInfo(udtMenuInfoDTO);
            result.put("status", StatusDTO.success());
        } catch (Exception e) {
            result.put("status", StatusDTO.intServErr());
        }

        sendResult(res, result);
    }

    @RequestMapping(value = "/menuInfo", method = RequestMethod.DELETE)
    public void delMenuInfo(HttpServletResponse res, @RequestParam(value="idx") int idx) {
        JSONObject result = new JSONObject();

        try {
            mapService.delMenuInfo(idx);
            result.put("status", StatusDTO.success());
        } catch (Exception e) {
            result.put("status", StatusDTO.intServErr());
        }

        sendResult(res, result);
    }
}
