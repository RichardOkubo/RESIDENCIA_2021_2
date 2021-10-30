/* Lista 1
 *  
 * 3) Uma empresa paga R$10.00 por hora normal trabalhada e R$ 15.00 por hora extra.
 * 	 Escreva um algoritmo que leia o total de horas normais e o total de horas extras
 * 	 trabalhadas por um empregado em um ano e calcule o salário anual deste trabalhador.
 * 
*/

programa
{
	funcao inicio()
	{
		const inteiro VALOR_POR_HORA_TRABALHADA = 10 
		const inteiro VALOR_POR_HORA_EXTRA_TRABALHADA = 15
		
		inteiro horasTrabalhadas, horasExtrasTrabalhadas, salario
		
		escreva("Digite o número de horas trabalhadas no ano : ")
		leia(horasTrabalhadas)
		
		escreva("Digite o número de horas extras trabalhadas no ano : ")
		leia(horasExtrasTrabalhadas)

		salario = (horasTrabalhadas * VALOR_POR_HORA_TRABALHADA) + (horasExtrasTrabalhadas * VALOR_POR_HORA_EXTRA_TRABALHADA)

		escreva("Seu salário anual é de : R$", salario, "\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 192; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */