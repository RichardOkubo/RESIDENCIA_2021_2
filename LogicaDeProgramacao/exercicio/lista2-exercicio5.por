/* Lista 2
 *  
 * 5) Implemente um programa tomador de decisão que considera as seguintes opções
 * 	 para determinar se o usuário usará a fila preferencial ou a fila comum.
 * 	 
 * 	 O usuário usa a fila preferencial caso :
 * 	 	- Possui mais de 60 anos : Usa fila preferencial
 * 	 	- É deficiente físico : Usa fila preferencial
 * 	 	- É mulher gestante : Usa fila preferencial
 * 
 */
 
programa
{
	inclua biblioteca Texto --> tx
	
	funcao inicio()
	{
		inteiro idade
		cadeia sexo
		logico condicaoEspecial = falso
		
		escreva("Idade: ")
		leia(idade)

		escreva("Sexo: ")
		leia(sexo)

		se (sexo == "mulher")
		{
			escreva("Gestante? (verdadeiro/falso) ")
			leia(condicaoEspecial)
		}
		senao
		{
			escreva("Deficiente físico? (verdadeiro/falso) ")
			leia(condicaoEspecial)
		}

		se (idade > 60 ou condicaoEspecial)
		{
			escreva("Fila preferencial\n")
		}
		senao
		{
			escreva("Fila não preferencial\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 525; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */