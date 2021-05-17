package Collections;


import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SetExercise {
	
	
static Set<String> countries;
	
	


	public static void main(String[] args) {
		 AcceptCountries();
		
		System.out.println(countries);
			
		
		 System.out.println(HoldingValues());
		 System.out.println(AddMoreValues());
		
			
		}
	
	
	public static Set AcceptCountries() {
		
	     countries = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		for(int i =0 ; i<5; i++) {
			countries.add(sc.next()) ;
		
	             }
		return countries;
	}


	public static Set HoldingValues()	{
		Set<Integer> values = new HashSet<Integer>();
		for(int i = 1 ; i<=10 ;i++) {
			values.add(i);
		}
		return values;
		
		
	}
      
	
	public static Set AddMoreValues() {
		
		Set NewValues = HoldingValues();
		
		for(int i = 11 ; i<=15 ;i++) {
			NewValues.add(i);
		}
		return NewValues;
	}


}
