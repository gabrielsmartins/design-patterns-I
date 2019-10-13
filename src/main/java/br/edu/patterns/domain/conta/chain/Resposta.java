package br.edu.patterns.domain.conta.chain;

import br.edu.patterns.domain.conta.Conta;

public interface Resposta {
	void responde(Requisicao req, Conta conta);

	void setProxima(Resposta resposta);
}
