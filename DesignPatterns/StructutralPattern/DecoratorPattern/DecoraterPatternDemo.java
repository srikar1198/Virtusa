package DecoraterPattern;

public class DecoraterPatternDemo {

	public static void main(String[] args) {
	      Shape circle = new Circle();

	      Shape decCircle = new RedShapeDecorator(new Circle());

	      Shape decRectangle = new RedShapeDecorator(new Rectangle());
	      System.out.println("Circle with normal border");
	      circle.draw();

	      System.out.println("Circle of red border\n");
	      decCircle.draw();

	      System.out.println("Rectangle of red border\n");
	      decRectangle.draw();

	}

}
