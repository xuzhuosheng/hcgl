package com.hcgl.hcglproviderhcwh.service.impl;

import com.hcgl.hcglproviderhcwh.dao.QysswjXxzxTYwXhwhDao;
import com.hcgl.hcglproviderhcwh.entity.QysswjXxzxTYwXhwh;
import com.hcgl.hcglproviderhcwh.service.QysswjXxzxTYwXhwhService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (QysswjXxzxTYwXhwh)表服务实现类
 *
 * @author makejava
 * @since 2019-09-21 10:02:29
 */
@Service ("qysswjXxzxTYwXhwhService")
public class QysswjXxzxTYwXhwhServiceImpl implements QysswjXxzxTYwXhwhService {
    @Resource
    private QysswjXxzxTYwXhwhDao qysswjXxzxTYwXhwhDao;


    private List<QysswjXxzxTYwXhwh> xhwhList;

    @Override
    public List<QysswjXxzxTYwXhwh> getXhwhList(String lxid, String ppid, String xhmc, int pageNum, int pageSize) {
        xhwhList = new ArrayList<>();
        xhwhList = qysswjXxzxTYwXhwhDao.selectAllXhwh(lxid, ppid, xhmc, pageNum, pageSize);
        return xhwhList;
    }

    @Override
    public void addXhwh(String ppid, String ppmc, String xhmc) {
        qysswjXxzxTYwXhwhDao.insertXhwh(ppid, ppmc, xhmc);
    }

    @Override
    public QysswjXxzxTYwXhwh getXhwhById(String id) {
        QysswjXxzxTYwXhwh qysswjXxzxTYwXhwh = new QysswjXxzxTYwXhwh();
        qysswjXxzxTYwXhwh = qysswjXxzxTYwXhwhDao.selectOneById(id);
        return qysswjXxzxTYwXhwh;
    }

    @Override
    public void editXhwhZt(List<String> idList) {
        qysswjXxzxTYwXhwhDao.updateXhwhZt(idList);
    }

    @Override
    public void editXhwh(String ppid, String ppmc, String xhmc, String id) {
        qysswjXxzxTYwXhwhDao.updateXhwh(ppid, ppmc, xhmc, id);
    }

    @Override
    public List<QysswjXxzxTYwXhwh> getXhwhListByPpid(String ppid) {
        xhwhList = new ArrayList<>();
        xhwhList = qysswjXxzxTYwXhwhDao.selectXhwhListByPpid(ppid);
        return xhwhList;
    }
}