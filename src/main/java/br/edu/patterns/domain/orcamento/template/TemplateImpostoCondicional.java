package br.edu.patterns.domain.orcamento.template;

import br.edu.patterns.domain.orcamento.Orcamento;
import br.edu.patterns.domain.orcamento.strategy.Imposto;

public abstract class TemplateImpostoCondicional extends Imposto {
	
	public TemplateImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public TemplateImpostoCondicional() {
		
	}

	@Override
	public double caculaValor(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
          } else {
            return minimaTaxacao(orcamento);
          }
	}

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
	protected abstract double maximaTaxacao(Orcamento orcamento);
	protected abstract double minimaTaxacao(Orcamento orcamento);
}
