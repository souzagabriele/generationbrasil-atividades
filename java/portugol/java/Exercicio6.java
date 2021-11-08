package br.com.generation.portugol.java;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, p1, p2, d;

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o valor de X do primeiro ponto: ");
		x1 = scan.nextDouble();
		
		System.out.println("Digite o valor de Y do primeiro ponto: ");
		y1 = scan.nextDouble();

		System.out.println("Digite o valor de X do segundo ponto: ");
		x2 = scan.nextDouble();
		
		System.out.println("Digite o valor de Y do segundo ponto: ");
		y2 = scan.nextDouble();
		
		p1 = Math.pow((x2-x1), 2.0);
		p2 = Math.pow((y1-y2), 2.0);
		d = Math.sqrt(p1+p2);

		System.out.println("A distância entre dois pontos é: " + d);
		
		scan.close();

	}
		
}
