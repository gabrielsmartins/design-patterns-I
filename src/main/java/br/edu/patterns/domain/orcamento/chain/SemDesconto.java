package br.edu.patterns.domain.orcamento.chain;

import br.edu.patterns.domain.orcamento.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}
}
