/* Lista 1
 *  
 * 4) Escreva um programa que receba a temperatura em Celsius e retorne o valor em Fahrenheit
 * 
 */

programa
{
	funcao inicio()
	{
		real tempCelsius, tempCahrenheit
		
		escreva("Digite o valor da temperatura em Celsius : ")
		leia(tempCelsius)
		
		tempCahrenheit = (tempCelsius * 9) / 5 + 32
		
		escreva(tempCelsius, " graus Celsius é o mesmo que ", tempCahrenheit ," graus Fahrenheit\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 416; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */