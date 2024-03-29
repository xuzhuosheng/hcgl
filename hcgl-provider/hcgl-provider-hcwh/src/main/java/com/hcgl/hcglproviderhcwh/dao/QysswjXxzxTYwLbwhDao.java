package com.hcgl.hcglproviderhcwh.dao;

import com.hcgl.hcglproviderhcwh.entity.QysswjXxzxTYwLbwh;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (QysswjXxzxTYwLbwh)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-21 10:03:41
 */
public interface QysswjXxzxTYwLbwhDao {


    List<QysswjXxzxTYwLbwh> selectAllYwLbwhList(@Param ("lxid") String lxid, @Param ("ppid") String ppid,
                                                @Param ("xhid") String xhid, @Param ("lbmc") String lbmc,
                                                @Param ("pageNum") int pageNum, @Param ("pageSize") int pageSize);

    void insertYwLbwh(@Param ("xhid") String xhid, @Param ("xhmc") String xhmc,
                      @Param ("lbmc") String lbmc, @Param ("fz") int fz,
                      @Param ("ysdj") float ysdj, @Param ("kcl") int kcl);

    void updateYwLbwhZt(@Param ("idList") List<String> idList);

    void selectYwLbwhById(@Param ("id") String id);
}