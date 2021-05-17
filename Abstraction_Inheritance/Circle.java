package Abstraction_Inheritance;

public class Circle extends Shape{

	@Override
	double calculateArea() {
		int r = 5;
				
		return 3.14*r*r;
	}

}
