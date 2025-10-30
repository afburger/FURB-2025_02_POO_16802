package provas.prova02;

public class TransporteTaxi extends ServicoTransporte {
	@Override
	public double getTempoMedio() {
		return 1.5;
	}

	@Override
	public double getPrecoTarifa() {
		return 3.5;
	}

	@Override
	public String getDescricao() {
		return "Transporte individual sob demanda";
	}
}
