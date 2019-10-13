package br.edu.patterns.domain.orcamento.decorator;

import br.edu.patterns.domain.orcamento.Orcamento;
import br.edu.patterns.domain.orcamento.strategy.Imposto;
import br.edu.patterns.domain.orcamento.template.TemplateImpostoCondicional;

public class ICPP extends TemplateImpostoCondicional{
	
    public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}
    
    public ICPP() {
	
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		if(orcamento.getValor() > 500)
			return true;
		return false;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

}
