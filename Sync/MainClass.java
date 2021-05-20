package Sync;

public class MainClass {

	public static void main(String[] args) {
		PrinterThread t1=new PrinterThread("Hello","There");
		t1.start();
		PrinterThread t2=new PrinterThread("How","are you");
		t2.start();
		PrinterThread t3=new PrinterThread("Thank you","Very much");
		t3.start();
	}

}