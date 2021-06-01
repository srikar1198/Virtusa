package DecoraterPattern;
//Component Interface
public interface Shape {
	
	void draw();

}

class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
		
	}
	
}

class Circle implements Shape{

	
	public void draw() {
		System.out.println("Shape: Circle");
		
	}
	
}
