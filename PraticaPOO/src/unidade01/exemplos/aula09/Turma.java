package unidade01.exemplos.aula09;

import java.util.ArrayList;

public class Turma {

	private int codigo;
	private String materia;
	private ArrayList<Aluno> alunos;

	public Turma() {
		alunos = new ArrayList<>();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	public void removerAluno(Aluno aluno) {
		alunos.remove(aluno);
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
}
