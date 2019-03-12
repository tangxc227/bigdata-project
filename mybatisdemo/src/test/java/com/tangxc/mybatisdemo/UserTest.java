package com.tangxc.mybatisdemo;

import com.tangxc.mybatisdemo.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 15:27 2019/3/8
 * @Modified by
 */
public class UserTest {

    @Test
    public void testInsert() throws IOException {
        // 指定配置文件的路径（类路径）
        String resource = "mybatis-config.xml";
        // 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 创建会话工厂，相当于连接池
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 开启会话，相当于打开连接
        SqlSession session = sqlSessionFactory.openSession();

        User user = new User();
        user.setName("Lily");
        user.setAge(18);

        session.insert("users.insert", user);
        session.commit();
        session.close();
    }

    @Test
    public void testUpdate() throws IOException {
        // 指定配置文件的路径（类路径）
        String resource = "mybatis-config.xml";
        // 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 创建会话工厂，相当于连接池
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 开启会话，相当于打开连接
        SqlSession session = sqlSessionFactory.openSession();

        User user = new User();
        user.setId(2);
        user.setName("Lily");
        user.setAge(18);

        session.update("users.update", user);
        session.commit();
        session.close();
    }

    @Test
    public void testSelectOne() throws IOException {
        // 指定配置文件的路径（类路径）
        String resource = "mybatis-config.xml";
        // 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 创建会话工厂，相当于连接池
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 开启会话，相当于打开连接
        SqlSession session = sqlSessionFactory.openSession();

        User u = session.selectOne("users.selectOne", 1);
        System.out.println(u);
        session.commit();
        session.close();
    }

    @Test
    public void testSelectAll() throws IOException {
        // 指定配置文件的路径（类路径）
        String resource = "mybatis-config.xml";
        // 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 创建会话工厂，相当于连接池
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 开启会话，相当于打开连接
        SqlSession session = sqlSessionFactory.openSession();

        List<User> userList = session.selectList("users.selectAll");
        System.out.println(userList);
        session.commit();
        session.close();
    }

}
