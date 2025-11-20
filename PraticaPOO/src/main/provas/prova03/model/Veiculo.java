package provas.prova03.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa o veículo conforme o diagrama
 * @author André Felipe Bürger (andre.burger@publicatecnologia.com.br)
 *
 */
public class Veiculo implements Serializable {

	private String placa;
	private String modelo;
	private String marca;
	private int ano;
	private List<Abastecimento> abastecimentos;

	public Veiculo(String placa, String modelo, String marca, int ano) {
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.abastecimentos = new ArrayList<>();
	}

	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public int getAno() {
		return ano;
	}

	/**
	 * Adiciona um abastecimento ao veículo
	 * @param abast
	 */
	public void adicionarAbastecimento(Abastecimento abast) {
		this.abastecimentos.add(abast);
	}

	/**
	 * Retorna a lista de abastecimentos.
	 * @return
	 */
	public List<Abastecimento> getAbastecimentos() {
		return abastecimentos;
	}

	/**
	 * Calcula a última média de abastecimento seguindo a fórmula:
	 * média = (kmAtual – kmAnterior) / litrosDaÚltimaAbastecida
	 * E lança uma exceção caso não seja possível calcular a média
	 */
	public double getUltimaMedia() throws IllegalArgumentException {
		if (getAbastecimentos().size() < 2) {
			throw new IllegalArgumentException("Não é possível calcular a média, pois não há referência anterior.");
		}
		Abastecimento ultimoAbastecimento = abastecimentos.get(getAbastecimentos().size() - 1);
		Abastecimento penultimoAbastecimento = abastecimentos.get(getAbastecimentos().size() - 2);
		double media = (ultimoAbastecimento.getKm() - penultimoAbastecimento.getKm()) / ultimoAbastecimento.getLitros();
		return media;
	}
}
