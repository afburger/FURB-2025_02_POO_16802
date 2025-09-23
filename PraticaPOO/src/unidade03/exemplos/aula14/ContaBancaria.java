package unidade03.exemplos.aula14;

public class ContaBancaria {

	private int numero;
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void depositar(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor não pode ser negativo");
		}
		this.saldo += valor;
	}

	public void sacar(double valor) {
		if (valor > saldo) {
			throw new IllegalArgumentException("Saldo insuficiente!");
		}
		saldo -= valor;
	}

	@Override
	public String toString() {
		return "Conta número: " + numero + " tem um saldo de: R$ " + getSaldo();
	}

	@Override
	public boolean equals(Object obj) {
		ContaBancaria outro = (ContaBancaria) obj;
		return this.numero == outro.getNumero();
	}
}
