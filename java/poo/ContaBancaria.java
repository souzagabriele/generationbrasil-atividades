package br.com.generation.poo;

public class ContaBancaria {
	
	private int numeroDaConta;
	private String usuario;
	private int agencia;
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public double getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	void corrente() {
		System.out.println("Cliente utiliza Conta Corrente. ");
	}
	
	void poupanca() {
		System.out.println("Cliente utiliza Conta Poupança. ");
	}

	void salario() {
	System.out.println("Cliente utiliza Conta Salário. ");
}

}
