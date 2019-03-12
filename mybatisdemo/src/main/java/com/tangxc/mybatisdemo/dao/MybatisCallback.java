package com.tangxc.mybatisdemo.dao;

import org.apache.ibatis.session.SqlSession;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 11:00 2019/3/12
 * @Modified by
 */
public interface MybatisCallback {

    /**
     * 回调方法
     *
     * @param sqlSession
     * @return
     */
    Object doInMybatis(SqlSession sqlSession);

}
