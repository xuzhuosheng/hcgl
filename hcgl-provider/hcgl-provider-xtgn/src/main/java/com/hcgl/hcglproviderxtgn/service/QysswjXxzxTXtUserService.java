package com.hcgl.hcglproviderxtgn.service;

import com.hcgl.hcglproviderxtgn.entity.QysswjXxzxTXtUser;
import java.util.List;

/**
 * (QysswjXxzxTXtUser)表服务接口
 *
 * @author makejava
 * @since 2019-09-20 15:24:03
 */
public interface QysswjXxzxTXtUserService {


    QysswjXxzxTXtUser getUserByUserName(String username, String password);
}