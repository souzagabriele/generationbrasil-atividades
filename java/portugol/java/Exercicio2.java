package br.com.generation.portugol.java;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int anos, meses, dias;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Quanto de idade você tem, por dias? ");
		dias = scan.nextInt();

	    anos = (dias / 365);
	    meses = ((dias % 365) / 30);
	    dias = ((dias % 365) % 30);
		
	    System.out.println("Você tem " + anos + " anos " + meses + " meses, e " + dias + " dias. ");
		
		scan.close();
	}

}
