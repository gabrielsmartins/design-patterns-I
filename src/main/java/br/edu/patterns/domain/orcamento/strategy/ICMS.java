package br.edu.patterns.domain.orcamento.strategy;

import br.edu.patterns.domain.orcamento.Orcamento;

public class ICMS extends Imposto {

	public ICMS(Imposto imposto) {
		super(imposto);
	}

	public ICMS() {
		super();
	}

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + 50 + calculaOutroImposto(orcamento);
	}

}
