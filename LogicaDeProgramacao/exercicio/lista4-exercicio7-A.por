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

		inteiro v[DIMENSAO], aux, max=0 , min=0
		
		escreva("Armazene 5 elementos em um vetor\n")

		para (inteiro i = 0; i < DIMENSAO; i++)
		{
			escreva("Elemento - ", i, " : ")
			leia(aux)
			v[i] = aux
		}
		
		max = v[0]
		min = v[0]
		
		para (inteiro i=1; i < DIMENSAO; i++)
		{
			se (v[i] > max) { max = v[i] }
			se (v[i] < min) { min = v[i] }
		}

		escreva("Elemento máximo : ", max)
		escreva("\nElemento minimo : ", min)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 505; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {v, 13, 10, 1}-{max, 13, 28, 3}-{min, 13, 36, 3}-{i, 17, 16, 1}-{i, 27, 16, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */