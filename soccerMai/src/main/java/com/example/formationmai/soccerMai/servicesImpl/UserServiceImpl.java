package com.example.formationmai.soccerMai.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.formationmai.soccerMai.models.User;
import com.example.formationmai.soccerMai.repositories.UserRepository;
import com.example.formationmai.soccerMai.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserRepository userRepo;

	@Override
	public List<User> getAllUsers() {
		
	 return userRepo.findAll();
	}

	@Override
	public User getUserById(Long id) {
		
		Optional<User> u = userRepo.findById(id);
		return u.isPresent() ? u.get() : null;
	}

	@Override
	public User addUser(User u) {
		
		return userRepo.save(u);
	}

	@Override
	public void deleteUserById(Long id) {
		
		userRepo.deleteById(id);
		
		
	}

}
