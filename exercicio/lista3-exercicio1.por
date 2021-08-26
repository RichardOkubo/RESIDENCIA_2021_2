/* Lista 3
 *  
 * 1) Modifique o exercício 6 da lista anterior para imprimir os números de 1 até n e
 * também realizar sua soma.
 * 
 */

programa
{
	funcao inicio()
	{
		inteiro num, contador
		inteiro soma = 0

		escreva("Digite um número inteiro positivo não nulo: ")
		leia(num)
		
		contador = 1
	
		enquanto (contador <= num) {
			escreva(contador, " ")
			soma += contador
			contador++
		}
		escreva("\n", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 287; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */