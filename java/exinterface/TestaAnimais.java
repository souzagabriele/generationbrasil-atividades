package br.com.generation.exinterface;

public class TestaAnimais {
	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Preguica preguica1 = new Preguica();
		
		System.out.println("O nome do cachorro é: " + (cachorro1.getNome()));
		System.out.println("A idade do cachorro é: " + (cachorro1.getIdade()));
		System.out.println("O som que ele faz é: " + (cachorro1.getEmiteSom()));
		System.out.println("Som do cachorro ao correr: ");
		cachorro1.Corre();
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println();
		
		System.out.println("O nome do cavalo é: " + (cavalo1.getNome()));
		System.out.println("A idade do cavalo é: " + (cavalo1.getIdade()));
		System.out.println("O som que ele faz é: " + (cavalo1.getEmiteSom()));
		System.out.println("Som do cavalo ao correr: ");
		cavalo1.Corre();
		System.out.println("-------------------------------------------------------------------");
		System.out.println();
		
		
		System.out.println("O nome da preguiça é: " + (preguica1.getNome()));
		System.out.println("A idade do preguiça é: " + (preguica1.getIdade()));
		System.out.println("O som que ele faz é: " + (preguica1.getEmiteSom()));
		System.out.println("Som da preguiça ao subir a árvore: ");
		preguica1.SobeArvore();
		System.out.println("-------------------------------------------------------------------");
		System.out.println();
	

	}
}
