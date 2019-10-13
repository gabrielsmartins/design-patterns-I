package br.edu.patterns.domain.nf.builder;

import br.edu.patterns.domain.nf.ItemNota;

public class ItemDaNotaBuilder {
	private String descricao;
	private double valor;

	public ItemDaNotaBuilder comDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public ItemDaNotaBuilder comValor(double valor) {
		this.valor = valor;
		return this;
	}

	public ItemNota constroi() {
		return new ItemNota(descricao, valor);
	}
}
