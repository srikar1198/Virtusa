package Abstraction_Inheritance;

public class Car extends MotorisedVehicle implements IVehicle{
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
