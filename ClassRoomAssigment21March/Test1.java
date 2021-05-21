package Assement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	
	
	
	public static boolean isPalindrome(int n) {
		 int reverse = 0,re =0;int comp = n;
		 while(n>0) {
			 re=n%10;
			 reverse= (reverse*10)+re;
			 n=n/10;
			 
		 }
		if(reverse==comp) {
			return true;
		}
			
		else {
			return false;}
		
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		List<Integer> sk = new ArrayList<Integer>();
		int Llimit = sc.nextInt();
		int Ulimit = sc.nextInt();
      for( int i = Llimit ; i<Ulimit ; i++) {
    	  System.out.println(i);
    	 if(isPalindrome(i)) {
    		  sk.add(i);
    		  sum += i; 
    		  
    	  }
    	  
      }
      System.out.println(sk.toString());
      System.out.println(sum);
      System.out.println(isPalindrome(111));
      sc.close();
	}

}
