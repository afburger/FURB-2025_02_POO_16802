package unidade01.exercicios.lista03.questao01;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		FuncionarioDois[] funcionarios = new FuncionarioDois[1];

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < funcionarios.length; i++) {

			FuncionarioDois funcionarioAdd = new FuncionarioDois();

			System.out.println("Informe o nome do funcionário " + i);
			funcionarioAdd.setNome(teclado.next());

			System.out.println("Informe o salário do funcionário " + i);
			funcionarioAdd.setSalario(teclado.nextDouble());

			funcionarios[i] = funcionarioAdd;

		}

		teclado.close();

		for (int i = 0; i < funcionarios.length; i++) {
			FuncionarioDois func = funcionarios[i];
			System.out.println("Nome: " + func.getNome() + " "
					+ " salário: " + func.getSalario() + " "
					+ "imposto: " + func.calcularIrpf());
		}
	}
}
