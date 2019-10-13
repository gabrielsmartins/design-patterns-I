package br.edu.patterns.domain.orcamento.decorator;

import br.edu.patterns.domain.orcamento.Orcamento;
import br.edu.patterns.domain.orcamento.strategy.Imposto;

public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto(Imposto imposto) {
		super(imposto);
	}

	public ImpostoMuitoAlto() {
		super();
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculaOutroImposto(orcamento);
	}

}
