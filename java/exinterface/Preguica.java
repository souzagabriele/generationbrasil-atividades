package br.com.generation.exinterface;

public class Preguica extends Animal implements IAnimalQueSobeArvore {

	public Preguica() {
		super();
		this.setNome("Sandy");
		this.setIdade(7);
		this.setEmiteSom("...");
	}
	
	@Override
	public void SobeArvore() {
		System.out.println("pec pec");
		
	}
	
}
