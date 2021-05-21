package Assement;

import java.util.HashMap;
import java.util.TreeMap;

public class Test4 {

	public static void main(String[] args) {
		String[] arr = {"GOA","Kerla","Gujrat"};
		
		HashMap<String,String> sk = new HashMap<String,String>();
		
		for(String s: arr) {
			String d = s.substring(0,3).toUpperCase();
			sk.put(d, s);
		}
		
		System.out.println(sk);

	}

}
