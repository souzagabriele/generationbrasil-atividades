package br.com.generation.poo;

public class Cliente {
	
	private String nome;
	private int idade;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	void vista() {
		System.out.println("Cliente efetuou pagamento à vista. ");
	}
	
	void credito() {
		System.out.println("Cliente efetuou pagamento no crédito. ");
	}

	void debito() {
	System.out.println("Cliente efetuou pagamento no débito. ");
}
 }
