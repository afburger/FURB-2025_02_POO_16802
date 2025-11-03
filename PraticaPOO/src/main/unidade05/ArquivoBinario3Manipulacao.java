package unidade05;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;

/**
 *
 * @author André Felipe Bürger (afburger@furb.com.br)
 *
 */
public class ArquivoBinario3Manipulacao {

	private static final String FILE_PATH = "C:\\temp\\pessoas.dat";

	public static void main(String[] args) {
		// Adiciona algumas pessoas
		gravarPessoa(new PessoaBin(1, "Felipe", 30));
		gravarPessoa(new PessoaBin(2, "André", 34));

		// Atualiza a pessoa com ID 1
		atualizarPessoa(1, "Felipe Atualizado", 31);

		// Lista todas as pessoas
		System.out.println("Lista de Pessoas:");
		listarPessoas();
	}

	// Grava um novo objeto Pessoa no final do arquivo
	public static void gravarPessoa(PessoaBin pessoa) {

		try {
			RandomAccessFile raf = new RandomAccessFile(FILE_PATH, "rw");
		    ByteArrayOutputStream baos = new ByteArrayOutputStream();
		    ObjectOutputStream oos = new ObjectOutputStream(baos);

			oos.writeObject(pessoa);
			oos.flush();
			byte[] data = baos.toByteArray();

			// Move para o fim do arquivo
			raf.seek(raf.length());

			// Grava o tamanho do objeto
			raf.writeInt(data.length);

			// Grava o objeto serializado
			raf.write(data);
		} catch (IOException e) {
			System.out.println("Erro ao gravar pessoa " + e.getMessage());
		}
	}

	// Atualiza uma Pessoa pelo ID
	public static void atualizarPessoa(int codigo, String novoNome, int novaIdade)  {

		// Faz a leitura e acesso do arquivo.
		try {
			// Inicia o objeto RandomAccessFile em modo de leitura e escrita "RW".
			RandomAccessFile raf = new RandomAccessFile(FILE_PATH, "rw");
			// Percorre o arquivo até o final
			while (raf.getFilePointer() < raf.length()) {

				// Lê a posição
				long posicaoInicio = raf.getFilePointer();
				// Lê o tamanho do objeto
				int tamanhoObjeto = raf.readInt();
				// Cria um array de bytes para armazenar o objeto completo.
				byte[] data = new byte[tamanhoObjeto];
				// Lê o objeto completo.
				raf.readFully(data);

				// Cria um ObjectInputStream para ler e converter o objeto.
				ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
				// Converte o objeto lido.
				PessoaBin pessoa = (PessoaBin) ois.readObject();

				// Verifica se o código da pessoa é o mesmo código informado para atualizar.
				if (pessoa.getCodigo() == codigo) {  // Encontra a pessoa com o mesmo CODIGO
					pessoa.setNome(novoNome);
					pessoa.setIdade(novaIdade);

					// Cria um ObjectOutputStream para gravar as alterações.
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
			        ObjectOutputStream oos = new ObjectOutputStream(baos);

					// Prepara os dados para serem escritos no arquivo.
					oos.writeObject(pessoa);
					// Faz a alteração no stream.
					oos.flush();
					// Converte esses dados para um array de bytes novamente.
					byte[] novosDados = baos.toByteArray();

					// Verifica se teve alguma alteração no tamanho do objeto.
					if (novosDados.length <= tamanhoObjeto) {
						// altera a posição do ponteiro
						raf.seek(posicaoInicio + 4);
						// atualiza os dados no arquivo.
						raf.write(novosDados);
					} else {
						System.out.println("Erro: Novo objeto excede o tamanho do espaço reservado.");
						// TODO: Para não acontecer esse erro, uma possibilidade
					}
				}
			}
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("Erro ao ler o arquivo" + e.getMessage());
		}
	}

	// Exibe todas as Pessoas no arquivo
	public static void listarPessoas() {
		try {
			// Inicia o objeto RandomAccessFile em modo de leitura "R".
			RandomAccessFile raf = new RandomAccessFile(FILE_PATH, "r");
			// Percorre o arquivo até o final
			while (raf.getFilePointer() < raf.length()) {

				// Lê o tamanho do objeto
				int tamanhoObjeto = raf.readInt();
				// Cria um array de bytes para armazenar o objeto completo.
				byte[] data = new byte[tamanhoObjeto];
				// Lê o objeto completo.
				raf.readFully(data);

				// Cria um ObjectInputStream para ler os bytes e converter em objetos.
				ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
				// Faz o cast do objeto
				PessoaBin pessoa = (PessoaBin) ois.readObject();
				// Imprime no console o objeto pessoa.
				System.out.println(pessoa);

			}
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Erro ao ler o arquivo" + e.getMessage());
		}
	}
}
