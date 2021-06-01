package BuilderPatterDesign;

public class Client {

	public static void main(String[] args) {
		System.out.println("***Builder Pattern Demo***/n");
		 Director director = new  Director ();
		 
		 BuilderInterface carBuilder = new Car();
		 BuilderInterface motorBuilder = new MotorCycle();
		 
		 director.construct(carBuilder);
		 Product p1 = carBuilder.getVechicle();
		 p1.show();
		 
		 director.construct(motorBuilder);
		 Product p2 = motorBuilder.getVechicle();
		 p2.show();

	}

}
