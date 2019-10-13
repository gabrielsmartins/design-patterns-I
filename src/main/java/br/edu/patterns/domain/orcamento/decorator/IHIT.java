package br.edu.patterns.domain.orcamento.decorator;

import java.util.ArrayList;
import java.util.List;

import br.edu.patterns.domain.orcamento.Item;
import br.edu.patterns.domain.orcamento.Orcamento;
import br.edu.patterns.domain.orcamento.template.TemplateImpostoCondicional;

public class IHIT extends TemplateImpostoCondicional {

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		List<String> noOrcamento = new ArrayList<String>();

        for(Item item : orcamento.getItens()) {
          if(noOrcamento.contains(item.getNome())) return true;
          else noOrcamento.add(item.getNome());
        }

        return false;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.01;
	}

}
