package CreationalPattern;

import java.io.Serializable;

public class SingleTonFirst implements  Cloneable{
	
	private static SingleTonFirst soleInstance = null;//new SingleTonFirst() ; //eager approach
     private SingleTonFirst() {
    	 System.out.println("Creating..");
     }
     
     public static SingleTonFirst getInstance() {
    	 if(soleInstance==null) {
    		 soleInstance = new SingleTonFirst();    //LazyApproach
    	 }
    	 
		return soleInstance;
     }
     
     
     @Override
	protected Object clone() throws CloneNotSupportedException{
    	 return super.clone();
     }
}
