package br.edu.patterns.domain.orcamento.state;

import br.edu.patterns.domain.orcamento.Orcamento;

public class Reprovado implements EstadoDoOrcamento {

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("J� estou reprovado!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento est� em estado de reprova��o, n�o pode aprovar agora!");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setEstadoDoOrcamento(new Finalizado());
	}

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
	}

}
