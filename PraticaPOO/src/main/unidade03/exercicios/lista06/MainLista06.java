package unidade03.exercicios.lista06;

public class MainLista06 {

	public static void main(String[] args) {
		// --- Cenário de Teste ---

		// 1. Criar instrutores
		Instrutor mentor = new Instrutor("Mestre Yoda", "0001-G/SC", "Mestre Jedi");
		Instrutor instrutor = new Instrutor("Luke Skywalker", "0002-G/SC", "Musculação");
		InstrutorPilates instrutoPilates = new InstrutorPilates("José", "0003-G/SC");
		InstrutorMusculacao instrutorMusculacao	= new InstrutorMusculacao("João", "0004-G/SC");

		// 2. Testar a relação de mentor entre instrutores
		instrutor.setMentor(mentor);

		// 3. Criar alunos e associar a um instrutor
		Aluno aluno1 = new Aluno("Anakin Skywalker", instrutor);
		aluno1.setMatricula(12345);
		aluno1.setIdade(22);
		aluno1.setPeso(84);
		aluno1.setAltura(1.88);

		Aluno aluno2 = new Aluno("Leia Organa", instrutor);
		aluno2.setMatricula(67890);
		aluno2.setIdade(19);
		aluno2.setPeso(55);
		aluno2.setAltura(1.55);

		Aluno alunoVip = new AlunoVip("Maria", instrutoPilates, 10.0);
		//
		// Adicionar os alunos à lista do instrutor
		instrutor.adicionarAluno(aluno1);
		instrutor.adicionarAluno(aluno2);
		instrutoPilates.adicionarAluno(alunoVip);

		// 4. Definir um plano de treino com exercícios
		PlanoTreino planoAluno1 = new PlanoTreino("Treino de Força Jedi");
		planoAluno1.setNivel(5);
		
		planoAluno1.adicionaExercicio(new Exercicio("Levantamento de X-Wing", 3, 1, 5000));
		planoAluno1.adicionaExercicio(new Exercicio("Corrida no Pântano de Dagobah", 1, 1, 60));
		planoAluno1.adicionaExercicio(new Exercicio("Duelo de Sabre de Luz", 5, 3, 0));

		// 5. Associar o plano de treino a um aluno
		aluno1.setPlanoTreino(planoAluno1);
		planoAluno1.setAluno(aluno1);

		// --- Impressão dos Resultados ---
		System.out.println("=============================================");
		System.out.println("RELATÓRIO DA ACADEMIA JEDI");
		System.out.println("=============================================");

		System.out.println(instrutor);
		System.out.println("---------------------------------------------");
		System.out.println(instrutorMusculacao);
		System.out.println("---------------------------------------------");
		System.out.println(instrutoPilates);
		System.out.println("---------------------------------------------");
		

		System.out.println("Detalhes dos Alunos: ");
		System.out.println(aluno1);
		System.out.println("---------------------------------------------");
		System.out.println(aluno2);
		System.out.println("---------------------------------------------");
		System.out.println(alunoVip);

	}
}
