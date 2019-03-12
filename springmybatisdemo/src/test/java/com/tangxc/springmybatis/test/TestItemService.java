package com.tangxc.springmybatis.test;

import com.tangxc.springmybatis.domain.Item;
import com.tangxc.springmybatis.domain.Order;
import com.tangxc.springmybatis.service.ItemService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 17:03 2019/3/12
 * @Modified by
 */
public class TestItemService {

    @Test
    public void testInsert() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        ItemService itemService = (ItemService) ac.getBean("itemService");
        Order order = new Order();
        order.setId(2);
        Item item = new Item();
        item.setItemName("ii0000");
        item.setOrder(order);
        itemService.insert(item);
    }

}
