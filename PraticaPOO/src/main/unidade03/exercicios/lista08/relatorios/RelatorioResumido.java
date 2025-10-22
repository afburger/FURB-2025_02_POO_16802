package unidade03.exercicios.lista08.relatorios;

import unidade03.exercicios.lista08.Projeto;
import unidade03.exercicios.lista08.Sistema;
import unidade03.exercicios.lista08.SistemaUtils;

public class RelatorioResumido implements Relatorio {

	@Override
	public int getCodigo() {
		return 4;
	}

	@Override
	public void imprimir(Sistema sistema) {
		System.out.println("---------------------------------------------");
		System.out.println("Relatório resumido de projetos");
		System.out.println("---------------------------------------------");
		System.out.println("Número | Tipo projeto | Data Inclusão");
		System.out.println("---------------------------------------------");
		for (Projeto projeto : sistema.getProjetos()) {
			StringBuilder sb = new StringBuilder();
			sb.append(projeto.getNumero())
					.append(" | ")
					.append(projeto.getTipoProjeto())
					.append(" | ")
					.append(SistemaUtils.formatarData(projeto.getDataInclusao()))
					.append(" | ")
			;
			System.out.println(sb.toString());
		}
		System.out.println("---------------------------------------------");
	}
}
