package br.edu.patterns.domain.conta.state;

import br.edu.patterns.domain.conta.Conta;

public class Negativo implements EstadoDaConta {

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Sua conta está no vermelho. Não é possível sacar!");
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo() + valor * 0.95);
		if (conta.getSaldo() > 0)
			conta.setEstado(new Positivo());
	}

}
