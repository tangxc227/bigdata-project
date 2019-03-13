package com.tangxc.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 14:19 2019/3/13
 * @Modified by
 */
@Controller
public class RegController {

    @RequestMapping("/toReg")
    public String toRegView(){
        return "reg" ;
    }

    @RequestMapping("/doReg")
    public String doReg(@RequestParam("username") String username,
                        @RequestParam("password") String password){
        System.out.println("插入数据");
        System.out.println(username + "," + password);
        return "index" ;
    }

    @RequestMapping("/doReg2")
    public String doReg(HttpServletRequest req) {
        System.out.println("插入数据222");
        String user = req.getParameter("username");
        System.out.println(user);
        return "index";
    }

}
