package br.edu.patterns.domain.orcamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.edu.patterns.domain.orcamento.state.EmAprovacao;
import br.edu.patterns.domain.orcamento.state.EstadoDoOrcamento;

public class Orcamento {
	private double valor;
	private List<Item> itens;
	private EstadoDoOrcamento estadoDoOrcamento;

	public Orcamento(double valor) {
		this.setValor(valor);
		this.itens = new ArrayList<>();
		setEstadoDoOrcamento(new EmAprovacao());
	}

	public double getValor() {
		return valor;
	}

	public EstadoDoOrcamento getEstadoDoOrcamento() {
		return estadoDoOrcamento;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public boolean existe(String nomeDoItem) {
		for (Item item : this.getItens()) {
			if (item.getNome().equals(nomeDoItem))
				return true;
		}
		return false;
	}

	public void aplicaDescontoExtra() {
		getEstadoDoOrcamento().aplicaDescontoExtra(this);
	}

	public void aprova() {
		getEstadoDoOrcamento().aprova(this);
	}

	public void reprova() {
		getEstadoDoOrcamento().reprova(this);
	}

	public void finaliza() {
		getEstadoDoOrcamento().finaliza(this);
	}

	public void setEstadoDoOrcamento(EstadoDoOrcamento estadoDoOrcamento) {
		this.estadoDoOrcamento = estadoDoOrcamento;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}