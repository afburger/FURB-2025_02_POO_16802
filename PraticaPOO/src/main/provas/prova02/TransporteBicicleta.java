package provas.prova02;

public class TransporteBicicleta extends ServicoTransporte {

	@Override
	public double getTempoMedio() {
		return 3;
	}

	@Override
	public double getPrecoTarifa() {
		return 0.80;
	}

	@Override
	public String getDescricao() {
		return "Locação de bicicletas compartilhadas";
	}
}
