package unidade01.exercicios.lista03.questao01;

public class Funcionario {

	private static double faixa1 = 1903.98;
	private static double faixa2 = 2826.65;
	private static double faixa3 = 3751.05;
	private static double faixa4 = 4664.68;

	private static double percentualFaixa2 = 7.5;
	private static double percentualFaixa3 = 15.0;
	private static double percentualFaixa4 = 22.5;
	private static double percentualFaixa5 = 27.5;

	private static double cemPorcento = 100.0;

	private String nome;
	private double salario;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public double calcularIrpf() {
		double imposto = 0;
		double diferenca = 0;

		if (salario > faixa1) {
			// Faixa 2
			if (salario <= faixa2) {
				diferenca = salario - faixa1;
				imposto = diferenca * (percentualFaixa2 / cemPorcento);
			} else if (salario <= faixa3) { // Faixa 3
				// Calcular da faixa 2
				diferenca = faixa2 - faixa1;
				imposto = diferenca * (percentualFaixa2 / cemPorcento);

				// Calcular da faixa 3
				diferenca = salario - faixa2;
				imposto += diferenca * (percentualFaixa3 / cemPorcento);
			} else if (salario <= 4664.68) {
				// Calcular da faixa 2
				diferenca = 2826.65 - 1903.98;
				imposto = diferenca * (7.5 / 100);

				// Calcular da faixa 3
				diferenca = 3751.05 - 2826.65;
				imposto += diferenca * (15.0 / 100);

				// Calcular da faixa 4
				diferenca = salario - 3751.05;
				imposto += diferenca * (22.5 / 100);
			} else {
				// Calcular da faixa 2
				diferenca = 2826.65 - 1903.98;
				imposto = diferenca * (7.5 / 100);

				// Calcular da faixa 3
				diferenca = 3751.05 - 2826.65;
				imposto += diferenca * (15.0 / 100);

				// Calcular da faixa 4
				diferenca = 4664.68 - 3751.05;
				imposto += diferenca * (22.5 / 100);

				diferenca = salario - 4664.68;
				imposto += diferenca * (27.5 / 100);
			}
		}
		return imposto;
	}
}
