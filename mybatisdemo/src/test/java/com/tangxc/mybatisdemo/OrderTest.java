package com.tangxc.mybatisdemo;

import com.tangxc.mybatisdemo.domain.Order;
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
 * @Date Created in 09:41 2019/3/12
 * @Modified by
 */
public class OrderTest {

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
        user.setId(2);

        Order order = new Order();
        order.setOrderNo("No005");
        order.setUser(user);

        session.insert("orders.insert", order);
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

        Order order = session.selectOne("orders.selectOne", 1);
        System.out.println(order);
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

        List<Order> orderList = session.selectList("orders.selectAll");
        System.out.println(orderList);
        session.commit();
        session.close();
    }

}
