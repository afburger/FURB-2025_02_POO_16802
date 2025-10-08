package unidade03.exemplos.aula15.polimorfismo;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Funcionario> funcionarios = new ArrayList<>();

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void incluirFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}

	public void removerFuncionario(Funcionario funcionario) {
		this.funcionarios.remove(funcionario);
	}

	public double calcularCustosSalarios() {
		double total = 0.0;
		for (Funcionario f : funcionarios) {
			total += f.calcularSalario();
		}
		return total;
	}
}
