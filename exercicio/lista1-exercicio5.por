/* Lista 1
 * 
 * 5) Escreva um programa que encontre o valor máximo entre 2 números
 * 
 */

programa
{
	funcao inicio()
	{
		inteiro num1, num2
		
		escreva("Digite um número: ")
		leia(num1)
		
		escreva("Digite outro número: ")
		leia(num2)

		se (num1 > num2)
		{
			escreva("O número ", num1," é maior que o número ", num2, "\n")
		}
		senao se (num1 < num2)
		{
			escreva("O número ", num2," é maior que o número ", num1, "\n")
		}
		senao
		{
			escreva("Os dois números digitados possuem a mesma dimensão.\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 201; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */