package br.edu.patterns.domain.orcamento.strategy;

import br.edu.patterns.domain.orcamento.Orcamento;

public class CalculadorDeImposto {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double valor = imposto.calcula(orcamento);
		System.out.println(valor);
	}
}
