package unidade01.exercicios.lista04;

public class Aluno {

	private String nome;
	private long matricula;
	private int idade;
	private double peso;
	private double altura;

	public Aluno(String nome) {
		this.nome = nome;
	}

	public Aluno(String nome, long matricula, int idade, double peso, double altura) {
		this.nome = nome;
		this.matricula = matricula;
		this.peso = peso;
		this.altura = altura;
		setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 0) {
			throw new IllegalArgumentException("Idade não pode ser menor que zero.");
		}
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
