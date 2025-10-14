package unidade03.exercicios.lista06;

import java.util.ArrayList;

/**
 * Representa um instrutor de academia, com seus dados pessoais, alunos e mentor.
 */
public class Instrutor {

	/** O nome do instrutor. */
	private String nome;
	/** O número de registro no Conselho Regional de Educação Física (CREF). */
	private String cref;
	/** A especialidade do instrutor (ex: Musculação, Natação). */
	private String especialidade;
	/** A lista de alunos supervisionados pelo instrutor. */
	private ArrayList<Aluno> alunos;
	/** O instrutor que é mentor deste instrutor. Pode ser nulo. */
	private Instrutor mentor;

	/**
	 * Cria um novo instrutor com os dados essenciais.
	 * A lista de alunos é inicializada como vazia.
	 *
	 * @param nome O nome do instrutor.
	 * @param cref O número de registro no CREF.
	 * @param especialidade A especialidade do instrutor.
	 */
	public Instrutor(String nome, String cref, String especialidade) {
		this.nome = nome;
		this.cref = cref;
		this.especialidade = especialidade;
		this.alunos = new ArrayList<>();
	}

	/**
	 * Obtém o nome do instrutor.
	 *
	 * @return O nome do instrutor.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Define o nome do instrutor.
	 *
	 * @param nome O novo nome do instrutor.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Obtém o número de registro no CREF.
	 *
	 * @return O número do CREF.
	 */
	public String getCref() {
		return cref;
	}

	/**
	 * Define o número de registro no CREF.
	 *
	 * @param cref O novo número do CREF.
	 */
	public void setCref(String cref) {
		this.cref = cref;
	}

	/**
	 * Obtém a especialidade do instrutor.
	 *
	 * @return A especialidade do instrutor.
	 */
	public String getEspecialidade() {
		return especialidade;
	}

	/**
	 * Define a especialidade do instrutor.
	 *
	 * @param especialidade A nova especialidade.
	 */
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	/**
	 * Obtém o mentor deste instrutor.
	 *
	 * @return O instrutor mentor, ou null se não houver.
	 */
	public Instrutor getMentor() {
		return mentor;
	}

	/**
	 * Define o mentor deste instrutor.
	 *
	 * @param mentor O instrutor que será o mentor.
	 */
	public void setMentor(Instrutor mentor) {
		this.mentor = mentor;
	}

	/**
	 * Obtém a lista de alunos do instrutor.
	 *
	 * @return A lista de alunos.
	 */
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	/**
	 * Adiciona um aluno à lista de alunos do instrutor.
	 *
	 * @param aluno O aluno a ser adicionado.
	 */
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	/**
	 * Remove um aluno da lista de alunos do instrutor.
	 *
	 * @param aluno O aluno a ser removido.
	 */
	public void removeAluno(Aluno aluno) {
		this.alunos.remove(aluno);
	}
	
	/**
	 * Gera uma string com o resumo completo dos dados do instrutor,
	 * incluindo mentor e lista de alunos.
	 *
	 * @return Uma string formatada com os dados do instrutor.
	 */
	public String getResumo() {
		StringBuilder resumo = new StringBuilder();
		resumo.append("Instrutor: ").append(nome).append("\n");
		resumo.append("CREF: ").append(cref).append("\n");
		resumo.append("Especialidade: ").append(especialidade).append("\n");

		if (mentor != null) {
			resumo.append("Mentor: ").append(mentor.getNome()).append("\n");
		} else {
			resumo.append("Mentor: Nenhum\n");
		}

		resumo.append("Alunos:\n");
		if (alunos != null && !alunos.isEmpty()) {
			for (Aluno aluno : alunos) {
				resumo.append("- ").append(aluno.getNome()).append("\n");
			}
		} else {
			resumo.append("- Nenhum aluno associado.\n");
		}

		return resumo.toString();
	}

	@Override
	public String toString() {
		return getResumo();
	}
}
