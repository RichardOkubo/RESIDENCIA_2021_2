/* Lista 4
 *  
 * 7) Escreva um programa que armazene elementos em um vetor​ e encontra o valor mínimo e máximo
 * 
 */

programa
{
	inclua biblioteca Matematica --> mat

	funcao inicio()
	{
		const inteiro DIMENSAO = 5
		
		inteiro aux, v[DIMENSAO] // { 10, -1, 3, 40, 0 }

		escreva("Armazene 5 elementos em um vetor\n")

		para (inteiro i = 0; i < DIMENSAO; i++)
		{
			escreva("Elemento - ", i, " : ")
			leia(aux)
			v[i] = aux
		}

		escreva("\nElemento máximo : ", verificaMaximo(v, DIMENSAO))
		escreva("\nElemento minimo : ", verificaMinimo(v, DIMENSAO))
	}

	funcao inteiro verificaMaximo(inteiro v[], inteiro dimensao)
	{		
		se (dimensao == 1) { retorne v[0] }
		
		retorne mat.maior_numero(verificaMaximo(v, dimensao-1), v[dimensao-1])
	}

	funcao inteiro verificaMinimo(inteiro v[], inteiro dimensao)
	{
		se (dimensao == 1) { retorne v[0] }

		retorne mat.menor_numero(verificaMinimo(v, dimensao-1), v[dimensao-1])
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 171; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {v, 15, 15, 1}-{dimensao, 30, 52, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */