/*
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
 * mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. 
 * (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */
package exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ExercicioA {
	
	public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite sua data de nascimento? (dd/MM/yyyy) ");
            
            LocalDate dataDeNascimento = LocalDate.parse(
            		scan.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            
            System.out.printf("%d dias de vida\n",
            		ChronoUnit.DAYS.between(dataDeNascimento, LocalDate.now()));
        }
	}
}
