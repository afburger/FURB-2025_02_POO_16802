package provas.prova03.model;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import unidade06.PessoaBin;

/**
 * Classe que representa o repositório conforme o diagrama
 * @author André Felipe Bürger (andre.burger@publicatecnologia.com.br)
 *
 */
public class RepositorioVeiculos {

	public static final String CAMINHO_ARQUIO = "C:\\temp\\prova3veiculos.bin";

	private List<Veiculo> veiculos;

	public RepositorioVeiculos() {
		this.veiculos = new ArrayList<>();
	}

	public void adicionar(Veiculo veiculo) {
		this.veiculos.add(veiculo);
	}

	public List<Veiculo> listar() {
		return veiculos;
	}

	/**
	 * Retorna o veículo de acordo com indice.
	 */
	public Veiculo getVeiculoPorIndex(int index) {
		return veiculos.get(index);
	}

	/**
	 * Salva a lista atualizada no arquivo.
	 * Sempre sobreescrevendo todo o arquivo.
	 * @param caminhoArquivo
	 */
	public void salvar(String caminhoArquivo) {
		File arquivo = new File(caminhoArquivo);

		try {
			FileOutputStream fos = new FileOutputStream(arquivo, false);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			for (Veiculo veiculo : veiculos) {
				oos.writeObject(veiculo);
			}

		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

	/**
	 * Carrega os dados do arquivo para a lista e atualiza a lista do repositório.
	 * @param caminhoArquivo
	 */
	public void carregar(String caminhoArquivo) {
		File arquivo = new File(caminhoArquivo);
		try {
			FileInputStream fis = new FileInputStream(arquivo);
			// Cria um ObjectInputStream para ler os bytes e converter em objetos.
			ObjectInputStream ois = new ObjectInputStream(fis);

			// Instância uma nova lista
			veiculos = new ArrayList<>();

			// Faz a leitura até o final do arquivo.
			while (true) {
				try {
					// Lê a informação do arquivo
					Veiculo veiculo = (Veiculo) ois.readObject();
					// Adiciona na lista atualizada.
					veiculos.add(veiculo);
				} catch (EOFException e) {
					// Quando lançar a exceção é porquê chegou ao final do arquivo. Então para o loop
					break;
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Erro ao ler o arquivo" + e.getMessage());
		}
	}
}
