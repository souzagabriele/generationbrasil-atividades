package br.com.generation.excollections;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteCollection {
	
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		Estoque estoque = new Estoque();
		
		for (int i = 0; i < 5; i++ ) {
			
			System.out.println("\nQual produto você deseja inserir: ");
			String nome = scan.next();
			
			System.out.println("Digite o valor: ");
			int valor = scan.nextInt();
			
			estoque.AdicionaProduto(new Produto(nome,valor));
			
		}
		
		estoque.MostraProdutos();
	}
		
}
