package br.edu.patterns.domain.orcamento.decorator;

import br.edu.patterns.domain.orcamento.Orcamento;
import br.edu.patterns.domain.orcamento.strategy.Imposto;
import br.edu.patterns.domain.orcamento.template.TemplateImpostoCondicional;

public class IKCV extends TemplateImpostoCondicional {

	public IKCV(Imposto outroImposto) {
		super(outroImposto);
	}

	public IKCV() {

	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		if (orcamento.getValor() > 500 && possuiItemComValorSuperiorA100Reais(orcamento))
			return true;
		return false;
	}

	private boolean possuiItemComValorSuperiorA100Reais(Orcamento orcamento) {
		return orcamento.getItens().stream().filter(i -> i.getValor() > 100).findFirst().isPresent();
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
