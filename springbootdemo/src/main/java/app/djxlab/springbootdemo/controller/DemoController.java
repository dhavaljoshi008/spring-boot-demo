/**
 * DemoController.java
 * app.djxlab.springbootdemo.controller 
 *
 * @author: Dhaval Joshi.
 */
package app.djxlab.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.djxlab.springbootdemo.model.User;
import app.djxlab.springbootdemo.service.UserService;

@RestController
public class DemoController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/users", method=RequestMethod.GET, produces = "application/json")
	public List<User> getUsers() {
		return userService.findAll();
	}
}
