package unidade03.exemplos.aula15.abstracao;

public class MainFiguras {

	public static void main(String[] args) {
		// Figura figura = new Figura();


		Retangulo retangulo = new Retangulo();
		Triangulo triangulo = new Triangulo();

		retangulo.setCor("Amarelo");
		retangulo.setLado1(10);
		retangulo.setLado2(5);
		System.out.println("A área do retângulo é: " + retangulo.getArea());

		triangulo.desenhar();
	}
}
