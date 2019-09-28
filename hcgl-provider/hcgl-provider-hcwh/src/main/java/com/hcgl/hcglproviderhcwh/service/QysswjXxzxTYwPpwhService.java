package com.hcgl.hcglproviderhcwh.service;

import com.hcgl.hcglproviderhcwh.entity.QysswjXxzxTYwPpwh;

import java.util.List;

/**
 * (QysswjXxzxTYwPpwh)表服务接口
 *
 * @author makejava
 * @since 2019-09-21 10:01:41
 */
public interface QysswjXxzxTYwPpwhService {


    List<QysswjXxzxTYwPpwh> getPpwhList(String lxid, String ppmc, int pageNum, int pageSize);

    void addPpwh(String lxid, String lxmc, String ppmc);

    void editPpwh(String id, String ppmc, String lxid, String lxmc);

    void editPpwhZt(List<String> idList);

    QysswjXxzxTYwPpwh getPpwhById(String id);

    List<QysswjXxzxTYwPpwh> getPpwhListByLxid(String lxid);

//    int addPpwh(String ppmc);
}