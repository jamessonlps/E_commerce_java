package br.edu.insper.desagil.aps.vaimalte;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
		
	private Map<Integer, Integer> descontos;

	public Caixa() {
		this.descontos = new HashMap<>();
	}
	
	public void incluiDesconto(Produto produto, int desconto) {
		if ((desconto >= 1) && (desconto <= 99)) {
			this.descontos.put(produto.getCodigo(), desconto);
		}
	}
	
	public double pedidoTotal(Carrinho carrinho) {
		double total = 0;
		for (Pedido pedido : carrinho.getPedidos()) {
			int codigo = pedido.getProduto().getCodigo();
			if (descontos.containsKey(codigo)) {
				double desconto = descontos.get(codigo);
				total += pedido.valorTotal()*(1 - desconto/100);
			}
			else {
				total += pedido.valorTotal();
			}
		}
		return total;
	}
	
}