package Inheritance;

import java.util.Random;

public class Vehicle {

	String make, model, fuelType;
	int year;
	
	Random random = new Random();
	int fuelEfficiency = random.nextInt(100) + 1;
	int distanceTraveled = random.nextInt(50000);
	int maxSpeed = random.nextInt(200);
	
	
	Vehicle(String make, String model, String fuelType, int year ){
		
		this.make = make;
		this.model = model;
		this.fuelType = fuelType;
		this.year = year;
	}
	
	void getFuelEfficiency(){
		System.out.println("Fuel efficiency: " + fuelEfficiency);
	}
	
	void getDistanceTraveled(){
		System.out.println("Distance travelled: " + distanceTraveled);
	}
	
	void getMaxSpeed(){
		System.out.println("Max speed: " + maxSpeed);
	}
	
	void Display() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Year: " + year);
	}
}
