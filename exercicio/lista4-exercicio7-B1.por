/* Lista 4
 *  
 * 7) Escreva um programa que armazene elementos em um vetor​ e encontra o valor mínimo e máximo
 * 
 */

programa
{
	funcao inicio()
	{
		const inteiro DIMENSAO = 5
		
		//inteiro v[DIMENSAO], aux
		inteiro v[DIMENSAO] = { 10, -1, 3, 40, 0 }

		/*
		escreva("Armazene 5 elementos em um vetor\n")

		para (inteiro i = 0; i < DIMENSAO; i++)
		{
			escreva("Elemento - ", i, " : ")
			leia(aux)
			v[i] = aux
		}
		*/

		escreva("Elemento máximo : ", verificaMaximo(v, DIMENSAO))
		escreva("\nElemento minimo : ", verificaMinimo(v, DIMENSAO))
	}


	funcao inteiro verificaMaximo(inteiro v[], inteiro dimensao)
	{
		inteiro max
		
		se (dimensao == 1) { max = v[0] }
		senao
		{
			max = verificaMaximo(v, dimensao-1)
									     // índice
			se (max < v[dimensao-1]) { max = v[dimensao-1] }
		}
		retorne max
	}

	funcao inteiro verificaMinimo(inteiro v[], inteiro dimensao)
	{
		inteiro min
		
		se (dimensao == 1) { min = v[0] }
		senao
		{
			min = verificaMinimo(v, dimensao-1)
										// índice
			se (min > v[dimensao-1]) { min = v[dimensao-1] }
		}
		retorne min
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 435; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {v, 14, 10, 1}-{dimensao, 32, 52, 8}-{max, 34, 10, 3}-{min, 48, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */