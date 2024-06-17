package com.project.cinema.model;

import java.math.BigDecimal;

public class MenuItem {
    private int id;
    private String itemName;
    private BigDecimal price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public MenuItem(int id, String itemName, BigDecimal price) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.price = price;
	}
	public MenuItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

