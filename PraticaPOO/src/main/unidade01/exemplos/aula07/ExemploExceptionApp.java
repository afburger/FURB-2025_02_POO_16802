package unidade01.exemplos.aula07;

import java.util.Scanner;

public class ExemploExceptionApp {

	public static void main(String[] args) {
		ExeploExceptionFuncionario[] funcionarios = new ExeploExceptionFuncionario[5];

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < funcionarios.length; i++) {

			ExeploExceptionFuncionario funcionarioAdd = new ExeploExceptionFuncionario();

			System.out.println("Informe o nome do funcionário " + i);
			funcionarioAdd.setNome(teclado.next());

			System.out.println("Informe o salário do funcionário " + i);
			funcionarioAdd.setSalario(teclado.nextDouble());

			funcionarios[i] = funcionarioAdd;

		}

		teclado.close();

		for (int i = 0; i < funcionarios.length; i++) {
			ExeploExceptionFuncionario func = funcionarios[i];
			System.out.println("Nome: " + func.getNome() + " "
					+ " salário: " + func.getSalario() + " "
					+ "imposto: " + func.calcularIrpf());
		}
	}
}
