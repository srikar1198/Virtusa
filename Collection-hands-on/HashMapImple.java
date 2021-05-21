package CollectionsHands_on;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

 
public class HashMapImple {
	HashMap<String,String> CountryMap = new HashMap<String,String>();
	
	HashMap<String,String> MP2 = new HashMap<String,String>();
	
	public HashMap<String,String> storeCountryCapital(String Nation , String Capital){
		
		if(CountryMap.containsKey(Nation)) {
			if(CountryMap.containsValue(Capital)) {
				return CountryMap;
			}
			else {
				CountryMap.replace(Nation, Capital);
			}
		}
		else{
			
			CountryMap.put(Nation, Capital);
		}
		
		
		
		return CountryMap;
		
	}
     
	
	public String retrieveCapital(String Nation){
		
		if(CountryMap.containsKey(Nation)) {
			return CountryMap.get(Nation);
		}
		else
		return "Not Found";
		
	}

	
	public String retrieveCountryName(String Captial) {


		
		Iterator<Map.Entry<String, String>> itr = CountryMap.entrySet().iterator();
		
		while (itr.hasNext()) {
			Map.Entry<String, String> entries = itr.next();
			if(entries.getValue().equals(Captial)) {
				return entries.getKey();
			}
		}
		return "Not Found";
		
	}
	
	
	public HashMap<String,String> reverseMap(){
		

		Iterator<Map.Entry<String, String>> itr = CountryMap.entrySet().iterator();
		
		while (itr.hasNext()) {
			Map.Entry<String, String> entries = itr.next();
			MP2.put(entries.getValue(), entries.getKey());
			
		}
		
		return MP2;
		
	}

    public ArrayList<String> ArraylistofKey(){
    	ArrayList<String> sk = new ArrayList<String>();
    	Iterator<String> itr = CountryMap.keySet().iterator();
    	while(itr.hasNext()) {
    		sk.add(itr.next());
    	}
    	return sk;
    	
    }

    
    
    public static void main(String[] args) {
    	HashMapImple hola = new HashMapImple();
    	hola.storeCountryCapital("India", "Delhi");
    	
    	hola.storeCountryCapital("USA", "Washington D.C");
    	System.out.println(hola.CountryMap.toString());
    	System.out.println(hola.retrieveCapital("India"));
    	System.out.println(hola.retrieveCapital("UK")+" cuz uk isn't in the map");
    	System.out.println(hola.retrieveCountryName("Delhi"));
    	System.out.println(hola.retrieveCountryName("Moscow") +" cuz Moscow isn't been set as key");
    	System.out.println(hola.MP2.toString() +" second HaspMAp which hasn't been added yet");
    	hola.reverseMap();
    	System.out.println(hola.MP2.toString());
    	System.out.println(hola.ArraylistofKey().toString() + " arraylist of haspmap of countries");
    	
    	
    }
    


}
