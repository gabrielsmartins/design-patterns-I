package br.edu.patterns.domain.conta.chain;

import java.util.ArrayList;
import java.util.List;

import br.edu.patterns.domain.conta.Conta;

public abstract class Filtro {
	protected Filtro outroFiltro;

	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}

	public Filtro() {
	}

	public abstract List<Conta> filtra(List<Conta> contas);

	protected List<Conta> proximo(List<Conta> contas) {
		if (outroFiltro != null)
			return outroFiltro.filtra(contas);
		else
			return new ArrayList<Conta>();
	}

}
