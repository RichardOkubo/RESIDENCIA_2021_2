/* Lista 2
 *  
 * 2) Escreva um programa para verificar se um triângulo é Equilátero, Isósceles ou Escaleno.
 * 
 */

programa
{
	funcao inicio()
	{
		inteiro angulo1, angulo2, angulo3

		escreva("Digite o primeiro ângulo : ")
		leia(angulo1)
		
		escreva("Digite o segundo ângulo : ")
		leia(angulo2)
		
		escreva("Digite o terceiro ângulo : ")
		leia(angulo3)

		se (angulo1 + angulo2 + angulo3 == 180)
		{
			se (angulo1 == angulo2 e angulo2 == angulo3)
			{
				escreva("O triangulo é equilátero\n")
			}
			senao se (angulo1 != angulo2 e angulo2 != angulo3)
			{
				escreva("O triangulo é escaleno\n")
			}
			senao
			{
				escreva("O triangulo é isósceles\n")
			}
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
 * @POSICAO-CURSOR = 363; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */