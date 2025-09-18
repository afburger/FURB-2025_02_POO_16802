package provas.prova01;

public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	private Empresa empresa;

	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		if (cpf == null || cpf.isBlank()) {
			throw new IllegalArgumentException("CPF é obrigatório");
		}
		this.cpf = cpf;
		if (salario < 0) {
			throw new IllegalArgumentException("Salário inválido");
		}
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void aplicaAumento(double percentual) {
		double aumento = salario * (percentual/100);
		salario = salario + aumento;
	}

	public String exibirDados() {
		return "Nome: " + nome + " CPF: " + cpf + " Salário: " + salario;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
}
