package br.edu.patterns.domain.nf;

public class ItemNota {

	private String nome;
	private Double valor;
	
	public ItemNota(String nome, Double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "ItemNota [nome=" + nome + ", valor=" + valor + "]";
	}

	
	
}
