package com.hcgl.hcglproviderhcwh.service.impl;

import com.hcgl.hcglproviderhcwh.dao.QysswjXxzxTYwLbwhDao;
import com.hcgl.hcglproviderhcwh.entity.QysswjXxzxTYwLbwh;
import com.hcgl.hcglproviderhcwh.service.QysswjXxzxTYwLbwhService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (QysswjXxzxTYwLbwh)表服务实现类
 *
 * @author makejava
 * @since 2019-09-21 10:03:42
 */
@Service ("qysswjXxzxTYwLbwhService")
public class QysswjXxzxTYwLbwhServiceImpl implements QysswjXxzxTYwLbwhService {
    @Resource
    private QysswjXxzxTYwLbwhDao qysswjXxzxTYwLbwhDao;


    private List<QysswjXxzxTYwLbwh> ywLbwhList;

    @Override
    public List<QysswjXxzxTYwLbwh> getYwLbwhList(String lxid, String ppid, String xhid, String lbmc, int pageNum,
                                                 int pageSize) {
        ywLbwhList = new ArrayList<>();
        ywLbwhList = qysswjXxzxTYwLbwhDao.selectAllYwLbwhList(lxid, ppid, xhid, lbmc, pageNum,
                pageSize);
        return ywLbwhList;
    }

    @Override
    public void addYwLbwh(String xhid, String xhmc, String lbmc, int fz, float ysdj, int kcl) {
        qysswjXxzxTYwLbwhDao.insertYwLbwh(xhid, xhmc, lbmc, fz, ysdj, kcl);
    }

    @Override
    public void editYwLbwhZt(List<String> idList) {
        qysswjXxzxTYwLbwhDao.updateYwLbwhZt(idList);

    }

    @Override
    public QysswjXxzxTYwLbwh getYwLbwhById(String id) {
        QysswjXxzxTYwLbwh ywLbwh = new QysswjXxzxTYwLbwh();
        qysswjXxzxTYwLbwhDao.selectYwLbwhById(id);
        return ywLbwh;
    }


}