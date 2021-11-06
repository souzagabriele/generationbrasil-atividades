programa
{
	
	funcao inicio(){
		
		real notas[5], maior = 0.0 inteiro i


	 	escreva("Entre com a sua nota: ")
	 	para(i = 0; i <= 4; i++){
		escreva("\nNota do " + (i+1) + "º valor: ")
		leia(notas[i])
		 		
		 	se (notas[i] > maior){
		 			maior = notas[i]
		 		}
		 			
		 		}
		 	escreva("O maior valor é " + maior)
		}	
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 328; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */