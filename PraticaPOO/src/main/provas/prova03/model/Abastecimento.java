package provas.prova03.model;

import java.io.Serializable;

/**
 * Classe que representa o abastecimento conforme o diagrama
 * @author André Felipe Bürger (andre.burger@publicatecnologia.com.br)
 *
 */
public class Abastecimento implements Serializable {

	private double km;
	private double litros;
	private double precoLitro;

	public Abastecimento(double km, double litros, double precoLitro) {
		this.km = km;
		this.litros = litros;
		this.precoLitro = precoLitro;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public double getPrecoLitro() {
		return precoLitro;
	}

	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
}
