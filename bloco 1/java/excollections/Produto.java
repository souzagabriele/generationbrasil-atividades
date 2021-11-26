package br.com.generation.excollections;

public class Produto {

	private String nome;
	private int preco;
	

	public Produto(String nome, int preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	public int GetPreco() {
		return preco;
	}
	
	public String GetNome() {
		return nome;
	}
	
}
