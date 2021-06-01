package DecoraterPattern;

abstract class ShapeDecorator implements Shape {

	protected Shape shape ;
	
	   public ShapeDecorator(Shape shape){
		      this.shape = shape;
		   }

		   public void draw(){
		      shape.draw();
		   }

}

class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shape) {
		super(shape);
		
	}

	   public void draw() {
		      shape.draw();	       
		      setRedBorder(shape);
		   }
	
	public void setRedBorder(Shape decoratedShape){
	     System.out.println("Border Color: Red");
	   }
	
}

class GreenShapeDecorator extends ShapeDecorator{

	
	public GreenShapeDecorator(Shape shape) {
		super(shape);
		
	}

	public void draw() {
		
		shape.draw();
		setGreenBorder(shape);
	}
	
	private void setGreenBorder(Shape shape){
	      System.out.println("Border Color: Green");
	   }
	
}
