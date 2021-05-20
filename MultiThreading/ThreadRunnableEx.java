package SolveIt;

public class ThreadRunnableEx implements Runnable {

	@Override
	public void run() {
		for(int i =0 ; i<10 ; i++) {
			Thread.currentThread().setName("SetNameMethod");
			System.out.println(i + " "+ Thread.currentThread().getName());
			
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
