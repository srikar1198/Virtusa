package Assement;

import java.util.ArrayList;
import java.util.HashMap;


public class Test2 {
	
	static ArrayList<String> sk = new ArrayList<String>();
	
	static HashMap<String,Integer> ski = new HashMap<String,Integer>();

	public static void main(String[] args) {
		sk.add("arun#12#12#12");
		sk.add("deepak#13#12#12");
		
		
		int highestScore =0;
		String Topper = "";
		for(String s : sk) {
			int sum = 0;
			
			String[] arr = s.split("#");
			for(int i=1 ; i<arr.length;i++) {
				sum = sum + Integer.parseInt(arr[i]);
				if(sum> highestScore) {
					highestScore = sum;
					Topper = arr[0];
				}
			}
			
			
		}
		
		System.out.println(Topper);


	}

}
