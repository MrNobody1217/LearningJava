package Inheritance;

public class Motorcycle extends Vehicle {

	Motorcycle(String make, String model, String fuelType, int year){
		
		super(make, model, fuelType, year);
	}
	
	void Display() {
		System.out.println("Motorcycle Make: " + make);
		System.out.println("Motorcycle Model: " + model);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Motorcycle Year: " + year);
	}
}
