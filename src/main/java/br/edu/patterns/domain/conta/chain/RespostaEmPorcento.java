package br.edu.patterns.domain.conta.chain;

import br.edu.patterns.domain.conta.Conta;

public class RespostaEmPorcento implements Resposta {
	private Resposta outraResposta;

	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		} else {
			outraResposta.responde(req, conta);
		}
	}

	public void setProxima(Resposta resposta) {
		this.outraResposta = resposta;
	}
}
