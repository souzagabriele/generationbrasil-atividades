package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int numero, soma = 0;
		double media = 0, cont = 0;
		
		System.out.println("Entre com um número inteiro: ");
		numero = scan.nextInt();
		 
		 if(numero % 3 == 0 && numero!=0)
		 {	 
		soma = soma + numero;
		 	cont++;
		 }
		while(numero != 0)
		{
			System.out.println("Entre com um número inteiro ");
			numero = scan.nextInt();

			if(numero % 3 == 0 && numero != 0)
			{
				soma = soma + numero;
				cont++;
			}
			media = soma/cont;
	}
		 System.out.println("A media dos numeros múltiplos de 3 é: " + media);
		
		 scan.close();
	}

}
