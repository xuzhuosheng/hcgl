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


    List<QysswjXxzxTYwPpwh> getPpwhList(String lxmc, String ppmc, int pageNum, int pageSize);

    void addPpwh(String lxid, String lxmc, String ppmc);

    void editPpwh(String id, String ppmc);

    void editPpwhZt(List<String> idList);

//    int addPpwh(String ppmc);
}