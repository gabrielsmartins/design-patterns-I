package br.edu.patterns.domain.orcamento.chain;

import br.edu.patterns.domain.orcamento.Orcamento;

public interface Desconto {
	double desconta(Orcamento orcamento);
}
