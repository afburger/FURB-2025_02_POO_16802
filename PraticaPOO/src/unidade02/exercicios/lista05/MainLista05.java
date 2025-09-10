package unidade02.exercicios.lista05;

public class MainLista05 {

	public static void main(String[] args) {
		// --- Cenário de Teste ---

		// 1. Criar instrutores
		Instrutor mentor = new Instrutor("Mestre Yoda", "0001-G/SC", "Mestre Jedi");
		Instrutor instrutor = new Instrutor("Luke Skywalker", "0002-G/SC", "Musculação");

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
		
		// Adicionar os alunos à lista do instrutor
		instrutor.adicionarAluno(aluno1);
		instrutor.adicionarAluno(aluno2);

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

		System.out.println(instrutor.getResumo());
		System.out.println("---------------------------------------------");
		
		System.out.println("\n--- Detalhes do Aluno: " + aluno1.getNome() + " ---");
		System.out.println("Matrícula: " + aluno1.getMatricula());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Instrutor: " + aluno1.getInstrutor().getNome());
		
		if (aluno1.getPlanoTreino() != null) {
			PlanoTreino plano = aluno1.getPlanoTreino();
			System.out.println("\nPlano de Treino: " + plano.getDescricao() + " (Nível " + plano.getNivel() + ")");
			System.out.println("Exercícios:");
			if (!plano.getExercicios().isEmpty()) {
				for (Exercicio ex : plano.getExercicios()) {
					System.out.println(" - " + ex.getResumo());
				}
			} else {
				System.out.println(" - Nenhum exercício no plano.");
			}
		} else {
			System.out.println("Nenhum plano de treino associado.");
		}
		
		System.out.println("\n=============================================");
		
		System.out.println("\n--- Detalhes do Aluno: " + aluno2.getNome() + " ---");
		System.out.println("Matrícula: " + aluno2.getMatricula());
		System.out.println("Idade: " + aluno2.getIdade());
		System.out.println("Instrutor: " + aluno2.getInstrutor().getNome());
		if (aluno2.getPlanoTreino() != null) {
			System.out.println("Plano de Treino: " + aluno2.getPlanoTreino().getDescricao());
		} else {
			System.out.println("\nNenhum plano de treino associado.");
		}
		System.out.println("\n=============================================");

	}
}
