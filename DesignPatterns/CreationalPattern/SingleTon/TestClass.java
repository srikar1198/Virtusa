package CreationalPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class TestClass implements  Cloneable {

	public static void main(String[] args) throws Exception {
		SingleTonFirst s1 = SingleTonFirst.getInstance();
		SingleTonFirst s2 = SingleTonFirst.getInstance();
		print("s1",s1);
		print("s2",s2);
		
		
          //Breaking SingleTonFirst Using Reflection
/*
	Class clazz = Class.forName("CreationalPattern.SingleTonFirst");
	Constructor<SingleTonFirst> ctor = clazz.getDeclaredConstructor();
	ctor.setAccessible(true);
	SingleTonFirst s3 = ctor.newInstance();
	print("s3",s3);
*/
		
		
/*			//Serializable for writing object representation to a stream
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\SRIKAR\\Desktop\\FileData\\s2.ser"));
		oos.writeObject(s2);
		
		//Object Deserialization using stream to get the representation back
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\SRIKAR\\Desktop\\FileData\\s2.ser"));
		SingleTonFirst s3 = (SingleTonFirst) ois.readObject();
*/
		
		//using clone method to break the Singleton behaviour
//		SingleTonFirst s3 = (SingleTonFirst) s2.clone();
		
		
		//Multi-threaded for lazy Approach issues
		// Threads after the first one mistakes soleInstance to be null
	   // print("s3",s3);

	}
	
  static void print(String name, SingleTonFirst object) {
	  System.out.println(String.format("Object : %s, Hashcode: %d",name,object.hashCode()));
  }
}
