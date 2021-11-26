package br.com.generation.portugol.java;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double numA, numB, numC, d, r, s;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o valor do número A: ");
		numA = scan.nextDouble();
		
		System.out.println("Digite o valor do número B: ");
		numB = scan.nextDouble();
		
		System.out.println("Digite o valor do número C: ");
		numC = scan.nextDouble();
		
		
		r = Math.pow ((numA + numB), 2.0);
		s = Math.pow ((numB + numC), 2.0);

		d = r + s / 2;

	    System.out.println("o resultado de D = R + 5/2 resulta em = " + d);

		scan.close();
	}

}
