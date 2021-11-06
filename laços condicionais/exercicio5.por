programa
{
	
	funcao inicio(){

		real ip
		
		escreva("Digite o índice de poluição: ")
		leia(ip)
		
		se(ip >= 0.3){
		escreva("1º grupo: Suspender as atividades!")
		}
			senao se(ip >= 0.4){
		escreva("1º e 2º grupos: Suspender as atividades!")
		}
			senao se(ip >= 0.5){
		escreva("Todos os grupos: Suspender as atividades!")
		}
		
		senao{
		escreva("Índice de poluição aceitável.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 347; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */