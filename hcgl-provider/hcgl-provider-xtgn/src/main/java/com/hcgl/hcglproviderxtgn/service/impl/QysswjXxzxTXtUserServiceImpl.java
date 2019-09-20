package com.hcgl.hcglproviderxtgn.service.impl;

import com.hcgl.hcglproviderxtgn.entity.QysswjXxzxTXtUser;
import com.hcgl.hcglproviderxtgn.dao.QysswjXxzxTXtUserDao;
import com.hcgl.hcglproviderxtgn.service.QysswjXxzxTXtUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (QysswjXxzxTXtUser)表服务实现类
 *
 * @author makejava
 * @since 2019-09-20 15:24:04
 */
@Service ("qysswjXxzxTXtUserService")
public class QysswjXxzxTXtUserServiceImpl implements QysswjXxzxTXtUserService {
    @Resource
    private QysswjXxzxTXtUserDao qysswjXxzxTXtUserDao;


    @Override
    public QysswjXxzxTXtUser getUserByUserName(String username, String password) {
        QysswjXxzxTXtUser qysswjXxzxTXtUser = new QysswjXxzxTXtUser();

        qysswjXxzxTXtUser = qysswjXxzxTXtUserDao.getUserByUserName(username, password);
        return qysswjXxzxTXtUser;
    }
}