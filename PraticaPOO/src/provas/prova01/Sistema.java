package provas.prova01;

import java.util.ArrayList;

public class Sistema {

	private ArrayList<Empresa> empresas = new ArrayList<>();

	public void adicionarEmpresa(Empresa empresa) {
		empresas.add(empresa);
	}

	public void removerEmpresa(Empresa empresa) {
		empresas.remove(empresa);
	}

	public Empresa pesquisarEmpresa(String cnpj) {
		if (cnpj != null && !cnpj.isBlank()) {
			for (Empresa emp : empresas) {
				if (cnpj.equals(emp.getCnpj())) {
					return emp;
				}
			}
		}
		return null;
	}

	public void gerarRelatorioCompleto() {
		for (Empresa emp : empresas) {
			System.out.println(emp.exibirDados());
		}
	}

}
