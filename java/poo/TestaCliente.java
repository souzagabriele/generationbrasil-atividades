package br.com.generation.poo;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cadastro1 = new Cliente();
		Cliente cadastro2 = new Cliente();
		Cliente cadastro3 = new Cliente();
		
		cadastro1.setNome("Gabriele"); 
		cadastro1.setIdade(20);
		cadastro1.setSalario(1000);
		
		cadastro2.setNome("Isabele"); 
		cadastro2.setIdade(22);
		cadastro2.setSalario(1100);
		
		cadastro3.setNome("Samuel"); 
		cadastro3.setIdade(23);
		cadastro3.setSalario(1200);

		
		/*System.out.println("Entre com o seu nome: ");
		cadastro.setNome(scan.next());

		System.out.println("Entre com sua idade: ");
		cadastro.setIdade(scan.nextInt());
		
		System.out.println("Entre com seu salário: ");
		cadastro.setSalario(scan.nextInt());*/
		
		
		System.out.println("Nome do cliente: " + cadastro1.getNome());
		System.out.println("Idade: " + cadastro1.getIdade());
		System.out.println("Salário declarado: " + cadastro1.getSalario());
		cadastro1.vista();
		
		System.out.println();
		
		System.out.println("Nome do cliente: " + cadastro2.getNome());
		System.out.println("Idade: " + cadastro2.getIdade());
		System.out.println("Salário declarado: " + cadastro2.getSalario());
		cadastro2.credito();
		
		System.out.println();
		
		System.out.println("Nome do cliente: " + cadastro3.getNome());
		System.out.println("Idade: " + cadastro3.getIdade());
		System.out.println("Salário declarado: " + cadastro3.getSalario());
		cadastro3.debito();
		
		System.out.println();
		

	}

}
