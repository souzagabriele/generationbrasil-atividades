package br.com.generation.vetoresmatrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int soma = 0, somaDiagonal = 0;

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.println("Digite o valor: ");
				matriz[l][c] = scan.nextInt();

				soma += matriz[l][c];
				if (l == c) {
					somaDiagonal = matriz[l][c];
				}
			}
		}

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {

				System.out.print("\n" + matriz[l][c]);
			}
			System.out.println();
		}

		System.out.println("A soma da matriz: " + soma);
		System.out.println("A soma da diagonal principal: " + somaDiagonal);

		scan.close();
	}

}