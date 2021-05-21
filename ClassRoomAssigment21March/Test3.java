package Assement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Test3 {

	
   static  HashMap<Integer,Integer> sk = new HashMap<Integer,Integer>();
     
   
                       
	
	 public static void main(String[] args) {
		 
		 
		 
		 sk.put(10, 24);
		 sk.put(11, 22);
		 sk.put(21, 44);
		 sk.put(25, 46);
		 int count =0;
		 int sum= 0;
		 
		 Iterator<Map.Entry<Integer,Integer>> itr = sk.entrySet().iterator();
		 while(itr.hasNext()) {
			 Map.Entry<Integer, Integer> ski = itr.next();
			 if(ski.getKey()%2 !=0) {
				 sum +=  ski.getValue();
				 count++;
				 
			 }
		 }
		 
		 System.out.println(sum/count + " The average" );
		 
	
		 

	}

}
