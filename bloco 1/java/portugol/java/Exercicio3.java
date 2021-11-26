package br.com.generation.portugol.java;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int horas, minutos, segundos;
		 
		Scanner scan = new Scanner (System.in);
		 
		System.out.println("Quantos segundos durará o evento? ");
		segundos = scan.nextInt();
		 
		horas = (segundos / 3600);
		minutos = ((segundos % 3600) / 60);
		segundos = ((segundos % 3600) % 60);
			
		System.out.println("O evento durará de " + horas + " horas " + minutos + " minutos e " + segundos + " segundos.");

		scan.close();
	}

}
