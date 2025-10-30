package provas.prova02;

public class TransporteMetro extends ServicoTransporte {

	@Override
	public double getTempoMedio() {
		return 1;
	}

	@Override
	public double getPrecoTarifa() {
		return 2;
	}

	@Override
	public String getDescricao() {
		return "Transporte subterrâneo rápido";
	}

}
