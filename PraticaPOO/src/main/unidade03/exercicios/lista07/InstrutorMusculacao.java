package unidade03.exercicios.lista07;

public class InstrutorMusculacao extends Instrutor {

	public InstrutorMusculacao(String nome, String cpf, String cref) {
		super(nome, cpf, cref, "Instrutor especializado em hipertrofia muscular");
	}

	@Override
	public String getResumo() {
		StringBuilder resumo = new StringBuilder();
		resumo.append("Instrutor: ").append(getNome()).append("\n");
		resumo.append("Especialidade: ").append(getEspecialidade()).append("\n");
		return resumo.toString();
	}
}
