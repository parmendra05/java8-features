package dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Examples {

	public static void main(String[] args) {

		/*
		 * LocalDate class is final, immutable and thread-safe. 
		 * LocalTime class is final, immutable and thread-safe.
		 * LocalDateTime class is final, immutable and thread-safe.
		 * 
		 * now() is the static method, to get current date time. 
		 * It has 2 more overloaded methods.
		 * 1. now() 
		 * 2. now(ZoneId zone)
		 * 3. now(Clock clock)
		 */

		System.out.println("----------- Methods for LocalDate-----------");
		LocalDate date = LocalDate.now();

		// Output : 2023-08-26
		System.out.println(date);

		int dd = date.getDayOfMonth(); // 26

		int mm = date.getMonthValue(); // 8

		int yy = date.getYear(); // 2023

		int day = date.getDayOfYear(); // 238

		System.out.println(day);
		System.out.println(dd + "-" + mm + "-" + yy);

		System.out.println("----------- Methods for LocalTime-----------");
		LocalTime time = LocalTime.now();

		// Output : 16:30:18.603044
		System.out.println(time);

		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();

		System.out.println(h + " : " + m + " : " + s + " : " + n);

		System.out.println("----------- Methods for LocalDateTime-----------");
		LocalDateTime dt = LocalDateTime.now();

		// Output : 2023-08-26T16:44:03.456481900
		System.out.println(dt);

		System.out.println(dt.plusDays(15));
		System.out.println(dt.plusMonths(3));
		System.out.println(dt.plusYears(7));

		System.out.println(dt.minusDays(15));

		System.out.println("----------- Examples of Zone-----------");
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);

	}

}
