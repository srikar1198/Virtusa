package BridgeDesignPattern;

public 	interface IColor {
	abstract public void fillWithColor();

	
}

class  Green implements IColor{

	@Override
	public void fillWithColor() {
		System.out.print("Green Color");
	}

}

 class Red implements IColor{
	
	@Override
	public void fillWithColor() {
		System.out.print("Red Color");
	}

}