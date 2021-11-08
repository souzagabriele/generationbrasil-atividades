package br.com.generation.portugol.java;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		int custo, total;
		
		Scanner scan = new Scanner (System.in);

		System.out.println("Qual o custo de fabricação do veículo?");
		custo = scan.nextInt();

		total = ((custo / 100) *28) + ((custo / 100) *45) + custo;
		
		System.out.println("O custo do veículo para o consumidor será de " + total + " reais ");
		
		scan.close();
		
	}

}
