package com.hcgl.hcglproviderxtgn.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (QysswjXxzxTXtUser)表控制层
 *
 * @author makejava
 * @since 2019-08-30 11:29:27
 */
@RestController
@Api (description = "用户类")
@RequestMapping("/user")
public class QysswjXxzxTXtUserController {
    /**
     * 服务对象
     */

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping ("/selectOne")
    @ApiOperation (value = "SelectOne 方法")
    public String selectOne() {
        System.out.println("selectOne");
        return "sss";
    }
}