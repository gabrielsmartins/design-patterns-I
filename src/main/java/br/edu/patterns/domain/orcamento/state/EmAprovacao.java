package br.edu.patterns.domain.orcamento.state;

import br.edu.patterns.domain.orcamento.Orcamento;

public class EmAprovacao implements EstadoDoOrcamento {
	private boolean descontoAplicado = false;

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.setEstadoDoOrcamento(new Reprovado());
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.setEstadoDoOrcamento(new Aprovado());
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento em aprova��o n�o podem ir para finalizado diretamente");
	}

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (!descontoAplicado) {
			orcamento.setValor(orcamento.getValor() - orcamento.getValor() * 0.05);
			descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto j� aplicado!");
		}
	}

}
