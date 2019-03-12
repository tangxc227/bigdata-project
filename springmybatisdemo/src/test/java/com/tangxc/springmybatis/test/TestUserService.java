package com.tangxc.springmybatis.test;

import com.tangxc.springmybatis.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 15:29 2019/3/12
 * @Modified by
 */
public class TestUserService {

    @Test
    public void testSelectAll() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) ac.getBean("userService");
        System.out.println(userService.selectAll());
    }

}
