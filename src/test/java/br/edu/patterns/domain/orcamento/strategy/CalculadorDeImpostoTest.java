package br.edu.patterns.domain.orcamento.strategy;

import org.junit.Test;

import br.edu.patterns.domain.orcamento.Orcamento;

public class CalculadorDeImpostoTest {

	@Test
	public void deveCalcularImpostos() {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();

		Orcamento orcamento = new Orcamento(500.0);

		CalculadorDeImposto calculador = new CalculadorDeImposto();
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
	}
}
