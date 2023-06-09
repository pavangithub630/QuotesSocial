package com.pavan.quotesSocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.quotesSocial.Enitity.User;
import com.pavan.quotesSocial.exceptions.UserException;
import com.pavan.quotesSocial.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		return  userRepository.save(user);
		
	}

	@Override
	public List<User> getallusers() {
		return userRepository.findAll();
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findUserByUserId(long userId)throws UserException {
		User user= userRepository.findById(userId).orElseThrow(()-> new UserException("User with that user id did not found"));
		return user;
	}
	
	
	
	

}
