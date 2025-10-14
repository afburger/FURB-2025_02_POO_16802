package unidade03.exercicios.lista07;

import java.util.ArrayList;

/**
 * Representa um plano de treino, contendo uma lista de exercícios e associado a um aluno.
 */
public class PlanoTreino {

	/** A descrição do plano de treino. */
	private String descricao;
	/** O nível de dificuldade do plano de treino. */
	private int nivel;
	/** Indica se o plano de treino está ativo. */
	private boolean ativo;
	/** O aluno para o qual este plano de treino se destina. */
	private Aluno aluno;
	/** A lista de exercícios que compõem o plano de treino. */
	private ArrayList<Exercicio> exercicios = new ArrayList<>();

	/**
	 * Cria um novo plano de treino com a descrição fornecida e o define como ativo.
	 *
	 * @param descricao A descrição do plano de treino.
	 */
	public PlanoTreino(String descricao) {
		setDescricao(descricao);
		this.ativo = true;
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
	 * Define o nível de dificuldade do plano de treino.
	 *
	 * @param nivel O novo nível do plano.
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
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

	/**
	 * Obtém o aluno associado a este plano de treino.
	 *
	 * @return O aluno associado.
	 */
	public Aluno getAluno() {
		return aluno;
	}

	/**
	 * Define o aluno para este plano de treino.
	 *
	 * @param aluno O aluno a ser associado.
	 */
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	/**
	 * Obtém a lista de exercícios do plano de treino.
	 *
	 * @return A lista de exercícios.
	 */
	public ArrayList<Exercicio> getExercicios() {
		return exercicios;
	}

	/**
	 * Adiciona um exercício à lista do plano de treino.
	 *
	 * @param exercicio O exercício a ser adicionado.
	 */
	public void adicionaExercicio(Exercicio exercicio) {
		this.exercicios.add(exercicio);
	}

	/**
	 * Remove um exercício da lista do plano de treino.
	 *
	 * @param exercicio O exercício a ser removido.
	 */
	public void removeExercicio(Exercicio exercicio) {
		this.exercicios.remove(exercicio);
	}
}
