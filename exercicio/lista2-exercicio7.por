/* Lista 2
 *  
 * 7) Modifique o programa anterior para imprimir todos os números ímpares de 1 até n.
 * 
 */

programa
{
	funcao inicio()
	{
		inteiro num, contador

		escreva("Digite um número inteiro positivo não nulo: ")
		leia(num)
		
		contador = 1

		enquanto (contador <= num)
		{
			se (nao (contador % 2 == 0))
			{
				escreva(contador, "... ")
			}
			contador++
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 384; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */