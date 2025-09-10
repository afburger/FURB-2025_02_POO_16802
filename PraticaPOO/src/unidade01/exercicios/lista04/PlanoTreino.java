package unidade01.exercicios.lista04;

/**
 * Representa um plano de treino com descrição, nível e estado (ativo/inativo).
 *
 *
 * Mais linhas de documentação.
 *
 */
public class PlanoTreino {

	/** A descrição do plano de treino. */
	private String descricao;
	/** O nível de dificuldade do plano de treino. */
	private int nivel;
	/** Indica se o plano de treino está ativo. */
	private boolean ativo;

	/**
	 * Cria um novo plano de treino com a descrição fornecida e o define como ativo.
	 *
	 * @param descricao A descrição do plano de treino.
	 */
	public PlanoTreino(String descricao) {
		this(descricao, 0, true);
		//setDescricao(descricao);
		//this.ativo = true;
	}

	/**
	 * Cria um novo plano de treino com descrição, nível e estado de ativação.
	 *
	 * @param descricao A descrição do plano de treino.
	 * @param nivel O nível de dificuldade do plano.
	 * @param ativo O estado de ativação do plano.
	 */
	public PlanoTreino(String descricao, int nivel, boolean ativo) {
		setDescricao(descricao);
		this.nivel = nivel;
		this.ativo = ativo;
	}

	/**
	 * Obtém a descrição do plano de treino.
	 *
	 * @return A descrição do plano.
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Define a descrição do plano de treino.
	 *
	 * @param descricao A nova descrição do plano.
	 * @throws IllegalArgumentException se a descrição for nula ou vazia.
	 */
	public void setDescricao(String descricao) {
		if (descricao == null || descricao.isBlank()) {
			throw new IllegalArgumentException("Descrição não pode ser vazia.");
		}
		this.descricao = descricao;
	}

	/**
	 * Obtém o nível de dificuldade do plano de treino.
	 *
	 * @return O nível do plano.
	 */
	public int getNivel() {
		return nivel;
	}

	/**
	 * Verifica se o plano de treino está ativo.
	 *
	 * @return {@code true} se o plano estiver ativo, {@code false} caso contrário.
	 */
	public boolean isAtivo() {
		return ativo;
	}

	/**
	 * Ativa o plano de treino.
	 */
	public void ativar() {
		this.ativo = true;
	}

	/**
	 * Desativa o plano de treino.
	 */
	public void desativar() {
		this.ativo = false;
	}
}
