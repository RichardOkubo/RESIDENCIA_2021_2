/* Lista 3
 * 4) Escreva um programa que imprima o padrão de uma pirâmide de asteriscos dado
 * 	 um número n.
 */

programa
{
	funcao inicio()
	{
		inteiro n

		escreva("> ")
		leia(n)

		para (inteiro i=1; i <= n; i++)
		{
			para (inteiro j=1; j <= n-i; j++)
			{
				escreva(" ")
			}
			para (inteiro j=1; j <= i; j++)
			{
				escreva(" *")
			}
			escreva("\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 344; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n, 10, 10, 1}-{i, 15, 16, 1}-{j, 17, 17, 1}-{j, 21, 17, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */