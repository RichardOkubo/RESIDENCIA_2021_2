/* Lista 3
 *  
 * 5) Escreva um programa que verifique se um número é um palíndromo ou não.
 * 
 */

programa
{
	funcao inicio()
	{

		inteiro n, auxiliar
		inteiro reverso = 0

		escreva("> ")
		leia(n)

		auxiliar = n
		reverso = 0

		enquanto (auxiliar != 0)
		{
			reverso = (reverso * 10) + (auxiliar % 10)
    			auxiliar = auxiliar / 10
		}

		se (reverso == n)
		{
			escreva(n, " é um número palíndromo\n")
		}
		senao
		{
			escreva(n, " não é um número palíndromo\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 342; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n, 12, 10, 1}-{auxiliar, 12, 13, 8}-{reverso, 13, 10, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */