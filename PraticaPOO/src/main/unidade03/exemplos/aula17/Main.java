package unidade03.exemplos.aula17;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("123.456.789-00");
		pessoa.setNome("Nome do cidadão");

		Item item = new Item();
		item.setCodigo(123);
		item.setDescricao("Caneta");

		Pedido pedido = new Pedido();
		pedido.setCliente(pessoa);
		pedido.getItens().add(item);

		ArrayList<Relatorio> relatorios = new ArrayList<>();

		relatorios.add(pedido);
		relatorios.add(item);
		relatorios.add(pessoa);

		for (Relatorio rel : relatorios) {
			rel.imprimirDados();
			System.out.println("-----------------------");
		}


	}
}
