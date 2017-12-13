/**
 * CarService.java
 * app.djxlab.springbootdemo.service 
 *
 * @author: Dhaval Joshi.
 */
package app.djxlab.springbootdemo.service;

import java.util.List;
import app.djxlab.springbootdemo.model.Car;

public interface CarService {
	public List<Car> findAll();
}
