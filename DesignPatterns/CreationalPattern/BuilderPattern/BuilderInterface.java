package BuilderPatterDesign;

public interface BuilderInterface {
	
	void buildBody();
	void insertWheels();
	void addHeadlights();
	Product getVechicle();

}

class Car implements  BuilderInterface{
	
	private Product product = new Product();

	@Override
	public void buildBody() {
		product.add("This is a Body Of Car");
		
	}

	@Override
	public void insertWheels() {
		product.add("4 Wheels are Added");
		
		
	}

	@Override
	public void addHeadlights() {
		product.add("2 headlights are added");
		
		
	}

	@Override
	public Product getVechicle() {
		
		return product;
	}
	
}

class MotorCycle implements BuilderInterface{
	private Product product = new Product();

	@Override
	public void buildBody() {
		product.add("This is a body of a Motorcycle");
		
	}

	@Override
	public void insertWheels() {
		product.add("2 Wheels are added");
		
	}

	@Override
	public void addHeadlights() {
		product.add("1 Headlight has been added");
		
	}

	@Override
	public Product getVechicle() {
		
		return product;
	}
	
}
