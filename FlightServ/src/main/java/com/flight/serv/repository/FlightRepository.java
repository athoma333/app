package com.flight.serv.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.serv.entity.Flight;


public interface FlightRepository extends JpaRepository<Flight, BigInteger>{

}
