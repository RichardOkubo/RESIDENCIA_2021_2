/* Lista 2
 *  
 * 6) Escreva um programa que imprima todos os número de 1 até n.
 * 
 */

programa
{
	funcao inicio()
	{
		inteiro num, contador

		escreva("Digite um número inteiro positivo não nulo: ")
		leia(num)
		
		contador = 1

		enquanto (contador <= num) {
			escreva(contador, "... ")
			contador++
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */