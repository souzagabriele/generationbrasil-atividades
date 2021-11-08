programa
{
	
	funcao inicio(){
		
		real codigo, nhoras, nhorasextra, salario = 500.0, horaextra = 20.0, salariototal, salariotextra
		
		escreva("Digite o código do funcionário: ")
		leia(codigo)
		
		escreva("Digite o número de horas trabalhadas: ")
		leia(nhoras)

		}
		
		se(nhoras>50){
			nhorasextra = nhoras - 50
			salarioextra = nhorasextra * horaextra
			salarioTotal = salario + salarioextra
				
		escreva("O valor total de seu salário total é: R$", salariototal)
			
		escreva("\nO valor de seu salário extra é: R$", salarioextra)
		
		}
		
	senao{
			escreva("Seu salário total: R$", salario)
			escreva("\nSeu salário extra: R$0.00")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 652; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */