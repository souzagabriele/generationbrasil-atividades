programa
{
	
	
	inclua biblioteca Matematica --> mat
	funcao inicio(){
		
		inteiro num1, num2, num3, num4
		real resultado1, resultado2, resultado3, resultado4
		
		escreva("Entre com o primeiro número: ")
		leia(num1)
		
		escreva("Entre com o segundo número: ")
		leia(num2)
		
		escreva("Entre o terceiro número: ")
		leia(num3)
		
		escreva("Entre o quarto número: ")
		leia(num4)
		
		resultado1 = mat.raiz(num1, 2)
		resultado2 = mat.raiz(num2, 2)
		resultado3 = mat.raiz(num3, 2)
		resultado4 = mat.raiz(num4, 2)
		
		se(resultado3 >= 1000){
			escreva("O quadrado do terceiro número é: ", resultado3)
		}
		senao{
			escreva("\nQuadrado do primeiro número: ", resultado1)
			escreva("\nQuadrado do segundo número: ", resultado2)
			escreva("\nQuadrado do terceiro número: ", resultado3)
			escreva("\nQuadrado do quarto número: ", resultado4)
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 354; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */