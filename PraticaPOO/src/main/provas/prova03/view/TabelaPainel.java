package provas.prova03.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

import provas.prova03.model.Veiculo;
import unidade07.exemplos.exemplo02.model.Estudante;

public class TabelaPainel extends JPanel {

	public JTable tabela;
	public DefaultTableModel modelo;
	public JButton btnAbastecer;
	public JButton btnMedia;

	public TabelaPainel() {
		setLayout(new BorderLayout());

		modelo = new DefaultTableModel(new String[]{
				"Placa", "Modelo", "Marca", "Ano", "Qtd. Abastecimentos"
		}, 0);

		tabela = new JTable(modelo);
		JScrollPane scroll = new JScrollPane(tabela);
		add(scroll, BorderLayout.CENTER);

		JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
		btnAbastecer = new JButton("Adicionar Abastecimento");
		btnMedia = new JButton("Calcular Última Média");

		painelBotoes.add(btnAbastecer);
		painelBotoes.add(btnMedia);

		add(painelBotoes, BorderLayout.SOUTH);
	}

	public void limparTabela() {
		modelo.setRowCount(0);
	}

	public void adicionarLinha(Object[] dados) {
		modelo.addRow(dados);
	}

	public void definirAcaoBotaoAbastecer(ActionListener acao) {
		btnAbastecer.addActionListener(acao);
	}

	public void definirAcaoBotaoMedia(ActionListener acao) {
		btnMedia.addActionListener(acao);
	}

	/**
	 * Retorna a linha selecionada da tabela (Para retornar o index)
	 * @return
	 */
	public int getLinhaSelecionada() {
		return tabela.getSelectedRow();
	}

	/**
	 * Atualiza a tabela
	 */
	public void atualizarTabela(List<Veiculo> veiculos) {
		// Limpa a tabela
		modelo.setRowCount(0);

		// Adiciona os estudantes
		for (Veiculo veiculo : veiculos) {
			Object[] linha = {veiculo.getPlaca(), veiculo.getModelo(), veiculo.getMarca(), veiculo.getAno(), veiculo.getAbastecimentos().size()};
			adicionarLinha(linha);
		}
	}
}