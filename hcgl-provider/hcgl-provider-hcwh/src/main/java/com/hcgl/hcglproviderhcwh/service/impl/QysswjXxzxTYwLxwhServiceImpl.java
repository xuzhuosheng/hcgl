package com.hcgl.hcglproviderhcwh.service.impl;

import com.hcgl.hcglproviderhcwh.dao.QysswjXxzxTYwLxwhDao;
import com.hcgl.hcglproviderhcwh.entity.QysswjXxzxTYwLxwh;
import com.hcgl.hcglproviderhcwh.service.QysswjXxzxTYwLxwhService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (QysswjXxzxTYwLxwh)表服务实现类
 *
 * @author makejava
 * @since 2019-09-21 09:59:23
 */
@Service ("qysswjXxzxTYwLxwhService")
public class QysswjXxzxTYwLxwhServiceImpl implements QysswjXxzxTYwLxwhService {
    @Resource
    private QysswjXxzxTYwLxwhDao qysswjXxzxTYwLxwhDao;


    private List<QysswjXxzxTYwLxwh> lxwhList;

    @Override
    public List<QysswjXxzxTYwLxwh> getLxwhList(String searchContent, int pageNum, int pageSize) {
        lxwhList = qysswjXxzxTYwLxwhDao.selectAllLxwh(searchContent, pageNum, pageSize);
        return lxwhList;
    }

    @Override
    public void addLxwh(String lxmc) {
        qysswjXxzxTYwLxwhDao.insertLxwh(lxmc);
    }

    @Override
    public void editLxwh(String id, String lxmc) {
        qysswjXxzxTYwLxwhDao.updateLxwh(id, lxmc);
    }

    @Override
    public void editLxwhZt(List<String> idList) {
        qysswjXxzxTYwLxwhDao.updateLxwhZt(idList);
    }

    @Override
    public QysswjXxzxTYwLxwh getLxwhById(String id) {
        QysswjXxzxTYwLxwh ywLxwh = new QysswjXxzxTYwLxwh();
        ywLxwh = qysswjXxzxTYwLxwhDao.selectOneById(id);
        return ywLxwh;
    }


}