package unidade03.exercicios.lista07;

import java.util.ArrayList;

/**
 * Representa um instrutor de academia, com seus dados pessoais, alunos e mentor.
 */
public class Instrutor extends Pessoa {

	/** O número de registro nos Conselho Regional de Educação Física (CREF). */
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
	public Instrutor(String nome, String cpf, String cref, String especialidade) {
		super(nome, cpf);
		this.cref = cref;
		this.especialidade = especialidade;
		this.alunos = new ArrayList<>();
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
	@Override
	public String getResumo() {
		return "Instrutor: "+ getNome() + " | CREF: " + getCref() + " | Especialidade: " + getEspecialidade();
	}

	@Override
	public String toString() {
		return getResumo();
	}
}
