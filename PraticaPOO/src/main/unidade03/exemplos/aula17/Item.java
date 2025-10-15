package unidade03.exemplos.aula17;

public class Item implements Relatorio {

	private int codigo;
	private String descricao;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public void imprimirDados() {
		System.out.println(descricao);
	}
}
