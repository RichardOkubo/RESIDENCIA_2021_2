/*
 * Escrever um algoritmo que lê:
 * - a porcentagem do IPI (Imposto sobre Produtos Industrializados) a ser acrescido no valor das peças;
 * - o código do produto 1, valor unitário do produto 1, quantidade do produto 1;
 * - o código do produto 2, valor unitário do produto 2, quantidade do produto 2.
 * 
 * O algoritmo deve calcular o valor total a ser pago e apresentar o resultado em forma de tabela.
 * Fórmula para valor total: (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 * 
 * Exemplo de saída:
 * 		Produto 	Código 	Valor 		Quantidade
 * 		zzzzzz 		xxxx 	R$ xx,xx 	x
 * 		wwww 		yyyy 	R$ yy,yy 	y
 * 
 * 		Porcentagem IPI acrescida nas peças = xx%
 * 		Valor total a ser pago = R$ xx,xx
 */

package exercicios;

import java.util.Scanner;

public class Exercicio03 {
	
	public static int N = 2;

	public static void main(String[] args) {
		
		String formatoA = "%1$-20s %2$-20s %3$12s %4$15s\n";
		String formatoB = "%1$-20.19s %2$-20.14s %3$12.2f %4$,15d\n";
		
		int ipi;
		double valorTotal = 0;
		
		String[] produtos = new String[N]; 		// produtoA			produtoB
		String[] codigos = new String[N]; 		// 789005803264 	7896089012019
		double[] valores = new double[N];		// 15.59 			13.99
		int[] quantidades = new int[N];  		// 1 				2

		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("IPI: ");
			ipi = scan.nextInt();
			
			for (int i = 0; i < N; i++) {
				System.out.print("\nProduto: ");
				produtos[i] = scan.next();
				
				System.out.print("Código: ");
				codigos[i] = scan.next();
				
				System.out.print("Valor únitário: ");
				valores[i] = scan.nextDouble();
				
				System.out.print("Quantidade: ");
				quantidades[i] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < N; i++) {
			valorTotal += valores[i] * quantidades[i];
		}
		valorTotal *= ipi/100 + 1;
		
		StringBuilder sb = new StringBuilder("\n")
				.append("-".repeat(70)).append("\n")
				.append(formatoA)
				.append("-".repeat(70)).append("\n");
		
		System.out.format(sb.toString(), "PRODUTO", "CÓDIGO", "VALOR", "QUANTIDADE");
		
		for (int i = 0; i < N; i++) {
			System.out.format(formatoB, produtos[i], codigos[i], valores[i], quantidades[i]);
		}
		
		System.out.printf("\nPorcentagem IPI acrescida nas peças = %d%%", ipi);
		System.out.printf("\nValor total a ser pago = R$ %.2f\n", valorTotal);
	}
}
