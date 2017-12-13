/**
 * CarRepository.java
 * app.djxlab.springbootdemo.repository 
 *
 * @author: Dhaval Joshi.
 */
package app.djxlab.springbootdemo.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import app.djxlab.springbootdemo.model.Car;

public interface CarRepository extends MongoRepository<Car, String> {
	public List<Car> findAll();
}
