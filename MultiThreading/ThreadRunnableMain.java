package SolveIt;

public class ThreadRunnableMain {

	public static void main(String[] args) {
		
		ThreadRunnableEx ok = new ThreadRunnableEx();
		Thread oki = new Thread(ok);
		oki.start();
	}

}
