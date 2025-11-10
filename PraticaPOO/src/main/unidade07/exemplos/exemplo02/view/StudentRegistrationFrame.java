package unidade07.exemplos.exemplo02.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import unidade07.exemplos.exemplo02.model.Student;
import unidade07.exemplos.exemplo02.model.StudentRepository;

/**
 * Frame principal da aplicação
 *
 * @author André Felipe Bürger (andre.burger@publicatecnologia.com.br)
 *
 */
public class StudentRegistrationFrame extends JFrame {
	private StudentRepository repository;
	private StudentFormPanel formPanel;
	private StudentTablePanel tablePanel;

	public StudentRegistrationFrame() {
		// Configuração do frame
		setTitle("Cadastro de Estudantes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);

		// Inicializa o repositório de estudantes
		repository = new StudentRepository();

		// Configura o layout
		setLayout(new BorderLayout(10, 10));

		// Cria os painéis
		formPanel = new StudentFormPanel();
		tablePanel = new StudentTablePanel();

		// Adiciona os painéis ao frame
		add(formPanel, BorderLayout.NORTH);
		add(tablePanel, BorderLayout.CENTER);

		// Configura a ação do botão de cadastro
		formPanel.setRegisterButtonAction(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Student student = formPanel.getStudentFromForm();
				if (student != null) {
					repository.addStudent(student);
					tablePanel.updateTable(repository.getAllStudents());
					formPanel.clearForm();
				}
			}
		});

		// Configura a ação do botão de remoção
		tablePanel.setRemoveButtonAction(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedRow = tablePanel.getSelectedRow();
				if (selectedRow >= 0) {
					repository.removeStudent(selectedRow);
					tablePanel.updateTable(repository.getAllStudents());
				}
			}
		});
	}
}