package com.tangxc.mybatisdemo;

import com.tangxc.mybatisdemo.dao.UserDAO;
import com.tangxc.mybatisdemo.domain.User;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 15:01 2019/3/8
 * @Modified by
 */
public class App {

    public static void main(String[] args) {
        User user = new UserDAO().selectOne(1);
        System.out.println(user);
    }

}
