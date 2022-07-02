package com.user.serv.service;

import java.math.BigInteger;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.user.serv.entity.Users;

@Service
public interface UserService {

	public ResponseEntity<?> createUser(Users newUser);

	public Users updateUser(Users newUser);

	public String deleteUser(BigInteger UserId);

	public Iterable<Users> displayAllUser();

	public ResponseEntity<?> findUserById(BigInteger userId);
}
