package unidade02.exemplos.aula09;

public class ContaBancaria {

	private int conta;
	private String agencia;
	private double saldo;
	private Pessoa titular;

	public ContaBancaria (Pessoa titular) {
		this.titular = titular;
		titular.setConta(this);
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public Pessoa getTitular() {
		return titular;
	}
}
