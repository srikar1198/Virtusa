package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExercise {
	
	
	static List<String> countries;
	
	


	public static void main(String[] args) {
		 AcceptCountries();
		
		System.out.println(countries);
			
		
		 System.out.println(HoldingValues());
		 System.out.println(AddMoreValues());
		
			
		}
	
	
	public static List AcceptCountries() {
		
	     countries = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for(int i =0 ; i<5; i++) {
			countries.add(sc.next()) ;
		
	                     }
		return countries;
	}


	public static List HoldingValues()	{
		List<Integer> values = new ArrayList<Integer>();
		for(int i = 1 ; i<=10 ;i++) {
			values.add(i);
		}
		return values;
		
		
	}
    
	
	public static List AddMoreValues() {
		
		List NewValues = HoldingValues();
		
		for(int i = 11 ; i<=15 ;i++) {
			NewValues.add(i);
		}
		return NewValues;
	}


}


