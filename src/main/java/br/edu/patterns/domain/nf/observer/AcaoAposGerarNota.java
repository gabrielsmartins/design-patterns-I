package br.edu.patterns.domain.nf.observer;

import br.edu.patterns.domain.nf.NotaFiscal;

public interface AcaoAposGerarNota {
	void executa(NotaFiscal notaFiscal);
}
