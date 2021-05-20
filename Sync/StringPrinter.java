package Sync;

public class StringPrinter {
	synchronized public void print(String s1,String s2) {
		System.out.println(s1+" "+s2);
	}
}