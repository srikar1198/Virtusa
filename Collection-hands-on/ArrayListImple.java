package CollectionsHands_on;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListImple {
	
	ArrayList<Integer> A1 = new ArrayList<Integer>();
	ArrayList<Integer> A2 = new ArrayList<Integer>();
	
	
	public ArrayList<Integer> storeEvenNumbers(int N){
		
		
		for(int i =2 ; i<=N;i+=2) {
			A1.add(i);
		}
		
		return A1 ;
	}
	
	public ArrayList<Integer> printEvenNumber() {


		
		Iterator<Integer> it = A1.iterator();
		
		while(it.hasNext()) {
			int a  = it.next();
			System.out.print(a*2+" ");
			A2.add(a*2);
		}
		return A2;
		
		
		
		
		
		
		
}

	
	public int retrieveEvenNumber(int N) {
		
		if(A1.contains(N)) {
			return A1.indexOf(N);
		}
		else {
			return 0;
		}
	}

	
	
	public static void main(String[] args) {
		ArrayListImple hola = new ArrayListImple();
		hola.storeEvenNumbers(10);
		System.out.println(hola.A1.toString());
		hola.printEvenNumber();
		System.out.println(" ");
		System.out.println(hola.retrieveEvenNumber(4));
		System.out.println(hola.retrieveEvenNumber(3));
	}
	
	
}
