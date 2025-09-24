package unidade01.exercicios.lista04;

public class MainLista04 {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("André");
		Aluno aluno2 = new Aluno("Felipe", 123, 34, 100, 179);

		PlanoTreino plano1 = new PlanoTreino("Pernas");
		PlanoTreino plano2 = new PlanoTreino("Costas", 3, true);

		try {
			aluno1.setIdade(-35);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			plano2.setDescricao("");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}
}
