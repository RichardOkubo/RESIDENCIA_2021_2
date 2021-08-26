/* Lista 4
 *  
 * 3) Utilize a função do exercício 1 para verificar se 5 alunos conseguiram média acima
 * 	 de 7 para passar no curso de programação. ( crie uma nova função para dizer se os
 * 	 alunos passaram ou não )
 */

programa
{
	funcao inicio()
	{
		const real NOTA_MINIMA_PARA_APROVACAO = 7.0
		
		inteiro numAlunos
		real nota1, nota2
		
		escreva("Número de alunos : ")
		leia(numAlunos)

		para (inteiro i=1; i <= numAlunos; i++)
		{
			escreva("\nDigite a nota 1 do aluno ", i," : ")
			leia(nota1)
	
			escreva("Digite a nota 2 do aluno ", i," : ")
			leia(nota2)
	
			se (media(nota1, nota2) > NOTA_MINIMA_PARA_APROVACAO)
			{
				escreva("Aluno ", i," passou\n")
			}
			senao
			{
				escreva("Aluno ", i," reprovou\n")
			}
		}
	}

	funcao real media(real x, real y)
	{
		retorne (x + y) / 2
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 401; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */