package br.edu.patterns.domain.orcamento.state;

import br.edu.patterns.domain.orcamento.Orcamento;

public interface EstadoDoOrcamento {

	public void reprova(Orcamento orcamento);
	public void aprova(Orcamento orcamento);
	public void finaliza(Orcamento orcamento);
	public void aplicaDescontoExtra(Orcamento orcamento);
}
