package br.com.generation.condicional.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		double numero;
		
		System.out.println("Entre com um número: ");
		numero = scan.nextDouble();

		
		if((numero % 2) == 0) {
			System.out.println("O número é par e sua raíz quadrada é " + Math.sqrt(numero));
		}
		else {
			System.out.println("O número " + numero + " é ímpar e sua raíz quadrada é " + (numero * numero) + ".");
		}
		scan.close();

	}
	
}
