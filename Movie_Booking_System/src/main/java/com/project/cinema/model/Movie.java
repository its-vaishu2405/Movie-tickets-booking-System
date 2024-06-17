package com.project.cinema.model;

import java.sql.Timestamp;

public class Movie {
    private int id;
    private String title;
    private String genre;
    private Timestamp showtime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Timestamp getShowtime() {
		return showtime;
	}
	public void setShowtime(Timestamp showtime) {
		this.showtime = showtime;
	}
	public Movie(int id, String title, String genre, Timestamp showtime) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.showtime = showtime;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}
