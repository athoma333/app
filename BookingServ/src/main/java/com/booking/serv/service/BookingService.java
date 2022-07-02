package com.booking.serv.service;

import java.math.BigInteger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.booking.serv.entity.Booking;

@Service
public interface BookingService {

	public ResponseEntity<?> createBooking(Booking newBooking);

	public Booking updateBooking(Booking newBooking);

	public String deleteBooking(BigInteger bookingId);

	public Iterable<Booking> displayAllBooking();

	public ResponseEntity<?> findBookingById(BigInteger bookingId);
	
}
