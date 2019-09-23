package com.hcgl.hcglproviderhcwh.service.impl;

import com.hcgl.hcglproviderhcwh.dao.QysswjXxzxTYwPpwhDao;
import com.hcgl.hcglproviderhcwh.entity.QysswjXxzxTYwPpwh;
import com.hcgl.hcglproviderhcwh.service.QysswjXxzxTYwPpwhService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (QysswjXxzxTYwPpwh)表服务实现类
 *
 * @author makejava
 * @since 2019-09-21 10:01:41
 */
@Service ("qysswjXxzxTYwPpwhService")
public class QysswjXxzxTYwPpwhServiceImpl implements QysswjXxzxTYwPpwhService {
    @Resource
    private QysswjXxzxTYwPpwhDao qysswjXxzxTYwPpwhDao;

    private List<QysswjXxzxTYwPpwh> ppwhList;

    @Override
    public List<QysswjXxzxTYwPpwh> getPpwhList(String lxmc, String ppmc, int pageNum, int pageSize) {
        ppwhList = qysswjXxzxTYwPpwhDao.selectAllPpwh(lxmc, ppmc, pageNum, pageSize);
        return ppwhList;
    }

    @Override
    public void addPpwh(String lxid, String lxmc, String ppmc) {
        qysswjXxzxTYwPpwhDao.insertPpwh(lxid, lxmc, ppmc);
    }

    @Override
    public void editPpwh(String id, String ppmc) {
        qysswjXxzxTYwPpwhDao.updatePpwh(id, ppmc);
    }

    @Override
    public void editPpwhZt(List<String> idList) {
        qysswjXxzxTYwPpwhDao.updatePpwhZt(idList);
    }

//    @Override
//    public int addPpwh(String ppmc) {
//
//        int id = qysswjXxzxTYwPpwhDao.insertPpwh(ppmc);
//        return id;
//    }
}