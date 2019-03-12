package com.tangxc.springmybatis.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 14:21 2019/3/12
 * @Modified by
 */
public class TestDataSource {

    @Test
    public void testConn() throws SQLException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        DataSource dataSource = (DataSource) ac.getBean("dataSource");
        System.out.println(dataSource.getConnection());
    }

}
