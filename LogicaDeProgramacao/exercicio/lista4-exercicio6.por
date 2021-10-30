/* Lista 4
 *  
 * 6) Escreva um programa que armazene elementos em um ​ vetor​ e imprima-os
 * 
 */
 
programa
{
	funcao inicio()
	{
		inteiro v[5], aux
		
		escreva("Armazene 5 elementos em um vetor\n")

		para (inteiro i = 0; i < 5; i++)
		{
			escreva("Elemento - ", i, " : ")
			leia(aux)
			v[i] = aux
		}

		escreva("\nOs elementos em um vetor : ")
		
		para (inteiro i = 0; i < 5; i++)
		{
			escreva(v[i], " ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 113; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */