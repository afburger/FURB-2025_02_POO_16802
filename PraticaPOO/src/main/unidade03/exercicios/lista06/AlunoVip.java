package unidade03.exercicios.lista06;

public class AlunoVip extends Aluno {

	private double descontoMensalidade;

	public AlunoVip(String nome, Instrutor instrutor, double descontoMensalidade) {
		super(nome, instrutor);
		this.descontoMensalidade = descontoMensalidade;
	}

	@Override
	public String getResumo() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getResumo()).append("\n");
		sb.append("Acesso a treinos personalizados e sala exclusiva");
		return sb.toString();
	}
}
