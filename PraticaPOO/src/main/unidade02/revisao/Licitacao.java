package unidade02.revisao;

import java.time.LocalDate;
import java.util.ArrayList;

public class Licitacao {

	private LocalDate data;
	private ArrayList<Item> itens = new ArrayList<>();

	public void adicionarItem(String denominacao) {
		Item item = new Item(denominacao);
		itens.add(item);
	}
}
