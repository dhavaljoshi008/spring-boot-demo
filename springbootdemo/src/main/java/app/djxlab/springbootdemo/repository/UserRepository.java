/**
 * UserRepository.java
 * app.djxlab.springbootdemo.repository 
 *
 * @author: Dhaval Joshi.
 */
package app.djxlab.springbootdemo.repository;

import java.util.List;
import app.djxlab.springbootdemo.model.User;

public interface UserRepository {
	public List<User> findAll();
}
