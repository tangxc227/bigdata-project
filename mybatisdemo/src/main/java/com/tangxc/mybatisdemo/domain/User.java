package com.tangxc.mybatisdemo.domain;

import java.util.List;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 15:11 2019/3/8
 * @Modified by
 */
public class User {

    private Integer id;
    private String name;
    private int age;
    private List<Order> orderList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", orderList=" + orderList +
                '}';
    }

}
