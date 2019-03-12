package com.tangxc.springmybatis.service.impl;

import com.tangxc.springmybatis.dao.BaseDAO;
import com.tangxc.springmybatis.domain.Item;
import com.tangxc.springmybatis.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 15:03 2019/3/12
 * @Modified by
 */
@Service("itemService")
public class ItemServiceImpl extends BaseServiceImpl<Item> implements ItemService {

    @Override
    @Resource(name = "itemDAO")
    public void setBaseDAO(BaseDAO<Item> baseDAO) {
        super.setBaseDAO(baseDAO);
    }

}
