package br.com.generation.portugol.java;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		double a, b, c, d, e, f, x, y; 
		
		Scanner scan = new Scanner (System.in);

		System.out.println("Digite o valor de A: ");
		a = scan.nextDouble();

		System.out.println("Digite o valor de B: ");
		b = scan.nextDouble();

		System.out.println("Digite o valor de C: ");
		c = scan.nextDouble();
		
		System.out.println("Digite o valor de D: ");
		d = scan.nextDouble();
		
		System.out.println("Digite o valor de E: ");
		e = scan.nextDouble();

		System.out.println("Digite o valor de F: ");
		f = scan.nextDouble();

		x = ((c*e) - (b*f)) / (a*e) - ((b*d));
		y = ((a*f) - (c*d)) / ((a*e) - (b*d));

		System.out.println("O valor de X é: " + x + " e o valor de Y é " + y);
		
		scan.close();

	}

}
