package Abstraction_Inheritance;

public class Interface {

	public static void main(String[] args) {
		Car c=new Car();
		c.brake();
		c.drive();
		c.turnLeft();
		c.checkMotor();
		
		Train t=new Train();
		t.brake();
		t.drive();
		t.turnLeft();
		t.getNumberOfPeople();
	}

}
