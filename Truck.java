package Inheritance;

public class Truck extends Vehicle{

	Truck(String make, String model, String fuelType, int year){
		
		super(make, model, fuelType, year);
	}
	
	void Display() {
		System.out.println("Truck Make: " + make);
		System.out.println("Truck Model: " + model);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Truck Year: " + year);
	}
	
	
}
