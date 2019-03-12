package com.tangxc.mybatisdemo.dao;

import com.tangxc.mybatisdemo.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 10:59 2019/3/12
 * @Modified by
 */
public class DAOTemplate {

    public static Object execute(MybatisCallback cb) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.openSession();
            Object ret = cb.doInMybatis(sqlSession);
            sqlSession.commit();
            return ret ;
        } catch (Exception e) {
            MybatisUtil.rollbackTx(sqlSession);
        } finally {
            MybatisUtil.closeSession(sqlSession);
        }
        return null ;
    }

}
