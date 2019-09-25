package com.hcgl.hcglproviderhcwh.dao;

import com.hcgl.hcglproviderhcwh.entity.QysswjXxzxTYwPpwh;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (QysswjXxzxTYwPpwh)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-21 10:01:41
 */
public interface QysswjXxzxTYwPpwhDao {


    List<QysswjXxzxTYwPpwh> selectAllPpwh(@Param ("lxid") String lxid, @Param ("ppmc") String ppmc,
                                          @Param ("pageNum") int pageNum, @Param ("pageSize") int pageSize);

    void insertPpwh(@Param ("lxid") String lxid, @Param ("lxmc") String lxmc, @Param ("ppmc") String ppmc);

    void updatePpwh(@Param ("id") String id, @Param ("ppmc") String ppmc);

    void updatePpwhZt(@Param ("idList") List<String> idList);

    QysswjXxzxTYwPpwh selectOneById(@Param ("id") String id);

//    int insertPpwh(@Param ("ppmc") String ppmc);
}