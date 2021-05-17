package Collections;

import java.util.*;

public class HashMaps {
public static void main(String[] args) {
	Map<Integer,String> h=new HashMap<>();
	add(h);
	for(Integer s:h.keySet()) {
		System.out.println(s+" "+h.get(s)+" ");
		
	}
	
}

private static void add(Map<Integer, String> h) {
	h.put(1,"USA");
	h.put(2,"CANNADA");
	h.put(3,"AUSSIE");
	
}
}
