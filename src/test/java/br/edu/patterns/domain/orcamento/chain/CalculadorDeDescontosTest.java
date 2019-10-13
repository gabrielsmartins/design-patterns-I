package br.edu.patterns.domain.orcamento.chain;


import org.junit.Test;

import br.edu.patterns.domain.orcamento.Item;
import br.edu.patterns.domain.orcamento.Orcamento;

public class CalculadorDeDescontosTest {
	

	@Test
	public void deveCalcularDescontos() {
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();

		Orcamento orcamento = new Orcamento(100.0);
		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));

		double desconto = calculador.calcula(orcamento);

		System.out.println(desconto);
	}
}
