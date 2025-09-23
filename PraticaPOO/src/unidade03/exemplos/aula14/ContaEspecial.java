package unidade03.exemplos.aula14;

public class ContaEspecial extends ContaBancaria {

	private double limiteCredito;

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	@Override
	public void sacar(double valor) {
		if (valor > getSaldo() + getLimiteCredito()) {
			throw new IllegalArgumentException("Saldo + limite insuficiente!");
		}
		setSaldo(getSaldo() - valor);
	}
}
