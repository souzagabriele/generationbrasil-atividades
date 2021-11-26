package br.com.generation.condicional.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int idade;
		
		System.out.println("Entre com a idade para saber sua categoria: ");
		idade = scan.nextInt();
		
		if (idade >= 10 && idade <= 14) {
		System.out.println("Categoria Infantil ");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.println("Categoria Juvenil");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Categoria Adulto");
		}
		else {
			System.out.println("Não encaixa em nenhuma categoria.");
			}
		scan.close();
		}

	}
