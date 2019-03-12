package com.tangxc.springdemo.service;

import com.tangxc.springdemo.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 12:35 2019/3/12
 * @Modified by
 */
@Service("welcomeService")
public class WelcomeService {

    private String message;

    @Autowired
    private UserDAO userDAO;

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayHello() {
        System.out.println(message);
        this.userDAO.insert();
    }

}
