/**
 * UserRepositoryImpl.java
 * app.djxlab.springbootdemo.service 
 *
 * @author: Dhaval Joshi.
 */
package app.djxlab.springbootdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import app.djxlab.springbootdemo.model.User;
import app.djxlab.springbootdemo.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {

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
