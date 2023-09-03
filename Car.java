package Inheritance;

public class Car extends Vehicle{

	Car(String make, String model, String fuelType, int year){
		
		super(make, model, fuelType, year);
	}
	
	void Display() {
		System.out.println("Car Make: " + make);
		System.out.println("Car Model: " + model);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Car Year: " + year);
	}
}
