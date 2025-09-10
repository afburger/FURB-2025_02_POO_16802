package unidade02.exercicios.lista05;

/**
 * Representa um exercício de treino com nome, séries, repetições e carga.
 */
public class Exercicio {

	/** O nome do exercício (ex: Supino Reto). */
	private String nome;
	/** O número de séries a serem realizadas. */
	private int series;
	/** O número de repetições por série. */
	private int repeticoes;
	/** A carga ou peso a ser utilizado no exercício, em quilogramas. */
	private double carga;

	/**
	 * Cria um novo exercício com todos os seus atributos.
	 *
	 * @param nome O nome do exercício.
	 * @param series O número de séries.
	 * @param repeticoes O número de repetições.
	 * @param carga A carga a ser utilizada.
	 */
	public Exercicio(String nome, int series, int repeticoes, double carga) {
		this.nome = nome;
		this.series = series;
		this.repeticoes = repeticoes;
		this.carga = carga;
	}

	/**
	 * Obtém o nome do exercício.
	 *
	 * @return O nome do exercício.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Define o nome do exercício.
	 *
	 * @param nome O novo nome do exercício.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Obtém o número de séries.
	 *
	 * @return O número de séries.
	 */
	public int getSeries() {
		return series;
	}

	/**
	 * Define o número de séries.
	 *
	 * @param series O novo número de séries.
	 */
	public void setSeries(int series) {
		this.series = series;
	}

	/**
	 * Obtém o número de repetições.
	 *
	 * @return O número de repetições.
	 */
	public int getRepeticoes() {
		return repeticoes;
	}

	/**
	 * Define o número de repetições.
	 *
	 * @param repeticoes O novo número de repetições.
	 */
	public void setRepeticoes(int repeticoes) {
		this.repeticoes = repeticoes;
	}

	/**
	 * Obtém a carga do exercício.
	 *
	 * @return A carga em quilogramas.
	 */
	public double getCarga() {
		return carga;
	}

	/**
	 * Define a carga do exercício.
	 *
	 * @param carga A nova carga em quilogramas.
	 */
	public void setCarga(double carga) {
		this.carga = carga;
	}

	/**
	 * Gera uma string com o resumo do exercício.
	 *
	 * @return Uma string formatada com os dados do exercício.
	 */
	public String getResumo() {
		return String.format("%s: %d séries de %d repetições com %.1f kg.", 
				nome, series, repeticoes, carga);
	}
}
