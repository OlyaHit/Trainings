package trainsVideo;

import java.time.LocalDate;

public class DateType {

	public static void main(String[] args) {
	
		LocalDate today = LocalDate.now();
		System.out.println("Today's Local date : " + today);

		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		System.out.printf("Year : %d  Month : %d  day : %d \t %n", year, month, day);
	}
}
