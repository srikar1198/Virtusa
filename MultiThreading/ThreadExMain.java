package SolveIt;

public class ThreadExMain {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new ThreadEx();
		Thread t2 = new ThreadEx();
		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println("Ends at the End");
		
		

	}

}
