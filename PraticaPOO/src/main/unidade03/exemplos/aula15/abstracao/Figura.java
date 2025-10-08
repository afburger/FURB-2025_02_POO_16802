package unidade03.exemplos.aula15.abstracao;

public abstract class Figura {

	private String cor;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public abstract void desenhar();

	public abstract int getArea();


}
