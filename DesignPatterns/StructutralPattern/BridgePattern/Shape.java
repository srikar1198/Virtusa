package BridgeDesignPattern;

public abstract class Shape {
	abstract public void drawShape();
	abstract public void modifyBorder(int border);
}
class Triangle extends Shape{
	private int border=20;
	private IColor color;
	public Triangle(IColor color) {
		this.color=color;
	}
	@Override
	public void drawShape() {
		System.out.print("This Triangle colored with ");
		color.fillWithColor();
		System.out.print(" with "+border+" inch border\n");
	}

	@Override
	public void modifyBorder(int times) {
		System.out.println("Now we are changing the border length "+times);
		border*=times;
	}

}

class Rectangle extends Shape{
	private int border=20;
	private IColor color;
	public Rectangle(IColor color) {
		this.color=color;
	}
	@Override
	public void drawShape() {
		System.out.print("This Rectangle colored with: ");
		color.fillWithColor();
		System.out.print(" with "+border+" inch border\n");
		
	}

	@Override
	public void modifyBorder(int times) {
		System.out.println("Now we are changing the border length "+times);
		border*=times;
	}

}