package provas.prova01;

public class Main {

	public static void main(String[] args) {
		Sistema sistema = new Sistema();

		try {
			Empresa emp1 = new Empresa("Furb", "123456789");
			Endereco end1 = new Endereco();
			end1.setCidade("Blumenau");
			end1.setRua("Antônio da Veiga");
			end1.setNumero(140);

			emp1.setEndereco(end1);

			Empresa emp2 = new Empresa("Pública", "987654321");
			Endereco end2 = new Endereco();
			end2.setRua("Içara");
			end2.setNumero(151);
			end2.setCidade("Blumenau");

			emp2.setEndereco(end2);

			sistema.adicionarEmpresa(emp1);
			sistema.adicionarEmpresa(emp2);

			emp1.adicionarFuncionario(new Funcionario("André", "123456", 2000));
			emp1.adicionarFuncionario(new Funcionario("Felipe", "4567", 5000));
			emp1.adicionarFuncionario(new Funcionario("Luiz", "999999", 12000));

			emp2.adicionarFuncionario(new Funcionario("André", "123456", 2000));
			emp2.adicionarFuncionario(new Funcionario("Felipe", "45788", 7000));
			emp2.adicionarFuncionario(new Funcionario("João", "11111", 15000));

			sistema.gerarRelatorioCompleto();

			emp1.aplicarAumento(10);

			sistema.gerarRelatorioCompleto();

			Funcionario funcionarioEncontrado = emp2.pesquisarFuncionario("123456");
			if (funcionarioEncontrado != null) {
				emp2.removerFuncionario(funcionarioEncontrado);
			}

			sistema.gerarRelatorioCompleto();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}
}
