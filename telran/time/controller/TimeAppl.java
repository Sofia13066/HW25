package telran.time.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class TimeAppl {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		LocalDate gagarin = LocalDate.of(1961, 4, 12);
		System.out.println(gagarin);
		System.out.println(gagarin.getDayOfYear());
		System.out.println(gagarin.isAfter(currentDate));
		LocalDate newDate = currentDate.plusDays(100);
		System.out.println(newDate);
		System.out.println(currentDate);
		newDate = currentDate.plus(100, ChronoUnit.DECADES);
		;
		System.out.println(newDate);
		System.out.println(localTime.plus(100, ChronoUnit.MINUTES));
		LocalDateTime newDateTime = localDateTime.plus(9, ChronoUnit.HALF_DAYS);
		System.out.println(newDateTime);
		System.out.println(ChronoUnit.DAYS.between(gagarin, currentDate));
		System.out.println("===== Date Formatter =====");
		DateTimeFormatter df = DateTimeFormatter.BASIC_ISO_DATE;
		System.out.println(gagarin.format(df));
		df = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", new Locale("uk"));
		System.out.println(gagarin.format(df));
		String date = "04/07/2022";
		df = DateTimeFormatter.ofPattern("[yyyy-MM-dd][dd/MM/yyyy]");
		LocalDate localDate1 = LocalDate.parse(date, df);
		System.out.println(localDate1);
		date = "2023-02-02";
		LocalDate localDate2 = LocalDate.parse(date, df);
		System.out.println(localDate2);
		LocalDate localDate3 = LocalDate.of(2023, 2, 2);
		System.out.println(localDate3.equals(localDate2));
	}

}
