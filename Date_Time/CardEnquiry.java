package Date_Time;

import java.time.YearMonth;

public class CardEnquiry {

	
		public static void main(String [] args) {
			YearMonth today=YearMonth.now();
			YearMonth expiryDate=YearMonth.of(2021,06);
			if(today.equals(expiryDate))
				System.out.println("Today is the expiry date");
			else
				System.out.println("Hurray it ain't");
		}

	

}
