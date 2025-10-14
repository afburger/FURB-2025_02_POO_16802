package unidade03.exercicios.lista06;

/**
 * Representa um aluno de academia, com seus dados pessoais, instrutor e plano de treino.
 */
public class Aluno {

	/** O nome do aluno. */
	private String nome;
	/** A matrícula do aluno. */
	private long matricula;
	/** A idade do aluno. */
	private int idade;
	/** O peso do aluno em quilogramas. */
	private double peso;
	/** A altura do aluno em metros. */
	private double altura;
	/** O instrutor responsável pelo aluno. */
	private Instrutor instrutor;
	/** O plano de treino associado ao aluno. */
	private PlanoTreino planoTreino;

	/**
	 * Cria um novo aluno com nome e instrutor.
	 *
	 * @param nome O nome do aluno.
	 * @param instrutor O instrutor responsável.
	 */
	public Aluno(String nome, Instrutor instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	/**
	 * Cria um novo aluno com todos os dados.
	 * @param nome      O nome do aluno.
	 * @param matricula A matrícula do aluno.
	 * @param idade     A idade do aluno.
	 * @param peso      O peso do aluno.
	 * @param altura    A altura do aluno.
	 */
	public Aluno(String nome, long matricula, int idade, double peso, double altura, Instrutor instrutor) {
		this(nome, instrutor);
		this.matricula = matricula;
		this.peso = peso;
		this.altura = altura;
		setIdade(idade);
	}

	/**
	 * Obtém o nome do aluno.
	 *
	 * @return O nome do aluno.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Define o nome do aluno.
	 *
	 * @param nome O novo nome do aluno.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Obtém a matrícula do aluno.
	 *
	 * @return A matrícula do aluno.
	 */
	public long getMatricula() {
		return matricula;
	}

	/**
	 * Define a matrícula do aluno.
	 *
	 * @param matricula A nova matrícula do aluno.
	 */
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	/**
	 * Obtém a idade do aluno.
	 *
	 * @return A idade do aluno.
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * Define a idade do aluno.
	 *
	 * @param idade A nova idade do aluno.
	 * @throws IllegalArgumentException se a idade for menor que zero.
	 */
	public void setIdade(int idade) {
		if (idade < 0) {
			throw new IllegalArgumentException("Idade não pode ser menor que zero.");
		}
		this.idade = idade;
	}

	/**
	 * Obtém o peso do aluno.
	 *
	 * @return O peso do aluno.
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Define o peso do aluno.
	 *
	 * @param peso O novo peso do aluno.
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Obtém a altura do aluno.
	 *
	 * @return A altura do aluno.
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Define a altura do aluno.
	 *
	 * @param altura A nova altura do aluno.
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * Obtém o instrutor do aluno.
	 *
	 * @return O instrutor responsável.
	 */
	public Instrutor getInstrutor() {
		return instrutor;
	}

	/**
	 * Define o instrutor do aluno.
	 *
	 * @param instrutor O novo instrutor responsável.
	 */
	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	/**
	 * Obtém o plano de treino do aluno.
	 *
	 * @return O plano de treino.
	 */
	public PlanoTreino getPlanoTreino() {
		return planoTreino;
	}

	/**
	 * Define o plano de treino do aluno.
	 *
	 * @param planoTreino O novo plano de treino.
	 */
	public void setPlanoTreino(PlanoTreino planoTreino) {
		this.planoTreino = planoTreino;
	}

	public String getResumo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Aluno:").append(nome).append("\n");
		sb.append("Peso:").append(peso).append("\n");
		sb.append("Idade:").append(idade);
		return sb.toString();
	}

	@Override
	public String toString() {
		return getResumo();
	}
}
