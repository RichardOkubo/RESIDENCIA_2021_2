package exercicios;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class Exercicio05 {

	public static void main(String[] args) {
		
//		LocalDate localDate = LocalDate.parse(
//				LocalDate.now().toString(),
//				DateTimeFormatter.ofPattern("yyyy-MM-dd", new Locale("pt", "BR"))
//		);
		
//		String y = new SimpleDateFormat("MMMM", new Locale("pt", "BR")).format(new Date());
//		String x = new SimpleDateFormat("EEEE", new Locale("pt", "BR")).format(new Date());
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println("Dia            " + localDate.getDayOfMonth());
		System.out.println("Dia            " + localDate.getDayOfMonth());
		System.out.println("Dia da semana  " + localDate.getDayOfWeek());
		System.out.println("Mês            " + localDate.getMonth());
		System.out.println("Ano            " + localDate.getYear());

		System.out.println("\nIdade: " + ChronoUnit.YEARS.between(LocalDate.parse("1970-01-01"), LocalDate.now()));
	}
}
