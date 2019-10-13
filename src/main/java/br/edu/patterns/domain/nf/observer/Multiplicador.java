package br.edu.patterns.domain.nf.observer;

import br.edu.patterns.domain.nf.NotaFiscal;

public class Multiplicador implements AcaoAposGerarNota {
	private double fator;

	public Multiplicador(double fator) {
		this.fator = fator;
	}

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println(notaFiscal.getValorBruto() * fator);
	}

}
