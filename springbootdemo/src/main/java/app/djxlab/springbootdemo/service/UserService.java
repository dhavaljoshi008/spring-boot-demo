/**
 * UserService.java
 * app.djxlab.springbootdemo.service 
 *
 * @author: Dhaval Joshi.
 */
package app.djxlab.springbootdemo.service;

import java.util.List;
import app.djxlab.springbootdemo.model.User;

public interface UserService {
	List<User> findAll();
}
