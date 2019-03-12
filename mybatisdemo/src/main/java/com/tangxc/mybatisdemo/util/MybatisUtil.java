package com.tangxc.mybatisdemo.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 10:46 2019/3/12
 * @Modified by
 */
public class MybatisUtil {

    private static SqlSessionFactory sessionFactory;

    static {
        try {
            // 加载配置文件
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            // 创建会话工厂，相当于连接池
            sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 开启会话
     *
     * @return
     */
    public static SqlSession openSession() {
        return sessionFactory.openSession();
    }

    /**
     * 关闭会话
     */
    public static void closeSession(SqlSession sqlSession){
        if(sqlSession != null){
            sqlSession.close();
        }
    }

    /**
     * 关闭会话
     */
    public static void rollbackTx(SqlSession sqlSession) {
        if (sqlSession != null) {
            sqlSession.rollback();
        }
    }

}
