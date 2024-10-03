package br.edu.fatecpg.pagamento.view;

import br.edu.fatecpg.pagamento.model.PagamentoBoleto;
import br.edu.fatecpg.pagamento.model.PagamentoCartao;

public class Main {

	public static void main(String[] args) {
		PagamentoBoleto bol = new PagamentoBoleto();
		PagamentoCartao cart = new PagamentoCartao();
		
		bol.processarPagamento();
		System.out.println("/n");
		cart.processarPagamento();

	}

}
