package telran.time.tools;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateOperation {
	public static int getAge(String birthDate) {
		
		DateTimeFormatter df = DateTimeFormatter.BASIC_ISO_DATE;
		df = DateTimeFormatter.ofPattern("[yyyy-MM-dd][dd/MM/yyyy]");
		LocalDate birthDate1 = LocalDate.parse(birthDate, df);
		LocalDate currentDate = LocalDate.now();
		long years = ChronoUnit.YEARS.between(birthDate1, currentDate);
		int age = (int)years;
		                 
    return age;
	}

	public static String[] sortStringDates(String[] dates) {
		// TODO i was too tired and wanted to sleep, sorry
		return null;
	}
	
	
}
