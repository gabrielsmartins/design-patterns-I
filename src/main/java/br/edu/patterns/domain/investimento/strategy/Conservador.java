package br.edu.patterns.domain.investimento.strategy;

import br.edu.patterns.domain.conta.Conta;

public class Conservador implements Investimento{

	@Override
	public double calcula(Conta conta) {
		return conta.getSaldo() * 0.008;
	}

}
