package com.hcgl.hcglproviderxtgn.dao;

import com.hcgl.hcglproviderxtgn.entity.QysswjXxzxTXtUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * (QysswjXxzxTXtUser)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-20 15:24:03
 */
@Repository ("qysswjXxzxTXtUserDao")
public interface QysswjXxzxTXtUserDao {


    QysswjXxzxTXtUser getUserByUserName(@Param ("username") String username, @Param ("password") String password);
}