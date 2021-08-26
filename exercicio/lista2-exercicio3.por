/* Lista 2
 *  
 * 3) Escreva um programa para verificar se um caractere é uma vogal ou consoante.
 * 
 */

programa
{
	funcao inicio()
	{
		caracter letra
		
		escreva("Digite um caracter: ")
		leia(letra)

		se (letra == 'a' ou letra == 'e' ou letra == 'i' ou letra == 'o' ou letra == 'u')
		{
			escreva("'", letra, "' é uma vogal\n")
		}
		senao
		{
			escreva(letra, " é uma consoante\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 345; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */