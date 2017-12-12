/**
 * UserServiceImpl.java
 * app.djxlab.springbootdemo.service.impl 
 *
 * @author: Dhaval Joshi.
 */
package app.djxlab.springbootdemo.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import app.djxlab.springbootdemo.model.User;
import app.djxlab.springbootdemo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<User> findAll() {
		User u1 = new User("Batman");
		User u2 = new User("Superman");
		User u3 = new User("Wonder Woman");
		User u4 = new User("Wolverine");
		User u5 = new User("Thor");

		List<User> users = new ArrayList<>();
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
		
		return users;
	}
}
