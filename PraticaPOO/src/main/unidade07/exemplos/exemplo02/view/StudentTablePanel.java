package unidade07.exemplos.exemplo02.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import unidade07.exemplos.exemplo02.model.Student;

/**
 * Painel com tabela para exibição dos estudantes
 *
 * @author André Felipe Bürger (andre.burger@publicatecnologia.com.br)
 *
 */
public class StudentTablePanel extends JPanel {
	private JTable table;
	private DefaultTableModel tableModel;
	private JButton removeButton;

	public StudentTablePanel() {
		setLayout(new BorderLayout(10, 10));
		setBorder(BorderFactory.createTitledBorder("Estudantes Cadastrados"));

		// Cria o modelo da tabela
		String[] columns = {"Nome", "Matrícula", "Curso"};
		tableModel = new DefaultTableModel(columns, 0);

		// Cria a tabela
		table = new JTable(tableModel);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		// Adiciona a tabela em um scroll pane
		JScrollPane scrollPane = new JScrollPane(table);

		// Cria o botão de remover
		removeButton = new JButton("Remover Selecionado");
		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.add(removeButton);

		// Adiciona os componentes
		add(scrollPane, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
	}

	public void updateTable(List<Student> students) {
		// Limpa a tabela
		tableModel.setRowCount(0);

		// Adiciona os estudantes
		for (Student student : students) {
			Object[] row = {student.getName(), student.getId(), student.getCourse()};
			tableModel.addRow(row);
		}
	}

	public int getSelectedRow() {
		return table.getSelectedRow();
	}

	public void setRemoveButtonAction(ActionListener action) {
		removeButton.addActionListener(action);
	}
}