package br.com.generation.exinterface;

public class Cavalo extends Animal implements IAnimaisQueCorre{

	public Cavalo() {
		super();
		this.setNome("Callus");
		this.setIdade(2);
		this.setEmiteSom("iiirrrrí");

	}
	
	@Override
	public void Corre() {
		System.out.println("troc troc troc");
	}

}
