package br.com.generation.poo;

public class TestaContaBancaria {

	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria();
		ContaBancaria conta2 = new ContaBancaria();
		ContaBancaria conta3 = new ContaBancaria();

		conta1.setNumeroDaConta(1201);
		conta1.setUsuario("Gabriele");
		conta1.setAgencia(2001);

		conta2.setNumeroDaConta(2008);
		conta2.setUsuario("Isabele");
		conta2.setAgencia(1999);

		conta3.setNumeroDaConta(1505);
		conta3.setUsuario("Samuel");
		conta3.setAgencia(1998);

		System.out.println("Número da conta: " + conta1.getNumeroDaConta());
		System.out.println("Nome: " + conta1.getUsuario());
		System.out.println("Agência: " + conta1.getAgencia());
		conta1.corrente();
		System.out.println();

		System.out.println("Número da conta: " + conta2.getNumeroDaConta());
		System.out.println("Nome: " + conta2.getUsuario());
		System.out.println("Agência: " + conta2.getAgencia());
		conta2.poupanca();
		System.out.println();

		System.out.println("Número da conta: " + conta3.getNumeroDaConta());
		System.out.println("Nome: " + conta3.getUsuario());
		System.out.println("Agência: " + conta3.getAgencia());
		conta3.salario();
		System.out.println();
	}

}
