/* Lista 5
 *  
 * 3) Escreva uma função que retorna todos os valores duplicados de um array
 * 
 */

programa
{	
	inclua biblioteca Util
	
	const inteiro N = 7
	
	funcao inicio()
	{
		inteiro array[N] = { -1, -1, 3, 3, 5, -2, -2}

		escreva("Antes: ")
		para (inteiro i=0; i < N; i++) { escreva(array[i]," ") }
		
		removeDuplicados(array)	
	}

	funcao removeDuplicados(inteiro array[])
	{
		inteiro j=1, arraySimplifido[N]
		
		arraySimplifido[0] = array[0]
		
		para (inteiro i=0; i < N; i++)
		{
			se (nao encontrar(array[i], arraySimplifido))
			{
				arraySimplifido[j] = array[i]
				j++
			}
		}

		escreva("\nDepois: ")
		para (inteiro i=0; i < Util.numero_elementos(arraySimplifido); i++)
		{
			escreva(arraySimplifido[i]," ")
		}
		escreva("\n")
	}

	funcao logico encontrar(inteiro elemento, inteiro arraySimplifido[])
	{	
		para (inteiro i=0; i < N; i++)
		{
			se (elemento == arraySimplifido[i]) { retorne verdadeiro }
		}
		retorne falso
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 215; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */