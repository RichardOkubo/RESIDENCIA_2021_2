/*
 * Escreva um programa que receba a temperatura em Celsius e retorne o valor em Fahrenheit.
 * Exemplo:
 * 		Entrada:
 * 			Digite o valor da temperatura em graus Celsius: 10
 * 		Saída:
 * 			10 graus Celsius é o mesmo que 50 graus Fahrenheit.
 */

package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		float tempCelsius;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite o valor da temperatura em graus Celsius: ");
			tempCelsius = scanner.nextFloat();
			
			System.out.format("%.1f graus Celsius é o mesmo que %.1f graus Fahrenheit.\n",
					tempCelsius, (tempCelsius * 9) / 5 + 32);
		}
	}
}


