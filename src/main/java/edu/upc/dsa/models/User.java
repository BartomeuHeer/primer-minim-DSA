package edu.upc.dsa.models;

import java.util.LinkedList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private List<Order> orderList;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.orderList = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
