package br.edu.patterns.domain.orcamento.strategy;

import br.edu.patterns.domain.orcamento.Orcamento;

public class ISS extends Imposto {

	public ISS(Imposto imposto) {
		super(imposto);
	}

	public ISS() {
		super();
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculaOutroImposto(orcamento);
	}

}
