package br.com.generation.vetoresmatrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[] dado = new double[10];
		double media = 0.0;

		for (int i = 0; i < 9; i++) {

			System.out.println("\nDigite os lançamentos do dado: ");
			dado[i] = scan.nextDouble();

			media += (dado[i]) / 10;
		}

		for (int i = 0; i < 9; i++) {

			System.out.println("\nOs lançamentos do dado foram: " + dado[i] + "\n");
		}

		System.out.println("\nA média dos lançamentos foi: " + media + "\n");
		scan.close();
	}

}
