package br.edu.patterns.domain.nf.observer;

import br.edu.patterns.domain.nf.NotaFiscal;

public class Impressora implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Imprimindo NF");
	}

}
