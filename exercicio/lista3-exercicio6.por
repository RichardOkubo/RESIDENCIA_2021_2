/*
 * 6 - Reescreva o código da calculadora e transforme cada uma das operações ( + - * / )
	em uma função.
 */

programa
{
	funcao inicio()
	{
		real num1, num2
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
			escreva("\n", num1, " ", operacao, " " , num2, " = ", somar(num1, num2))
		}
		senao se (operacao == '-')
		{
			escreva("\n", num1, " ", operacao, " " , num2, " = ", subrair(num1, num2))
		} 
		senao se (operacao == '*')
		{
			escreva("\n", num1, " ", operacao, " " , num2, " = ", multiplicar(num1, num2))
		} 
		senao se (operacao == '/')
		{
			escreva("\n", num1, " ", operacao, " " , num2, " = ", dividir(num1, num2))
		}
		senao
		{
			escreva("'", operacao,"' não é uma operação válida!\n")
		}
	}

	funcao real somar(real n1, real n2) { retorne n1 + n2 }

	funcao real subrair(real n1, real n2) { retorne n1 + n2 }

	funcao real dividir(real n1, real n2) { retorne n1 / n2 }

	funcao real multiplicar(real n1, real n2) { retorne n1 * n2 }
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 161; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */