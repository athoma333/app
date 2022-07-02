package com.flight.serv.service;

import java.math.BigInteger;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flight.serv.entity.Flight;

@Service
public interface FlightService {
	public ResponseEntity<?> addFlight(Flight flight);

	public Iterable<Flight> viewAllFlight();

	public Flight viewFlight(BigInteger flightNumber);

	public Flight modifyFlight(Flight flight);

	public String removeFlight(BigInteger flightNumber);

}
