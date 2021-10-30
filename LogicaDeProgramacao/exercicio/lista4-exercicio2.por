/* Lista 4
 *  
 * 2) Escreva uma função que receba um ano e diga se ele é bissexto ou não e utilize
 * 	 esta função para verificar 5 :
 */

programa 
{
	funcao inicio()
	{
		inteiro ano

		escreva("Digite um ano qualquer: ")
		leia(ano)
		
		se (verificaAnoBissexto(ano))
		{
			escreva("O ano ", ano," é bissexto")
		}
		senao
		{
			escreva("O ano ", ano," não é bissexto")
		}
	}

	/*
	   De 4 em 4 anos é ano bissexto.
	   De 100 em 100 anos NÃO é ano bissexto.
	   De 400 em 400 anos é ano bissexto.
	   Prevalecem as últimas regras sobre as primeiras.
	 */
	funcao logico verificaAnoBissexto(inteiro ano)
	{
		se ( ano%4 == 0 e (ano%100 != 0 ou ano%400 == 0) )
		{
			retorne verdadeiro
		}
		retorne falso
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 666; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */