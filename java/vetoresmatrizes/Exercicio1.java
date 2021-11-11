package br.com.generation.vetoresmatrizes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[] notas = new double[5];
		double maior = 0.0;
		int i;

		System.out.println("Entre com as suas notas: ");

		for (i = 0; i <= 4; i++) {
			System.out.println("\nNota do " + (i + 1) + "º valor: ");
			notas[i] = scan.nextDouble();

			if (notas[i] > maior) {
				maior = notas[i];
			}

		}
		System.out.println("O maior valor é " + maior);
		scan.close();
	}
}