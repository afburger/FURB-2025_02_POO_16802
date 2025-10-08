package unidade03.exemplos.aula15.abstracao;

public class MainMeioLocomocao {

	public static void main(String[] args) {
		Barco barco = new Barco();
		Carro carro = new Carro();
		Aviao aviao = new Aviao();

		barco.imprimeFormaLocomocao();
		carro.imprimeFormaLocomocao();
		aviao.imprimeFormaLocomocao();
	}
}
