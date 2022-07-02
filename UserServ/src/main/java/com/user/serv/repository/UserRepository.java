package com.user.serv.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.serv.entity.Users;


public interface UserRepository extends JpaRepository<Users, BigInteger>{

}
