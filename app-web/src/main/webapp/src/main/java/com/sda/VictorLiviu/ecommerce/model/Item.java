package com.sda.VictorLiviu.ecommerce.model;

import javax.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_seq_gen")
    @SequenceGenerator(name = "item_seq_gen", sequenceName = "item_seq", allocationSize = 1)
    @Column(name = "id")
    private int id;

    @Column(name = "price")
    private double price;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "quantity")
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
