package br.edu.patterns.domain.nf.observer;


import java.util.ArrayList;
import java.util.List;

import br.edu.patterns.domain.nf.ItemNota;
import br.edu.patterns.domain.nf.NotaFiscal;
import br.edu.patterns.domain.nf.builder.NotaFiscalBuilder;
import br.edu.patterns.domain.nf.observer.AcaoAposGerarNota;
import br.edu.patterns.domain.nf.observer.EnviadorDeEmail;
import br.edu.patterns.domain.nf.observer.EnviadorDeSms;
import br.edu.patterns.domain.nf.observer.Impressora;
import br.edu.patterns.domain.nf.observer.NotaFiscalDao;

public class TestaAcao {
	
	public static void main(String[] args) {
	
		NotaFiscalBuilder builder = new NotaFiscalBuilder();

		NotaFiscal notaFiscal = builder
				                .paraEmpresa("Caelum")
				                .comCnpj("123.456.789/0001-10")
								.comItem(new ItemNota("item 1", 100.0)).comItem(new ItemNota("item 2", 200.0))
								.comItem(new ItemNota("item 3", 300.0)).comObservacoes("entregar notaFiscal pessoalmente")
								.adicionaAcao(new EnviadorDeEmail())
								.adicionaAcao(new NotaFiscalDao())
								.adicionaAcao(new EnviadorDeSms())
								.adicionaAcao(new Impressora())
								.adicionaAcao(new Multiplicador(4))
								.build();
		
		
	}

}
