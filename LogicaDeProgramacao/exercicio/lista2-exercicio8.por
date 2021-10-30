/* Lista 2
 *  
 * 8) Escreva um programa que encontre a soma de dígitos de um número.
 * 
 */

programa
{
	funcao inicio()
	{
		inteiro num
		inteiro soma = 0

		escreva("Digite um número: ")
		leia(num)
		
		enquanto (num > 0)
		{
			soma = soma + num % 10
			num = num / 10
		}

		escreva("A soma de dígitos desse número é ", soma, "\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 256; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 11, 10, 3}-{soma, 12, 10, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */