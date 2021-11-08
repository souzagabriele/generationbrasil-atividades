programa {
    funcao inicio() {
        escreva("PARA - questão 1:\n")
        para_questao_1()
        
        escreva("PARA - questão 2:\n")
        para_questao_2()
        
        escreva("ENQUANTO - questão 1:\n")
        enquanto_questao_1()
        
        escreva("ENQUANTO - questão 2:\n")
        enquanto_questao_2() 
        
        escreva("FACA...ENQUANTO - questão 1:\n")
        faca_enquanto_questao_1()
        
        escreva("FACA...ENQUANTO - questão 2:\n")
        faca_enquanto_questao_2() 
    }
    //PARA
    
    /*
    1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
    coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
        a) média do salário da população;
        b) média do número de filhos;
        c) maior salário;
        d) percentual de pessoas com salário até R$100,00.
    */
	funcao para_questao_1() {
		
	}
	
	/*
    2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são
    múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
	*/
	funcao para_questao_2() {
	    
	    inteiro soma = 0
	    
	    para(inteiro i = 1; i <= 500; i++) {
	        
	        logico ehImpar = i % 2 != 0
	        logico ehMultiploDeTres = i % 3 == 0
	        
	        se (ehImpar e ehMultiploDeTres) {
	            soma = soma + i
	        }
	    }
	    
	    escreva(soma+"\n")
	}
	
	//	ENQUANTO
	
	/*
    1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
    apresente no final o total do somatório, a média e o total de valores lidos. O programa
    deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
    positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
    negativo.
    */
    funcao enquanto_questao_1() {
    	
            inteiro total = 0,
                    quantidadeDeValores = 0,
                    valorAtual,
                    media
            
            leia(valorAtual)
            
            enquanto (valorAtual > 0) {
                
                quantidadeDeValores++
                total = total + valorAtual
                
                leia(valorAtual)
            }
                    
            media = total/quantidadeDeValores
            
            escreva("total = "+total+"\n")
            escreva("quantidade de valores = "+quantidadeDeValores+"\n")
            escreva("media = "+media+"\n")
    }
    
    /*
    2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por
    três (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário
    digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.
    */
    
    funcao enquanto_questao_2() {
            
            inteiro numeroDigitado,
                    resultado
            
            leia(numeroDigitado)
            
            resultado = numeroDigitado
            
            enquanto (resultado <= 100) {
                
                escreva (resultado + " ")
                resultado = resultado * 3
                
            }
            
            escreva(resultado + "\n")
    }
    
    
    //FAÇA...ENQUANTO
    /*
    1- Faça um programa que mostre uma contagem na tela de 233 a 456, só que
    contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
    */
    funcao faca_enquanto_questao_1() {
	    
	    inteiro contagem = 233
	    
	    faca {
	        
	        se(contagem >= 300 e contagem < 400) {
	            contagem = contagem + 3
	        } senao {
	            contagem = contagem + 5
	        }
	        
	        escreva(contagem+" ")
	        
	    } enquanto (contagem <= 456 - 5)
	    
	     escreva("\n")
	}
    
    /*
    2- Faça um programa que pegue um número do teclado e calcule a soma de todos os
    números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
    1+2+3+4+5+6+7=28.
	*/
	
	funcao faca_enquanto_questao_2() {
	        
	    inteiro soma = 0,
	            valorAtual = 1,
	            valorMaximo
	   
	    leia(valorMaximo)
	    
	    faca {
	        
	        soma = soma + valorAtual
	        valorAtual++
	        
	    } enquanto (valorAtual <= valorMaximo)
	    
	     escreva(soma+"\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1842; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */