package br.edu.patterns.domain.conta.state;

import br.edu.patterns.domain.conta.Conta;

public interface EstadoDaConta {
	void saca(Conta conta, double valor);

	void deposita(Conta conta, double valor);
}
