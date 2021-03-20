package br.edu.insper.desagil.aps.vaimalte;

public class Testador {
	
	public boolean testeA() {
		Carrinho carrinho = new Carrinho();
		
		Caixa caixa = new Caixa();
		
		if (caixa.pedidoTotal(carrinho) == 0) {
			return true;
		}
				
	    return false;
	}

	public boolean testeB() {
		Carrinho carrinho = new Carrinho();
		
		Produto guaranaJesus = new Produto(13, "Guarana Jesus", 5);
		carrinho.verificaPedido(guaranaJesus);
		
		Caixa caixa = new Caixa();
		
		if (caixa.pedidoTotal(carrinho) == 5) {
			return true;
		}
		
	    return false;
	}

	public boolean testeC() {
		Carrinho carrinho = new Carrinho();
		
		Produto guaranaJesus = new Produto(13, "Guarana Jesus", 5);
		carrinho.verificaPedido(guaranaJesus);
		
		Caixa caixa = new Caixa();
		caixa.incluiDesconto(guaranaJesus, 13);
		
		if (caixa.pedidoTotal(carrinho) == 4.35) {
			return true;
		}
		
	    return false;
	}

	public boolean testeD() {
		Carrinho carrinho = new Carrinho();
		
		Produto guaranaJesus = new Produto(13, "Guarana Jesus", 5);
		Produto cuscuz = new Produto(06, "Cuscuz", 1.69);
		
		carrinho.verificaPedido(guaranaJesus);
		carrinho.verificaPedido(guaranaJesus);
		carrinho.verificaPedido(cuscuz);
		
		Caixa caixa = new Caixa();
		caixa.incluiDesconto(cuscuz, 13);
		
		if (caixa.pedidoTotal(carrinho) == 2*5 + 1.69*(1-0.13)) {
			return true;
		}
			    
	    return false;
	}

	public boolean testeE() {
	    return false;
	}

}
