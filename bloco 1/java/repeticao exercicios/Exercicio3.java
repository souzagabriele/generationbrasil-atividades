package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int idade = 0, cont21 = 0, cont50 = 0;
		 
		 while(idade != -99){
			 System.out.println("Entre com a idade: ");
			 idade = scan.nextInt();
			 
			 if(idade < 21) {
			 
				 cont21++;
			 }
			
			 if(idade > 50)
			 {
				 cont50++;
			 }
		 }
		 System.out.println("\nPessoas com menos de 21 anos: " + cont21
				 + "\nPessoas com mais de 50 anos: " + cont50);
		 scan.close();
	}
}