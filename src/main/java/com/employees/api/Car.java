package com.employees.api;

import com.employees.api.Models.CarC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Car {

	public static void main(String[] args) {
		SpringApplication.run(Car.class, args);

		CarC obj1 = new CarC("Toyota", 2016, 20000.20, true);
		CarC obj2 = new CarC("Mazda", 2010, 3460.20, false);

		obj1.displayInfo();
		System.out.println("*******************");
		obj2.displayInfo();
	}

}
