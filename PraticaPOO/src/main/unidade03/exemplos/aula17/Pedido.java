package unidade03.exemplos.aula17;

import java.util.ArrayList;

public class Pedido implements Relatorio {

	private Pessoa cliente;
	private ArrayList<Item> itens = new ArrayList<>();

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	@Override
	public void imprimirDados() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cliente:").append(getCliente().getNome());
		sb.append("\n").append("Itens").append("\n");
		for (Item i : itens) {
			sb.append(i.getCodigo());
		}
		System.out.println(sb.toString());
	}
}
