package unidade01.exemplos.aula09;

public class MainTurma {

	public static void main(String[] args) {
		Turma turma = new Turma();
		turma.setMateria("POO");
		turma.setCodigo(4);

		Aluno andre = new Aluno();
		andre.setNome("André");
		andre.setCodigoMatricula(1);
		turma.adicionarAluno(andre);

		Aluno joao = new Aluno();
		joao.setNome("João");
		joao.setCodigoMatricula(2);

		Aluno jose = new Aluno();
		jose.setNome("José");
		jose.setCodigoMatricula(3);

		turma.adicionarAluno(joao);
		turma.adicionarAluno(jose);


		System.out.println("Alunos da turma: " + turma.getMateria());

		for (Aluno alunoTurma : turma.getAlunos()) {
			System.out.println(alunoTurma.getCodigoMatricula() + " - " + alunoTurma.getNome());
		}

	}
}
