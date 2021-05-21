package CollectionsHands_on;

import java.util.HashSet;

public class HashSetImple {
	
	HashSet<String> Countries = new HashSet<String>();
	
	public HashSet<String> storeCountriesName(String s){
		
		Countries.add(s);
		
		return Countries;
	}

	public String retrieveCountry(String s) {

		
		
		if(Countries.contains(s)) {
			return s;
		}
		else
		  return null;
	}


	public static void main(String[] args) {
		HashSetImple hlo = new HashSetImple();
		hlo.storeCountriesName("USA");
		hlo.storeCountriesName("UK");
		hlo.storeCountriesName("USSR");
		System.out.println(hlo.Countries.toString());
		System.out.println(hlo.retrieveCountry("UK"));
		System.out.println(hlo.retrieveCountry("UNO"));
	}


}
