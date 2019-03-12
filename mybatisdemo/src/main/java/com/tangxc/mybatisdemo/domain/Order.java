package com.tangxc.mybatisdemo.domain;

import java.util.List;

/**
 * @Author tangxc
 * @Description 订单类
 * @Date Created in 09:32 2019/3/12
 * @Modified by
 */
public class Order {

    private Integer id;
    private String orderNo;
    private User user;
    private List<Item> itemList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", user=" + user +
                ", itemList=" + itemList +
                '}';
    }

}
