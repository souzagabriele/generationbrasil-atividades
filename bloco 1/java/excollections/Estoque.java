package br.com.generation.excollections;

import java.util.ArrayList;

public class Estoque {

	ArrayList<Produto> produtos = new ArrayList();
	
	
	public Produto SelecionaProduto(int indice) {
		return produtos.get(indice);
	}

	public void AdicionaProduto(Produto produto) {
		produtos.add(produto);
	}	

	public void MostraProdutos() {
		
		for (int i = 0; i < produtos.size() ;i++) {
			 Produto produto = produtos.get(i);	
			 
			 System.out.println(produto.GetNome());
		}
	}
	
}