package unidade03.exemplos.aula15.abstracao;

public class Triangulo extends Figura {

	private int lado1;
	private int lado2;
	private int lado3;

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}

	public int getLado3() {
		return lado3;
	}

	@Override
	public void desenhar() {
		System.out.println("Desenha um triângulo.");
	}

	@Override
	public int getArea() {
		return lado1 * lado2 * lado3;
	}
}
