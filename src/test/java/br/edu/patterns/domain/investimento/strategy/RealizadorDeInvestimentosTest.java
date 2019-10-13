package br.edu.patterns.domain.investimento.strategy;


import br.edu.patterns.domain.conta.Conta;
import br.edu.patterns.domain.investimento.strategy.Arrojado;
import br.edu.patterns.domain.investimento.strategy.Conservador;
import br.edu.patterns.domain.investimento.strategy.Investimento;
import br.edu.patterns.domain.investimento.strategy.Moderado;
import br.edu.patterns.domain.investimento.strategy.RealizadorDeInvestimentos;

public class RealizadorDeInvestimentosTest {

	public static void main(String[] args) {
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
		
		Conta conta = new Conta();
		conta.deposita(1000);
		
		Investimento arrojado = new Arrojado();
		realizadorDeInvestimentos.realiza(conta, arrojado);
		

		Investimento conservador = new Conservador();
		realizadorDeInvestimentos.realiza(conta, conservador);
		
		
		Investimento moderado = new Moderado();
		realizadorDeInvestimentos.realiza(conta, moderado);
	}
}
