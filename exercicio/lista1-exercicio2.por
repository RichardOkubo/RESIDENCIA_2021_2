/* Lista 1
 * 
 * 2) Escreva um programa que leia do teclado 2 números e execute a soma, subtração,
 * 	 divisão e multiplicação e apresente na tela os resultados.
 * 
 */

programa
{
	funcao inicio()
	{
		inteiro num1, num2

		escreva("Digite um número : ")
		leia(num1)

		escreva("Digite outro número : ")
		leia(num2)

		escreva("A soma de ", num1, " com ", num2, " é igual a ", num1 + num2)
		escreva("\nA subtração de ", num1, " por ", num2, " é igual a ", num1 - num2)
		escreva("\nA divisão de ", num1, " por ", num2, " é igual a ", num1 / num2)  // divisão inteira
		escreva("\nA multiplicação de ", num1, " por ", num2, " é ", num1 * num2, "\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 661; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */