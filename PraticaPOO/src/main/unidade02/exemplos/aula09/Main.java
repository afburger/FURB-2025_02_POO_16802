package unidade02.exemplos.aula09;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("André");
		pessoa.setCpf("0000000");

		ContaBancaria conta = new ContaBancaria(pessoa);
		conta.depositar(5000.00);
		conta.setConta(12345);
		conta.setAgencia("2869-X");

		System.out.println("Número da conta: " + conta.getConta());
		System.out.println("Saldo da conta:" + conta.getSaldo());
		System.out.println("Titular da conta:" + conta.getTitular().getNome());

		System.out.println("Pelo titular a agência da conta:" + pessoa.getConta().getAgencia());

	}
}
