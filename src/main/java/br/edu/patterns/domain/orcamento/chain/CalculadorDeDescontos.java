package br.edu.patterns.domain.orcamento.chain;

import br.edu.patterns.domain.orcamento.Orcamento;

public class CalculadorDeDescontos {
	public double calcula(Orcamento orcamento) {
		Desconto desconto = new DescontoPorMaisDeCincoItens(
								new DescontoPorMaisDeQuinhentosReais(
										new DescontoPorVendaCasada(
												new SemDesconto())));
		return desconto.desconta(orcamento);
	}
}
