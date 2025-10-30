package provas.prova02;

public class TransporteOnibus extends ServicoTransporte {

	@Override
	public double getTempoMedio() {
		return 2;
	}

	@Override
	public double getPrecoTarifa() {
		return 1.20;
	}

	@Override
	public String getDescricao() {
		return "Transporte coletivo convencional";
	}

}
