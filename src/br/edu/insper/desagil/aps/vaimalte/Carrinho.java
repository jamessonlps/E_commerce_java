package br.edu.insper.desagil.aps.vaimalte;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private List<Pedido> pedidos;
	
	public Carrinho() {
		this.pedidos = new ArrayList<>();
	}

	public List<Pedido> getPedidos() {
		return this.pedidos;
	}
	
	public void verificaPedido(Produto produto) {
		List<Produto> produtosNaLista = new ArrayList<>();
		for (Pedido pedido: pedidos) {
			produtosNaLista.add(pedido.getProduto());
		}

		if (produtosNaLista.contains(produto)) {
			for (Pedido pedido: pedidos) {
				if (pedido.getProduto() == produto) {
					pedido.aumentaQuantidade();
				}
			}
		} 
		else {
			Pedido pedido = new Pedido(produto);
			this.pedidos.add(pedido);
		}
		
	}

}
