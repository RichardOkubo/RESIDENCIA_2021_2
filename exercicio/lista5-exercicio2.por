/* Lista 5
 *  
 * 2) Escreva um programa que armazene X números em um vetor e calcule o valor médio do vetor.
 * 
 */

programa
{
	inclua biblioteca Tipos
	
	funcao inicio()
	{
		const inteiro X = 5
		
		inteiro vetor[X], soma=0, aux

		escreva("Insira ", X, " elementos em um vetor.\n")
		
		para (inteiro i=0; i < X; i++)
		{
			escreva("Elemento ", i+1, " : ")
			leia(aux)
			
			soma += aux
		}

		escreva("\nA média é ", Tipos.inteiro_para_real(soma) / Tipos.inteiro_para_real(X), "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 286; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */