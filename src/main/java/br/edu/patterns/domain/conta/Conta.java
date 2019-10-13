package br.edu.patterns.domain.conta;

import java.util.Calendar;

import br.edu.patterns.domain.conta.state.EstadoDaConta;

public class Conta {
	private String titular;
	private double saldo;
	private int numero;
	private int agencia;
	private Calendar dataAbertura;
	private EstadoDaConta estado;

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.setSaldo(saldo);
		dataAbertura = Calendar.getInstance();
	}

	public Conta() {
		dataAbertura = Calendar.getInstance();
	}

	public void deposita(double valor) {
		getEstado().deposita(this, valor);
	}

	public void saca(double valor) {
		getEstado().saca(this, valor);
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public EstadoDaConta getEstado() {
		return estado;
	}

	public void setEstado(EstadoDaConta estado) {
		this.estado = estado;
	}

}
