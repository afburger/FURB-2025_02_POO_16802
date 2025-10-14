package unidade03.exercicios.lista06;

public class InstrutorPilates extends Instrutor {

	public InstrutorPilates(String nome, String cref) {
		super(nome, cref, "Instrutor especializado em pilates");
	}

	@Override
	public String getResumo() {
		StringBuilder resumo = new StringBuilder();
		resumo.append("Instrutor: ").append(getNome()).append("\n");
		resumo.append("Especialidade: ").append(getEspecialidade()).append("\n");
		return resumo.toString();
	}
}
