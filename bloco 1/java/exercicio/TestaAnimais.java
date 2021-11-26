package br.com.generation.heranca.exercicio;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Preguica preguica1 = new Preguica();
		
		System.out.println("O nome do cachorro é: " + (cachorro1.getNome()));
		System.out.println("A idade do cachorro é: " + (cachorro1.getIdade()));
		System.out.println("O som que ele faz é: " + (cachorro1.getEmiteSom()));
		System.out.println("Capacidade de locomoção: " + (cachorro1.getCorre()));
		System.out.println("-------------------------------------------------------------------");
		System.out.println();
		
		System.out.println("O nome do cachorro é: " + (cavalo1.getNome()));
		System.out.println("A idade do cachorro é: " + (cavalo1.getIdade()));
		System.out.println("O som que ele faz é: " + (cavalo1.getEmiteSom()));
		System.out.println("Capacidade de locomoção: " + (cavalo1.getCorre()));
		System.out.println("-------------------------------------------------------------------");
		System.out.println();
		
		System.out.println("O nome do cachorro é: " + (preguica1.getNome()));
		System.out.println("A idade do cachorro é: " + (preguica1.getIdade()));
		System.out.println("O som que ele faz é: " + (preguica1.getEmiteSom()));
		System.out.println("Capacidade de locomoção: " + (preguica1.getSobeArvore()));
		System.out.println("-------------------------------------------------------------------");
		System.out.println();
		

	}

}
