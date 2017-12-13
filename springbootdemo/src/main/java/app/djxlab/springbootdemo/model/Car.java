/**
 * Car.java
 * app.djxlab.springbootdemo.model 
 *
 * @author: Dhaval Joshi.
 */
package app.djxlab.springbootdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="demoCollection")
public class Car {
	@Id
	private String id;
	
	private String make;
	
	private String model;
	
	private int year;
	
	
	public Car() {
		
	}
	
	public Car(String id, String make, String model, int year) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + "]";
	}
	
}
