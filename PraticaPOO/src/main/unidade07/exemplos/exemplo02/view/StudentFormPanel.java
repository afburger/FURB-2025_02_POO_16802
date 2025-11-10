package unidade07.exemplos.exemplo02.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import unidade07.exemplos.exemplo02.model.Student;

/**
 * Painel com formulário para cadastro de estudantes
 *
 * @author André Felipe Bürger (andre.burger@publicatecnologia.com.br)
 *
 */
public class StudentFormPanel extends JPanel {
	private JTextField nameField;
	private JTextField idField;
	private JComboBox<String> courseComboBox;
	private JButton registerButton;

	public StudentFormPanel() {
		// Configura o layout
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createTitledBorder("Cadastro de Novo Estudante"));

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.fill = GridBagConstraints.HORIZONTAL;

		// Cria os componentes
		JLabel nameLabel = new JLabel("Nome:");
		JLabel idLabel = new JLabel("Matrícula:");
		JLabel courseLabel = new JLabel("Curso:");

		nameField = new JTextField(20);
		idField = new JTextField(10);

		String[] courses = {"Ciência da Computação", "Engenharia de Software",
				"Sistemas de Informação", "Engenharia da Computação"};
		courseComboBox = new JComboBox<>(courses);

		registerButton = new JButton("Cadastrar");

		// Adiciona os componentes usando GridBagLayout
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(nameLabel, gbc);

		gbc.gridx = 1;
		gbc.weightx = 1.0;
		add(nameField, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0;
		add(idLabel, gbc);

		gbc.gridx = 1;
		gbc.weightx = 1.0;
		add(idField, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 0;
		add(courseLabel, gbc);

		gbc.gridx = 1;
		gbc.weightx = 1.0;
		add(courseComboBox, gbc);

		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		add(registerButton, gbc);
	}

	public void setRegisterButtonAction(ActionListener action) {
		registerButton.addActionListener(action);
	}

	public Student getStudentFromForm() {
		String name = nameField.getText().trim();
		String id = idField.getText().trim();
		String course = (String) courseComboBox.getSelectedItem();

		if (name.isEmpty() || id.isEmpty()) {
			JOptionPane.showMessageDialog(this,
					"Por favor, preencha todos os campos obrigatórios.",
					"Campos Incompletos",
					JOptionPane.WARNING_MESSAGE);
			return null;
		}

		return new Student(name, id, course);
	}

	public void clearForm() {
		nameField.setText("");
		idField.setText("");
		courseComboBox.setSelectedIndex(0);
		nameField.requestFocus();
	}
}
