programa
{
	
	funcao inicio(){

    inteiro li,co, soma = 0, somaDiagonal = 0
    inteiro m[3][3]

    escreva("Entre com os valores: ")    
    para(li = 0; li < 3; li++)
     {
        para(co=0; co<3; co++)
         {
         	leia(m[li][co])
           soma = soma + m[li][co]

           se(li == co) {
           	  somaDiagonal = somaDiagonal + m[li][co]
           	}
         }
     }
    escreva("\n A soma dos valores: \n", soma)
    
    escreva("\nA soma da diagonal principal = ", somaDiagonal)
}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 514; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */