/* Lista 2
 *  
 * 1) Escreva um programa para verificar se um triângulo pode ser formado pelo valor
 * 	 fornecido para os ângulos.
 * 
*/

programa
{
	funcao inicio()
	{
		inteiro angulo1, angulo2, angulo3, somaDosAngulos

		escreva("Digite o primeiro angulo : ")
		leia(angulo1)
		
		escreva("Digite o segundo angulo : ")
		leia(angulo2)
		
		escreva("Digite o terceiro angulo : ")
		leia(angulo3)

		somaDosAngulos = angulo1 + angulo2 + angulo3

		se (somaDosAngulos == 180)
		{
			escreva("O triângulo é válido\n")
		}
		senao
		{
			escreva("O triângulo não é válido\n")
		}
 	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */