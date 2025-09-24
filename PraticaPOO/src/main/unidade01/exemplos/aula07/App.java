package unidade01.exemplos.aula07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe um valor inteiro");

		// Dentro do try, fica o código que pode apresentar erro.
		// No catch é feito o tratamento (o comportamento que o sistema deve ter em caso de erro).
		try {
			int valorInteiro = teclado.nextInt();
			System.out.println("O valor digitado é:" + valorInteiro);

			abrirArquivo();

			lerNumeroString(teclado);

		} catch (InputMismatchException erro) {
			System.out.println("Querido usuário, informe um valor númerico inteiro!");
		} finally {
			teclado.close();
		}


	}

	public static void abrirArquivo() {
		try {
			FileReader arquivo = new FileReader("arquivo.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Mensagem genérica");
		}
	}

	public static int lerNumeroString(Scanner teclado) {
		return Integer.parseInt(teclado.nextLine());

	}

}
