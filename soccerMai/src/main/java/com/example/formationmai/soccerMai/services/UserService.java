package com.example.formationmai.soccerMai.services;

import java.util.List;
import com.example.formationmai.soccerMai.models.User;

public interface UserService {
	
public List<User> getAllUsers();
	
	public User getUserById(Long id);
	
	public User addUser(User u);
	
	public void deleteUserById(Long id);

}
