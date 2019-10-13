package br.edu.patterns.domain.investimento.strategy;

import br.edu.patterns.domain.conta.Conta;

public interface Investimento {
	double calcula(Conta conta);
}
