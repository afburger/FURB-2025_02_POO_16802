package unidade07.exemplos.exemplo02.view;

import javax.swing.SwingUtilities;

/**
 * Aplicação de Cadastro de Estudantes usando Java Swing
 *
 * @author André Felipe Bürger (andre.burger@publicatecnologia.com.br)
 *
 */
public class StudentRegistrationApp {

	public static void main(String[] args) {
		// Inicia a aplicação na thread de eventos do Swing
		SwingUtilities.invokeLater(() -> {
			StudentRegistrationFrame frame = new StudentRegistrationFrame();
			frame.setVisible(true);
		});
	}
}
