programa
{
	
	funcao inicio(){

	real peso, excesso, valormulta, multa = 4.0
	
	escreva("Insira o peso do tomate, em quilos: ")
	leia(peso)

	se(peso<=50){
		escreva(peso, " quilos")}
		
		senao{
			excesso= peso - 50
			escreva("Peso em excesso, há ", excesso ," quilos a mais.")
			valormulta = multa * excesso
		escreva("\nMulta aplicada em: R$", valormulta)		
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 375; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */