/*
 * Faça um programa que leia 3 notas de quatro alunos e imprima só os que obtiverem
 * a média aritmética,das três notas, maior ou igual a 7. Ao final, some as médias impressas.
 * 
 * Teste o exercício com if/else, do/while, while e for.
 * */

package exercicios;

import java.util.Scanner;

public class ExercicioB {
	
	public static void main(String[] args) {
		int i = 0, j;
		double nota = -1, soma = 0, somaDasMedias = 0;
		double[] medias = new double[4];
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.printf("Aluno %d\n", (i+1));
			
			j = 1;
			while (j <= 3) {
				do {
					System.out.printf("%dª nota: ", j);
					nota = scan.nextDouble();
				} while (nota < 0 || nota > 10);
				
				soma += nota;
				j++;
			}
			medias[i] = soma / 3;
			soma = 0.0;
			
			i++;
		} while (i < medias.length);

		for (int k = 0; k < medias.length; k++) {
			if (medias[k] >= 7.0) {
				System.out.printf("\nMédia do aluno %d: %.1f", k+1, medias[k]);
				somaDasMedias += medias[k];
			}
		}
		System.out.printf("\nSoma das médias: %.1f", somaDasMedias);
		
		scan.close();
	}
}
