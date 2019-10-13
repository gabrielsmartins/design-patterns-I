package br.edu.patterns.domain.conta.template;

import java.util.List;

import br.edu.patterns.domain.conta.Conta;

public abstract class Relatorio {
	protected abstract void cabecalho();

	protected abstract void rodape();

	protected abstract void corpo(List<Conta> contas);

	public void imprime(List<Conta> contas) {
		cabecalho();
		corpo(contas);
		rodape();
	}
}