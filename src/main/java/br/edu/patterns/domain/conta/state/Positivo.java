package br.edu.patterns.domain.conta.state;

import br.edu.patterns.domain.conta.Conta;

class Positivo implements EstadoDaConta {
	public void saca(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo() - valor);

		if (conta.getSaldo() < 0)
			conta.setEstado(new Negativo());
	}

	public void deposita(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo() + valor * 0.98);
	}

}