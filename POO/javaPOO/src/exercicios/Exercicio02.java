/*
 * Crie um algoritmo que leia o valor do salário mínimo, o nome completo e o valor do salário mensal de um usuário,
 * calcule a quantidade e porcentagem de salários mínimos que esse usuário ganha por mês e imprima o resultado.
 * 
 * Exemplo de saída:
 * 		João Batista recebe 2,5 salários mínimos por mês o equivalente a 250% do salário mínimo!
 * 
 * Obs.: Muitos de vocês fizeram o primeiro, os que não fizeram peço que tentem. Os que tentaram e, por algum motivo, não
 * conseguiram, peço que enviem as dificuldades que tiveram. Busquem interações nos grupos também, é importante para vocês!
 */

package exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		String nomeCompleto;
		double salario, salarioMensal, salarioMinimo;
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.print("Digite seu nome completo: ");
			nomeCompleto = scan.nextLine();
			
			System.out.print("Digite seu salário mensal: ");
			salarioMensal = scan.nextDouble();
			
			System.out.print("Digite o salário mínimo: ");
			salarioMinimo = scan.nextDouble();
			
			salario = salarioMensal / salarioMinimo;
			
			System.out.printf("%s rebebe %.1f salários mínimos por mês, o que equivalente a %.1f%% do salário mínimo!\n",
					nomeCompleto, salario, salario*100);
		}
	}
}
