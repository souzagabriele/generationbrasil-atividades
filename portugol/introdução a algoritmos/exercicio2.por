programa
{
	
	funcao inicio()
	{
		inteiro idade, anos, meses, dias
		
		escreva("Quanto de idade você tem, por dias? ")
		leia(dias)
		
		anos = (dias/365)
		meses = ((dias % 365) / 30)
		dias = ((dias % 365) % 30)

		
		escreva("Você tem ", + anos , + " anos ", meses, + " mês/meses " + dias, " dia/dias ")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 309; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */