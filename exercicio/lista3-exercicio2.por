/* Lista 3
 *  
 * 2) Escreva um programa que faça a tabuada de um número n.
 * 
 */

programa
{
	funcao inicio()
	{
		inteiro n

		escreva("Quer ver a tabuada de qual número? ")
		leia(n)
		
		para (inteiro i=1; i <= 10; i++)
		{
			escreva(n, " x ", i, " = ", n*i, "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 195; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */