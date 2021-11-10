package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int numero; int soma = 0;

		do {

			System.out.println("Entre com um número");
			numero = scan.nextInt();
		
			soma = soma + numero;
		}
		
		while(numero != 0);

		System.out.println("Soma: " + soma);

		scan.close();
	}
}
