package com.booking.serv.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.serv.entity.Booking;
import com.booking.serv.exception.RecordAlreadyPresentException;
import com.booking.serv.exception.RecordNotFoundException;
import com.booking.serv.repository.BookingRepository;
import com.booking.serv.service.BookingService;

@CrossOrigin
@ComponentScan(basePackages = "com")
@RestController
@RequestMapping("/api/v1.0/flight/booking")
public class BookingController {

	@Autowired(required= true)
	BookingService bookingService;
	
	@Autowired
	BookingRepository bookingRepository;

	@PostMapping("/createBooking")
	@ExceptionHandler(RecordAlreadyPresentException.class)
	public void addBooking(@RequestBody Booking newBooking) {

		bookingService.createBooking(newBooking);
	}

	@GetMapping("/readAllBooking")
	public Iterable<Booking> readAllBookings() {

		return bookingService.displayAllBooking();
	}

	@PutMapping("/updateBooking")
	@ExceptionHandler(RecordNotFoundException.class)
	public void modifyBooking(@RequestBody Booking updateBooking) {

		bookingService.updateBooking(updateBooking);
	}
	
	@GetMapping("/history/{emailId}")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?> searchBookingByID(@PathVariable("emailId") String emailId) {

		return bookingRepository.findBookingByMailId(emailId);
	}
	
	@GetMapping("/searchBooking/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?> searchBookingByID(@PathVariable("id") BigInteger bookingId) {

		return bookingService.findBookingById(bookingId);
	}

	@DeleteMapping("/deleteBooking/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public void deleteBookingByID(@PathVariable("id") BigInteger bookingId) {

		bookingService.deleteBooking(bookingId);
	}
}