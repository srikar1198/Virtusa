package MultiThreading;

public class ThreadDemo extends Thread {
	 static int i ;
	
	public synchronized void run() {
		System.out.println("Hola Mate");
		i++;
		System.out.println(this.dev());
		
	}
	
	
	public synchronized String dev() {
		
		
		return i + " is running" ;
		
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new ThreadDemo();
		Thread t2 = new ThreadDemo();
		Thread t3 = new ThreadDemo();
		
		
		t1.start();
		t2.start();
		t3.start();
	}
}
