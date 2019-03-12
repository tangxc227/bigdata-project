package com.tangxc.springmybatis.service.impl;

import com.tangxc.springmybatis.dao.BaseDAO;
import com.tangxc.springmybatis.domain.User;
import com.tangxc.springmybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 15:03 2019/3/12
 * @Modified by
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Override
    @Resource(name = "userDAO")
    public void setBaseDAO(BaseDAO<User> baseDAO) {
        super.setBaseDAO(baseDAO);
    }

}
