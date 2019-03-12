package com.tangxc.mybatisdemo.domain;

/**
 * @Author tangxc
 * @Description
 * @Date Created in 09:34 2019/3/12
 * @Modified by
 */
public class Item {

    private Integer id;
    private String itemName;
    private Order order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", order=" + order +
                '}';
    }

}
