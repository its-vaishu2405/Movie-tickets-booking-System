package com.project.cinema.model;
public class Seat {
    private int id;
    private int screenId;
    private String seatNumber;
    private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Seat(int id, int screenId, String seatNumber, String status) {
		super();
		this.id = id;
		this.screenId = screenId;
		this.seatNumber = seatNumber;
		this.status = status;
	}
	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}

