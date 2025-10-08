package unidade03.exemplos.aula15.polimorfismo;

public class MainPolimorfismo {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();

		Programador p1 = new Programador();
		p1.setSalarioBase(7000.0);

		Programador p2 = new Programador();
		p2.setSalarioBase(3000.0);

		Vendedor v1 = new Vendedor();
		v1.setSalarioBase(5000);
		v1.setPercentualComissao(10.0);

		Funcionario f1 = new Vendedor();
		f1.setSalarioBase(3500);
//		f1.setPercentualComissao(5);
		if (f1 instanceof Gerente) {
			((Gerente) f1).setPercentualComissao(5);
		}



		empresa.incluirFuncionario(p1);
		empresa.incluirFuncionario(p2);
		empresa.incluirFuncionario(v1);
		empresa.incluirFuncionario(f1);

		System.out.println(empresa.calcularCustosSalarios());
	}
}
