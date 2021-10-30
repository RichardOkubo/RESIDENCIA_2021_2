/* Lista 5
 *  
 * 4) Escreva uma função que ordena um vetor com 20 números.
 * Dica : Pesquisar por Bubble Sort
 * 
 */
 
programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro v[] = {0, 8, 6, 7, 1, 3, 5, 2, 9, 4}

		escreva("Vetor original: ")
		imprimeVetor(v)

		bubbleSort(v)
		
		escreva("Vetor ordenado: ")
		imprimeVetor(v)
	}

	funcao imprimeVetor(inteiro v[])
	{
		escreva("[ ")
		para (inteiro i=0; i < Util.numero_elementos(v); i++) { escreva(v[i], " ") }
		escreva("]\n")
	}

	funcao bubbleSort(inteiro v[])
	{
		inteiro aux, n=Util.numero_elementos(v)

		para (inteiro i=1; i < n; i++)
		{
			para (inteiro j=0; j < n-i; j++)
			{
				se (v[j] > v[j+1])
				{
					aux = v[j]
					v[j] = v[j+1]
					v[j+1] = aux
				}
			}
		}
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 396; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */