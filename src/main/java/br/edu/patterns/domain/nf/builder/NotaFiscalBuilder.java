package br.edu.patterns.domain.nf.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.edu.patterns.domain.nf.ItemNota;
import br.edu.patterns.domain.nf.NotaFiscal;
import br.edu.patterns.domain.nf.observer.AcaoAposGerarNota;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private LocalDate dataEmissao;
	private List<ItemNota> itens = new ArrayList<>();
	private List<AcaoAposGerarNota> acoes = new ArrayList<>();

	private String observacoes;
	private double valorBruto;
	private double impostos;

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder naDataAtual() {
		this.dataEmissao = LocalDate.now();
		return this;
	}

	public NotaFiscalBuilder comItem(ItemNota item) {
		this.itens.add(item);
		valorBruto = itens.stream().mapToDouble(i -> i.getValor()).sum();
		impostos = valorBruto * 0.05;
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFiscal build() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, impostos, itens, observacoes);
		this.acoes.forEach(a -> a.executa(nf));
		return nf;
	}

	public NotaFiscalBuilder adicionaAcao(AcaoAposGerarNota acao) {
		this.acoes.add(acao);
		return this;
	}

}
