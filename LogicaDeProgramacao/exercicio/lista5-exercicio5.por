/* Lista 5
 *  
 * 5) Escreva uma função que calcula a média dos números de um vetor, excluindo o
 *    maior e o menor valor.
 *    
 */
 
programa
{
	inclua biblioteca Util

	funcao inicio()
	{
		inteiro v[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }
		
		escreva(media(v))
	}

	funcao real media(inteiro v[])
	{
		inteiro soma=0, n=Util.numero_elementos(v), max=v[0], min=v[0]

		para (inteiro i=1; i < n; i++)
		{
			se (v[i] > max) { max = v[i] }
			se (v[i] < min) { min = v[i] }
		}

		para (inteiro i=0; i < n; i++)
		{
			se (v[i] != max e v[i] != min) { soma += v[i] }
		}
		retorne soma / 2.0
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 519; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */