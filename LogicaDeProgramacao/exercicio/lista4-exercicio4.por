/* Lista 4
 *  
 * 4) Escreva um programa que imprima os 50 primeiros números naturais usando recursão.
 * 
 */

programa
{
	funcao inicio()
	{
		imprimeNumNaturais(1)
	}

	funcao imprimeNumNaturais(inteiro n)
	{
		se (n > 50) { retorne }
		
		escreva(n, " ")
		imprimeNumNaturais( n+1 )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 225; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */