package provas.prova03.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import provas.prova03.model.Abastecimento;
import provas.prova03.model.RepositorioVeiculos;
import provas.prova03.model.Veiculo;

public class SistemaVeiculos extends JFrame {

	private RepositorioVeiculos repositorio;
	private VeiculoPainel veiculoPainel;
	private TabelaPainel tabelaPainel;

	public SistemaVeiculos() {
		setTitle("Sistema de Veículos");
		setSize(900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		veiculoPainel = new VeiculoPainel();
		tabelaPainel = new TabelaPainel();

		add(veiculoPainel, BorderLayout.NORTH);
		add(tabelaPainel, BorderLayout.CENTER);

		// Instancia o repositório
		repositorio = new RepositorioVeiculos();

		// Carrega os dados do arquivo
		carregar();

		// Atualiza a tabela com os dados do arquivo
		tabelaPainel.atualizarTabela(getVeiculos());

		/*
		 * Aqui é implmentada a lógica do botão cadastrar veículo
		 * Vai criar uma classe anônima de ActionListner ao instânicar com  new
		 */
		veiculoPainel.definirAcaoBotaoCadastrar(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String placa = veiculoPainel.getPlaca();
				String modelo = veiculoPainel.getModelo();
				String marca = veiculoPainel.getMarca();
				int ano = veiculoPainel.getAno();
				cadastrarVeiculo(placa, modelo, marca, ano);
			}
		});

		/*
		 * Aqui é implmentada a lógica do botão Adicionar abastecimento
		 * Vai criar uma classe anônima de ActionListner ao instânicar com  new
		 */
		tabelaPainel.definirAcaoBotaoAbastecer(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = tabelaPainel.getLinhaSelecionada();
				if (index < 0) {
					JOptionPane.showMessageDialog(null, "Selecione um veículo");
				} else {
					double km = Double.parseDouble(JOptionPane.showInputDialog("Informe a KM atual:"));
					double litros = Double.parseDouble(JOptionPane.showInputDialog("Informe a Quantidade de Litros abastecidos:"));
					double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do litro em R$:"));
					adicionarAbastecimento(index, km, litros, preco);
					salvar();
				}
			}
		});

		/*
		 * Aqui é implementada a lógica para calcular a última média.
		 * Vai criar uma classe anônima de ActionListner ao instânicar com  new
		 */
		tabelaPainel.definirAcaoBotaoMedia(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int linhaSelecionada = tabelaPainel.getLinhaSelecionada();
					if (linhaSelecionada < 0 ) {
						throw new IllegalArgumentException("Selecione um veículo");
					}
					double media = calcularUltimaMedia(linhaSelecionada);
					JOptionPane.showMessageDialog(null, "A média do ultimo abastecimento é " + media + " km/l");
				} catch (IllegalArgumentException ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
			}
		});
	}

	public VeiculoPainel getVeiculoPainel() {
		return veiculoPainel;
	}

	public TabelaPainel getTabelaPainel() {
		return tabelaPainel;
	}

	/**
	 * Recebe as informações do veículo e chama o repositório para fazer o cadastro.
	 */
	public void cadastrarVeiculo(String placa, String modelo, String marca, int ano) {
		Veiculo veiculo = new Veiculo(placa, modelo, marca, ano);
		repositorio.adicionar(veiculo);
		tabelaPainel.atualizarTabela(getVeiculos());
		veiculoPainel.limparCampos();
		salvar();
	}

	/**
	 * Retorna a lista de veículos para atualizar a tabela quando necesário.
	 */
	public List<Veiculo> getVeiculos() {
		return repositorio.listar();
	}

	public void adicionarAbastecimento(int indexVeiculo, double km, double litros, double preco) {
		Veiculo veiculo = repositorio.getVeiculoPorIndex(indexVeiculo);
		Abastecimento abast = new Abastecimento(km, litros, preco);
		veiculo.adicionarAbastecimento(abast);
		tabelaPainel.atualizarTabela(getVeiculos());
	}

	public double calcularUltimaMedia(int index) throws IllegalArgumentException {
		Veiculo veiculo = repositorio.getVeiculoPorIndex(index);
		return veiculo.getUltimaMedia();
	}

	/**
	 * Chama o método do repoisitório para salvar se necessário
	 */
	public void salvar() {
		repositorio.salvar(RepositorioVeiculos.CAMINHO_ARQUIO);
	}

	/**
	 * Chama o método do repoisitório para carregar se necessário
	 */
	public void carregar() {
		repositorio.carregar(RepositorioVeiculos.CAMINHO_ARQUIO);
	}
}
