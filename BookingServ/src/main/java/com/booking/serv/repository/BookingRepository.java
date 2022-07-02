package com.booking.serv.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import com.booking.serv.entity.Booking;


public interface BookingRepository extends JpaRepository<Booking, BigInteger>{


	@Query(value = "select * from booking b where b.mail=?1", nativeQuery = true)
	public ResponseEntity<?> findBookingByMailId(String emailId);
}
