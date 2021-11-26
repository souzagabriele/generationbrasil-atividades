package br.com.generation.exinterface;

public class Cachorro extends Animal implements IAnimaisQueCorre {
	
	public Cachorro() {
		super();
		this.setNome("Dengoso");
		this.setIdade(5);
		this.setEmiteSom("Au au");
	}
	
	@Override
	public void Corre() {
		// TODO Auto-generated method stub
		System.out.println("plec plec plec");
		
	}

}
