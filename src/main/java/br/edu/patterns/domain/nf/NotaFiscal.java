package br.edu.patterns.domain.nf;

import java.time.LocalDate;
import java.util.List;

public class NotaFiscal {
	
	private String razaoSocial;
	private String cnpj;
	private LocalDate dataEmissao;
	private Double valorBruto;
	private List<ItemNota> itens;
	private String observacoes;
	private Double impostos;
	
	
	public NotaFiscal(String razaoSocial, String cnpj, LocalDate dataEmissao, Double valorBruto,Double impostos, List<ItemNota> itens, String observacoes) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataEmissao = dataEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.observacoes = observacoes;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public LocalDate getDataEmissao() {
		return dataEmissao;
	}


	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}


	public Double getValorBruto() {
		return valorBruto;
	}


	public void setValorBruto(Double valorBruto) {
		this.valorBruto = valorBruto;
	}
	
	


	public Double getImpostos() {
		return impostos;
	}


	public void setImpostos(Double impostos) {
		this.impostos = impostos;
	}


	public List<ItemNota> getItens() {
		return itens;
	}


	public void setItens(List<ItemNota> itens) {
		this.itens = itens;
	}


	public String getObservacoes() {
		return observacoes;
	}


	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}


	@Override
	public String toString() {
		return "NotaFiscal [razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", dataEmissao=" + dataEmissao
				+ ", valorBruto=" + valorBruto + ", itens=" + itens + ", observacoes=" + observacoes + ", impostos="
				+ impostos + "]";
	}
	
	
	
	

}
