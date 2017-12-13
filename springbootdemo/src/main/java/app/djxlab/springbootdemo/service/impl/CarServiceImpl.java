/**
 * CarServiceImpl.java
 * app.djxlab.springbootdemo.service.impl 
 *
 * @author: Dhaval Joshi.
 */
package app.djxlab.springbootdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.djxlab.springbootdemo.model.Car;
import app.djxlab.springbootdemo.repository.CarRepository;
import app.djxlab.springbootdemo.service.CarService;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarRepository carRepository;

	@Override
	public List<Car> findAll() {
		return carRepository.findAll();
	}

}
