/* Lista 5
 * 7) Escreva uma função que multiplica duas matrizes.
 */

programa
{
	inclua biblioteca Util

	/*
	   |  2  3  1  |     |  1  -2  |     |  6  12  |
	   | -1  0  2  |  X  |  0   5  |  =  |  7  4  |
	                    |  4   1  |
	 */
	
	funcao inicio()
	{
		const inteiro N=2, M=3
		
		inteiro matriz1[N][M], matriz2[M][N], matrizResultate[N][N]

		preencher("Matriz 1:\n", matriz1)
		preencher("Matriz 2:\n", matriz2)

		multiplicaMatriz(matriz1, matriz2, matrizResultate)

		imprimir("\nMatriz 1\n", matriz1)
		imprimir("\nMatriz 2\n", matriz2)
		imprimir("Multiplicação das matrizes 1 e 2\n", matrizResultate)
	}

	funcao multiplicaMatriz(inteiro matriz1[][], inteiro matriz2[][], inteiro matrizResultate[][])
	{
		para(inteiro i=0; i < Util.numero_linhas(matriz1); i++)
		{	
			para(inteiro j=0; j < Util.numero_colunas(matriz2); j++)
			{
				matrizResultate[i][j] = 0

				para(inteiro k=0; k < Util.numero_colunas(matriz1); k++)
				{
					matrizResultate[i][j] += matriz1[i][k] * matriz2[k][j]
				}
			}
		}
	}

	funcao imprimir(cadeia nome, inteiro matriz[][])
	{
		escreva(nome)
		
		para (inteiro i=0; i < Util.numero_linhas(matriz); i++)
		{
			escreva("| ")
			para (inteiro j=0; j < Util.numero_colunas(matriz); j++)
			{
				escreva(matriz[i][j], " ")
			}
			escreva("|\n")
		}
	}
	
	funcao preencher(cadeia nome, inteiro matriz[][])
	{
		inteiro aux

		escreva(nome)
		
		para (inteiro i=0; i < Util.numero_linhas(matriz); i++)
		{
			para (inteiro j=0; j < Util.numero_colunas(matriz); j++)
			{
				escreva("Linha [", i+1, "] Coluna [", j+1, "] : ")
				leia(aux)
				matriz[i][j] = aux
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 249; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */