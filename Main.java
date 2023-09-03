package Inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle truck1 = new Truck("Tata Prima", "Ram 1500", "Diesel", 2023);
		Vehicle car1 = new Car("Ford", "Raptor", "Premium", 2022);
		Vehicle motor1 = new Motorcycle("Honda", "Sniper", "Regular", 2020);
		
		motor1.Display();
		motor1.getDistanceTraveled();
		motor1.getFuelEfficiency();
		motor1.getMaxSpeed();
	}

}
