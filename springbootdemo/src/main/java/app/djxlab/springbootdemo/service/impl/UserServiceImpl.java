/**
 * UserServiceImpl.java
 * app.djxlab.springbootdemo.service.impl 
 *
 * @author: Dhaval Joshi.
 */
package app.djxlab.springbootdemo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.djxlab.springbootdemo.model.User;
import app.djxlab.springbootdemo.repository.UserRepository;
import app.djxlab.springbootdemo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}
}
