package br.com.generation.condicional.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.println("Entre com o primeiro número: ");
		n1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		n2 = scan.nextInt();
		
		System.out.println("Entre com o terceiro número: ");
		n3 = scan.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("O maior número inserido foi: " + n1);
		}
		else if (n2 > n1 && n2 > n3) {
			System.out.println("O maior número inserido foi: " + n2);
		}
		else {
			System.out.println("O maior número inserido foi: " + n3 + ".");
		}
		
		scan.close();

	}

}
