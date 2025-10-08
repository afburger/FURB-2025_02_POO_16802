package unidade03.exemplos.aula15.abstracao;

public class Circulo extends Figura {

	private int raio;

	@Override
	public void desenhar() {

	}

	@Override
	public int getArea() {
		return raio * raio;
	}
}
