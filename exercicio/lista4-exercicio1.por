/* Lista 4
 *  
 * 1) Escreva uma função que recebe 2 números e calcule a média entre eles
 * 
 */

programa
{
	funcao inicio()
	{
		real x, y
		
		escreva("Digite o primeiro número: ")
		leia(x)
		
		escreva("Digite o segundo número: ")
		leia(y)

		escreva("A média é : ", media(x, y))
	}
	
	funcao real media(real x, real y)
	{
		retorne (x + y) / 2
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 297; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */