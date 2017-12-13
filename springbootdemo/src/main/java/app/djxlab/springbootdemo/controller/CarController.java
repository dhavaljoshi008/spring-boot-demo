/**
 * CarController.java
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
import app.djxlab.springbootdemo.model.Car;
import app.djxlab.springbootdemo.service.CarService;

@RestController
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@RequestMapping(value="/cars", method=RequestMethod.GET, produces="application/json")
	public List<Car> getCars() {
		System.out.println(carService.findAll());
		return carService.findAll();
	}
}
