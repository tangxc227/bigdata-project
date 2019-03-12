package com.tangxc.springdemo;

import com.tangxc.springdemo.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 12:36 2019/3/12
 * @Modified by
 */
public class App {

    public static void main(String[] args) {
        // 创建容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        WelcomeService welcomeService = (WelcomeService) ac.getBean("welcomeService");
        welcomeService.setMessage("hello world");
        welcomeService.sayHello();
    }

}
