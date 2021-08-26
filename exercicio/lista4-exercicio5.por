/* Lista 4
 *  
 * 5) Escreva um programa que calcule o número de dígitos de um dado número usando recursão
 * 
 */

programa
{
	funcao inicio()
	{
		inteiro num, numDigitos

		escreva("Digite um número: ")
		leia(num)
		
		escreva("O número de dígitos de ", num, " é : ", contadorDeDigitos(num), "\n")
	}

	funcao inteiro contadorDeDigitos(inteiro num)
	{
		inteiro i = 1
		
		se (num >= 10)
		{
			num /= 10
			i += contadorDeDigitos(num)
		}
		retorne i
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 391; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */