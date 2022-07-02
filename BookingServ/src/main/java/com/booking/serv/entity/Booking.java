package com.booking.serv.entity;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {
	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	private BigInteger bookingId;
	private String bookingDate;
	private int noOfPassengers;
	private String mail;
	
	

	public Booking(BigInteger bookingId, String bookingDate, int noOfPassengers) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.noOfPassengers = noOfPassengers;
		this.mail = null;
	}

	public Booking(BigInteger bookingId, String bookingDate, int noOfPassengers, String mailId) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.noOfPassengers = noOfPassengers;
		this.mail = mailId;
	}

	public BigInteger getBookingId() {
		return bookingId;
	}

	public void setBookingId(BigInteger bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	public String getMailId() {
		return mail;
	}

	public void setMailId(String mailId) {
		this.mail = mailId;
	}
}