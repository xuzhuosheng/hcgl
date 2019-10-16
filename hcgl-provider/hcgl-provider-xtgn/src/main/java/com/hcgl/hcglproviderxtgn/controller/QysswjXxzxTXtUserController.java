package com.hcgl.hcglproviderxtgn.controller;


import com.hcgl.hcglproviderxtgn.entity.QysswjXxzxTXtUser;
import com.hcgl.hcglproviderxtgn.service.QysswjXxzxTXtUserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (QysswjXxzxTXtUser)表控制层
 *
 * @author makejava
 * @since 2019-08-30 11:29:27
 */
@Api (description = "用户类")
@RestController
@RequestMapping ("/user")
public class QysswjXxzxTXtUserController {

    @Autowired
    QysswjXxzxTXtUserService qysswjXxzxTXtUserService;


    private QysswjXxzxTXtUser qysswjXxzxTXtUser;

//    /**
//     * 服务对象
//     */
//
//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
//    @ApiOperation (value = "SelectOne 方法")
//    @ApiImplicitParam (name = "name", value = "用户名", paramType = "query")
//    @GetMapping ("/selectOne")
//    @ResponseBody
//    public String selectOne(@RequestParam (required = false) String name) {
//        System.out.println("selectOne");
//        return "welcome:" + name;
//    }

    @ApiOperation (value = "登录验证", notes = "根据用户名和密码验证用户")
    @ApiImplicitParams ({
            @ApiImplicitParam (name = "username", value = "用户名", paramType = "query"),
            @ApiImplicitParam (name = "password", value = "密码", paramType = "query")
    })
    @ApiResponse (code = 400, message = "参数没有填好", response = String.class)
    @RequestMapping (value = "/doLogin", method = RequestMethod.POST)
    @ResponseBody
    public String doLogin(@RequestParam (required = true) String username,
                          @RequestParam (required = true) String password) {
        String resultStr = "";
        System.out.println(username + "222");

        qysswjXxzxTXtUser = new QysswjXxzxTXtUser();
        qysswjXxzxTXtUser = qysswjXxzxTXtUserService.getUserByUserName(username, password);
        if (qysswjXxzxTXtUser != null) {
            resultStr = "success";
        }
        return resultStr;
    }


    @RequestMapping (value = "/Test", method = RequestMethod.POST)
    @ResponseBody
    public List<String> Test(@RequestParam (required = false) String name,
                             @RequestParam (required = false) int age) {

        System.out.println(name + "----" + age);
        List<String> strList = new ArrayList<>();
        strList.add(name);
        strList.add(String.valueOf(age));
        return strList;

    }

}
