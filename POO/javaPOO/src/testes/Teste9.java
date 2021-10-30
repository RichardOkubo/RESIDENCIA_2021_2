package testes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Teste9 {

	public static void main(String[] args) {
		
//		GregorianCalendar calender = new GregorianCalendar();
//		
//		System.out.println(calender.get(Calendar.DAY_OF_WEEK));
//		
//		calender.add(Calendar.MONTH, 0);
//		System.out.println(calender.toString());
		
		LocalDate hoje = LocalDate.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(hoje.format(formatter));
	}

}
