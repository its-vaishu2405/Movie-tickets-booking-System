package com.project.cinema.model;

import java.math.BigDecimal;

public class Order {
    private int id;
    private int userId;
    private String foodItemIds;
    private BigDecimal totalPrice;
    private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFoodItemIds() {
		return foodItemIds;
	}
	public void setFoodItemIds(String foodItemIds) {
		this.foodItemIds = foodItemIds;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Order(int id, int userId, String foodItemIds, BigDecimal totalPrice, String status) {
		super();
		this.id = id;
		this.userId = userId;
		this.foodItemIds = foodItemIds;
		this.totalPrice = totalPrice;
		this.status = status;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}
