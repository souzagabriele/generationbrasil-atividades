programa
{
	
	funcao inicio(){

		real dado [10], media = 0
		

		para(inteiro i = 0; i < 9;i++){

			escreva("\nDigite os lançamentos do dado: ")
			leia(dado[i])

			media += (dado[i]) / 10
			}
			
			para(inteiro i = 0; i < 9; i++){

			escreva("\nOs lançamentos do dado foram: ", dado[i], "\n")
			}
			
			escreva("\nA média dos lançamentos foi: ", media, "\n")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 38; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */