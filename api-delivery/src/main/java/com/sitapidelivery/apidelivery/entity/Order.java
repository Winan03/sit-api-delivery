package com.sitapidelivery.apidelivery.entity;

import java.util.ArrayList;
import java.util.List;
public class Order {
    private int id;
    private String customerName;
    private String customerEmail;
    private String status;
    private long creationTime;
    private long estimatedDeliveryTime;
    private List<Food> items;

    public Order(int id, String customerName, String customerEmail, String status, long creationTime, long estimatedDeliveryTime) {
        this.id = id;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.status = status;
        this.creationTime = creationTime;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.items = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }

    public long getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public void setEstimatedDeliveryTime(long estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public List<Food> getItems() {
        return items;
    }

    public void setItems(List<Food> items) {
        this.items = items;
    }

    public void addItem(Food item) {
        items.add(item);
    }
}
