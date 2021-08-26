/* Lista 2
 *  
 * 4) Escreva um programa que funcione como uma calculadora simples de soma (+),
 * 	 subtração(-), multiplicação(*) e divisão(/)
 * 	 
 */

programa
{
	funcao inicio()
	{
		inteiro num1, num2, resultado
		caracter operacao

		escreva("Digite um número inteiro: ")
		leia(num1)

		escreva("Digite outro número interio: ")
		leia(num2)

		escreva("Escolha uma das seguintes operações:")
		escreva("\n+\t(Soma)\n-\t(Subtração)\n*\t(Multiplicação)\n/\t(Divisão)\n: ")
		leia(operacao)

		se (operacao == '+')
		{
			resultado = num1 + num2
			escreva("\n", num1, " ", operacao, " " , num2, " = ", resultado)
		}
		senao se (operacao == '-')
		{
			resultado = num1 - num2
			escreva("\n", num1, " ", operacao, " " , num2, " = ", resultado)
		} 
		senao se (operacao == '*')
		{
			resultado = num1 * num2
			escreva("\n", num1, " ", operacao, " " , num2, " = ", resultado)
		} 
		senao se (operacao == '/')
		{
			resultado = num1 / num2 // divisão inteira
			escreva("\n", num1, " ", operacao, " " , num2, " = ", resultado)
		}
		senao
		{
			escreva("'", operacao,"' não é uma operação válida!\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1120; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */