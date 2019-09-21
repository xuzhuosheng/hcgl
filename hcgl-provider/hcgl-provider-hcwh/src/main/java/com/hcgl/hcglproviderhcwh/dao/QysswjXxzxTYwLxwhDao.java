package com.hcgl.hcglproviderhcwh.dao;

import com.hcgl.hcglproviderhcwh.entity.QysswjXxzxTYwLxwh;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (QysswjXxzxTYwLxwh)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-21 09:59:22
 */
@Repository ("qysswjXxzxTYwLxwhDao")
public interface QysswjXxzxTYwLxwhDao {


    List<QysswjXxzxTYwLxwh> selectAllLxwh(@Param ("pageSize") String pageSize, @Param ("pageNum") int pageNum,
                                          @Param ("searchContent") int searchContent);

    void insertLxwh(@Param ("lxmc") String lxmc);

    void updateLxwh(@Param ("id") String id, @Param ("lxmc") String lxmc);

    void updateLxwhZt(@Param ("idList") List<String> idList);
}