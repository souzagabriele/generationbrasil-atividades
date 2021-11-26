package br.com.generation.portugol.java;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int anos, meses, dias, idade;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		anos =  scan.nextInt();
		
		System.out.println("Digite também, incluindo os meses: ");
		meses = scan.nextInt();
		
		System.out.println("Há quantos dias você completou " + anos + " anos e " + meses + " meses? ");
		dias = scan.nextInt();

		idade = (365 * anos) + (30 * meses) + dias;

		System.out.println("Você nasceu há " + idade + " dias.");
		
		scan.close();
	}
}