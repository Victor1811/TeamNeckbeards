package com.sda.VictorLiviu.ecommerce.dto;

import com.sda.VictorLiviu.ecommerce.model.Item;
import com.sda.VictorLiviu.ecommerce.model.User;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class OrderDto {

    private int id;
    private Date createdDate;
    private double totalCost;
    private User user;
    private Set<Item> item = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Item> getItem() {
        return item;
    }

    public void setItem(Set<Item> item) {
        this.item = item;
    }
}
