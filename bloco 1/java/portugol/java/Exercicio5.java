package br.com.generation.portugol.java;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int nota1, nota2, nota3,
		nota1total, nota2total, nota3total,
		mediafinal;

		Scanner scan = new Scanner (System.in);

		
		System.out.println("Informe sua primeira nota: ");
	    nota1 = scan.nextInt();
	    
	    System.out.println("Informe sua segunda nota: ");
	    nota2 = scan.nextInt();

	    System.out.println("Informe sua terceira nota: ");
	    (nota3) = scan.nextInt();


	    nota1total = (nota1 * 2);
	    nota2total = (nota2 * 3);
	    nota3total = (nota3 * 5);
	    	
	    mediafinal = (nota1total + nota2total + nota3total) / 10;
	    	
	    
	    System.out.println("\nA sua nota final é: " + mediafinal);
		scan.close();

	}

}
