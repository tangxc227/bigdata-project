package com.tangxc.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 12:42 2019/3/13
 * @Modified by
 */
@Controller
public class HomeController {

    @RequestMapping({"/index", "/home"})
    public String openHome() {
        System.out.println("hello world");
        return "index";
    }

}
