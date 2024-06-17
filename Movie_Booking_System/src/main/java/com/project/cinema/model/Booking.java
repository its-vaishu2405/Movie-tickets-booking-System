package com.project.cinema.model;

import java.math.BigDecimal;

public class Booking {
    private int id;
    private int userId;
    private int movieId;
    private String seatIds;
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
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getSeatIds() {
		return seatIds;
	}
	public void setSeatIds(String seatIds) {
		this.seatIds = seatIds;
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
	public Booking(int id, int userId, int movieId, String seatIds, BigDecimal totalPrice, String status) {
		super();
		this.id = id;
		this.userId = userId;
		this.movieId = movieId;
		this.seatIds = seatIds;
		this.totalPrice = totalPrice;
		this.status = status;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}

