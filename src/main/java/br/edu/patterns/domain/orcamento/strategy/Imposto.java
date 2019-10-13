package br.edu.patterns.domain.orcamento.strategy;

import br.edu.patterns.domain.orcamento.Orcamento;

public abstract class Imposto {
	
	private final Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public Imposto() {
		outroImposto = null;
	}

	protected double calculaOutroImposto(Orcamento orcamento) {
		return (outroImposto == null ? 0 : outroImposto.caculaValor(orcamento));
	}

	public abstract double caculaValor(Orcamento orcamento);
}
