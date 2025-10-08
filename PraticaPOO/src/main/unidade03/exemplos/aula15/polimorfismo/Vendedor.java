package unidade03.exemplos.aula15.polimorfismo;

public class Vendedor extends Funcionario {

	private double percentualComissao;

	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

	@Override
	public double calcularSalario() {
		if (percentualComissao != 0.0) {
			return super.calcularSalario() + (super.calcularSalario() * (percentualComissao/100));
		}
		return  super.calcularSalario();
	}
}
