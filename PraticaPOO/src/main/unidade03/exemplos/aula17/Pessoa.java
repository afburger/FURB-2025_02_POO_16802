package unidade03.exemplos.aula17;

public class Pessoa implements Relatorio {

	private String cpf;
	private String nome;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void imprimirDados() {
		System.out.println(getCpf() + " - " + getNome());
	}
}
