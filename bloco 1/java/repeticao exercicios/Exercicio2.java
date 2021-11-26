package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner (System.in);
			
			int n = 10; int x; int qtPar = 0;
			int qtImpar 	= 0; int i;
		
			for(i = 0; i < n; i++)
			{
				System.out.println("Entre com o número: ");
				x = scan.nextInt();
				
				if (x % 2 == 0) { 
					qtPar++;
				}
				else {
					qtImpar++;
				}
			
			System.out.println("Números pares: " + qtPar);
			System.out.println("Números impares: " + qtImpar);
			
			scan.close();
		}
		
	}

}
