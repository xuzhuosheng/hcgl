package com.hcgl.hcglproviderhcwh.controller;

import com.hcgl.hcglproviderhcwh.entity.QysswjXxzxTYwXhwh;
import com.hcgl.hcglproviderhcwh.service.QysswjXxzxTYwXhwhService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (QysswjXxzxTYwXhwh)表控制层
 *
 * @author makejava
 * @since 2019-09-21 10:02:29
 */
@Api (value = "耗材维护-类型维护", description = "品牌维护类")
@PropertySource ("classpath:application.yml")
@RestController
@RequestMapping ("/Xhwh")
public class QysswjXxzxTYwXhwhController {
    /**
     * 服务对象
     */
    @Resource
    private QysswjXxzxTYwXhwhService qysswjXxzxTYwXhwhService;


    @Value ("${pageSize}")
    private int pageSize;

    private List<QysswjXxzxTYwXhwh> xhwhList;

    @ApiOperation (value = "获取所有在用品牌，并且分页", notes = "1.返回List。2.页码大于0,分页 ")
    @ApiImplicitParams ({
            @ApiImplicitParam (name = "lxid", value = "类型id，下拉获取", paramType = "query", required = false),
            @ApiImplicitParam (name = "ppid", value = "类型id，下拉获取", paramType = "query", required = false),
            @ApiImplicitParam (name = "xhmc", value = "型号名称", paramType = "query", required = false),
            @ApiImplicitParam (name = "pageNum", value = "页码", paramType = "query", required = true)
    })
    @ApiResponse (code = 400, message = "参数没有填好", response = String.class)
    @RequestMapping (value = "/getXhwhList", method = RequestMethod.POST)
    @ResponseBody
    public List<QysswjXxzxTYwXhwh> getXhwhList(@RequestParam (required = false) String lxid,
                                               @RequestParam (required = false) String ppid,
                                               @RequestParam (required = false) String xhmc,
                                               @RequestParam (required = true) int pageNum) {
        xhwhList = new ArrayList<>();
        try {
            xhwhList = qysswjXxzxTYwXhwhService.getXhwhList(lxid, ppid, xhmc, pageNum, pageSize);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return xhwhList;
    }


}