package br.edu.insper.desagil.aps.vaimalte;

public class Pedido {
	
	private Produto produto;
	private int quantidade;
	
	public Pedido(Produto produto) {
		this.produto = produto;
		this.quantidade = 1;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public void aumentaQuantidade() {
		this.quantidade += 1;
	}
	
	public double valorTotal() {
		return this.produto.getPreco()*this.quantidade;
	}

}
