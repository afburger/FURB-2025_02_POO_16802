package provas.prova02;

public abstract class ServicoTransporte implements Transporte {

	private String nomeServico;

	public String getNomeServico() {
		return nomeServico;
	}

	public abstract double getTempoMedio();

	public abstract double getPrecoTarifa();

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public abstract String getDescricao();

	@Override
	public double calcularTarifa(double distancia) {
		return distancia * getPrecoTarifa();
	}

	@Override
	public int calcularTempoEstimado(double distancia) {
		return (int) (distancia * getTempoMedio());
	}
}
