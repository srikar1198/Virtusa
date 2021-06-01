package BridgeDesignPattern;

public class BridgeDesignPatternMain {

	public static void main(String[] args) {
		Shape t=new Triangle(new Red());
		System.out.println("Coloring Triangle");
		t.drawShape();
		t.modifyBorder(3);
		t.drawShape();
		System.out.println("Coloring Rectangle");
		Shape r=new Rectangle(new Red());
		r.drawShape();
		r.modifyBorder(3);
		r.drawShape();
	}

}
