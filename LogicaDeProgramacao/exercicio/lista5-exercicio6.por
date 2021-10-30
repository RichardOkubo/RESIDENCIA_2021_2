/* Lista 5
 *  
 * 6) Escreva uma função que calcula a soma dos valores da diagonal de uma matriz.
 * 
 */

programa
{
	inclua biblioteca Util

	const inteiro N=3
	
	funcao inicio()
	{
		inteiro soma=0
		inteiro matriz[N][N] = {
			{ 1, 0, 0 },
			{ 0, 1, 0 },
			{ 0, 0, 1 }
		}

		para (inteiro i = 0; i < Util.numero_linhas(matriz); i++)
		{
			para (inteiro j = 0; j < Util.numero_colunas(matriz); j++)
			{
				se (i == j) { soma += matriz[i][j] }
			}
		}
		
		escreva("A soma da diagonal (principal) da matriz ", N, "x", N, " é ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 534; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */