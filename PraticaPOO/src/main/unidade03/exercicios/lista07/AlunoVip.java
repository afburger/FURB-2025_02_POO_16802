package unidade03.exercicios.lista07;

public class AlunoVip extends Aluno {

	private double descontoMensalidade;

	public AlunoVip(String nome, String cpf, Instrutor instrutor, double descontoMensalidade) {
		super(nome, cpf, instrutor);
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
