package Date_Time;

import java.time.LocalDate;

public class LocalDateKi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		int a = today.getYear();
		int b = today.getMonthValue();
		int c = today.getDayOfMonth();
		int d = today.getDayOfYear();
		String s = today.toString();
		
		System.out.println(a+" "+ b+ " "+c+" "+d);
		System.out.println(today + " "+ s);

	}

}
