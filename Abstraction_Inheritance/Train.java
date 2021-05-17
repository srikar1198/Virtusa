package Abstraction_Inheritance;

public class Train implements IPublicTransport,IVehicle{
	public int getNumberOfPeople() {
		return 100;
	}
	public void drive() {
		System.out.println("Drive");
	}
	public void turnLeft() {
		System.out.println("Turn Left");
	}
	public void brake() {
		System.out.println("Brake");
	}
}
