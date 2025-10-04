package provas.prova01;

import java.util.ArrayList;

public class Empresa {

	private String nome;
	private String cnpj;
	private Endereco endereco;
	private ArrayList<Funcionario> funcionarios;

	public Empresa(String nome, String cnpj) {
		this.nome = nome;
		if (cnpj == null || cnpj.isBlank()) {
			throw new IllegalArgumentException("CNPJ é obrigatório");
		}
		this.cnpj = cnpj;
		funcionarios = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public double calcularFolhaSalarial() {
		double totalSalario = 0;
		for (Funcionario f : funcionarios) {
			totalSalario = totalSalario + f.getSalario();
		}
		return totalSalario;
	}

	public void aplicarAumento(double percentual) {
		for (Funcionario f : funcionarios) {
			f.aplicaAumento(percentual);
		}
	}

	public void adicionarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
		funcionario.setEmpresa(this);
	}

	public void removerFuncionario(Funcionario funcionario) {
		funcionarios.remove(funcionario);
	}

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public Funcionario pesquisarFuncionario(String cpf) {
		if (cpf != null && !cpf.isBlank()) {
			for (Funcionario emp : funcionarios) {
				if (cpf.equals(emp.getCpf())) {
					return emp;
				}
			}
		}
		return null;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public String exibirDados() {
		StringBuilder sb = new StringBuilder();
		sb.append("Empresa: ").append(nome).append("\n");
		sb.append("CNPJ: ").append(cnpj).append("\n");
		sb.append("Endereço: ").append(endereco.exibirDados()).append("\n");
		sb.append("Dados dos funcionários").append("\n");

		for (Funcionario f : funcionarios) {
			sb.append(f.exibirDados()).append("\n");
		}

		sb.append("########################").append("\n");

		return sb.toString();
	}
}

