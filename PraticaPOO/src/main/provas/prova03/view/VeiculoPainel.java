package provas.prova03.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

import provas.prova03.model.Veiculo;

public class VeiculoPainel extends JPanel {

	public JTextField txtPlaca;
	public JTextField txtModelo;
	public JTextField txtMarca;
	public JTextField txtAno;

	public JButton btnAdicionar;

	public VeiculoPainel() {
		setLayout(new GridLayout(9, 5, 5, 5));
		setBorder(new EmptyBorder(10, 20, 10, 20));

		txtPlaca = new JTextField();
		txtModelo = new JTextField();
		txtMarca = new JTextField();
		txtAno = new JTextField();

		btnAdicionar = new JButton("Adicionar Veículo");

		add(new JLabel("Placa:"));
		add(txtPlaca);

		add(new JLabel("Modelo:"));
		add(txtModelo);

		add(new JLabel("Marca:"));
		add(txtMarca);

		add(new JLabel("Ano:"));
		add(txtAno);

		add(btnAdicionar);
	}

	public void definirAcaoBotaoCadastrar(ActionListener acao) {
		btnAdicionar.addActionListener(acao);
	}

	/**
	 * Para retornar a informação da placa
	 */
	public String getPlaca() {
		return txtPlaca.getText();
	}

	/**
	 * Para retornar a informação do modelo
	 */
	public String getModelo() {
		return txtModelo.getText();
	}

	/**
	 * Para retornar a informação da marca
	 */
	public String getMarca() {
		return txtMarca.getText();
	}

	/**
	 * Para retornar a informação do ano
	 */
	public int getAno() {
		return Integer.parseInt(txtAno.getText());
	}

	/**
	 * Método para limpar os campos do formulário.
	 */
	public void limparCampos() {
		txtPlaca.setText(null);
		txtModelo.setText(null);
		txtMarca.setText(null);
		txtAno.setText(null);
	}
}
