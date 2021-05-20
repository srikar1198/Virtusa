package Sync;

public class PrinterThread extends Thread{
	private String s1;
	private String s2;
	PrinterThread(String s1,String s2){
		this.s1=s1;
		this.s2=s2;
	}
	public void run() {
		StringPrinter s=new StringPrinter();
		s.print(s1,s2);
	}
}