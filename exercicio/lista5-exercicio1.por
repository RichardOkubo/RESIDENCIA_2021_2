/* Lista 5
 *  
 * 1) Escreva um programa que leia 10 números inteiros do teclado e armazena no
 *    vetor. Após isso, imprima os 10 inteiros em ordem inversa ao que foi digitado.
 * 
 */

programa
{
	funcao inicio()
	{
		const inteiro N=10
			
		inteiro v[N], aux

		escreva("Insira 10 valores em um vetor.\n")
		
		para (inteiro i=0; i < N; i++)
		{
			escreva("Elemento ", i+1, " : ")
			leia(aux)
			v[i] = aux
		}

		escreva("\nVetor: ")
		
		para (inteiro i=0; i < N; i++)
		{
			escreva(v[i], " ")
		}

		escreva("\nVetor na orden inversa: ")
		
		para (inteiro i=N-1; i >= 0; i--)
		{
			escreva(v[i], " ")
		}
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 635; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */