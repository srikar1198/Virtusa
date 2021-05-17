package Abstraction_Inheritance;

public class AbstractDemo {

	public static void main(String[] args) {
		Shape cir = new Circle();
		Shape squ = new Square();
		cir.setColor("Red");
		System.out.println(cir.calculateArea()+" Circle Object "+ cir.getColor());
		squ.setColor("Yellow");
		System.out.println(squ.calculateArea() +" Square Object "+ squ.getColor());
		

	}

}
