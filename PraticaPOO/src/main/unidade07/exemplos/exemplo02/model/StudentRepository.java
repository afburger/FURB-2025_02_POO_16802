package unidade07.exemplos.exemplo02.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que gerencia uma coleção de estudantes
 *
 * @author André Felipe Bürger (andre.burger@publicatecnologia.com.br)
 *
 */
public class StudentRepository {
	private List<Student> students;

	public StudentRepository() {
		students = new ArrayList<>();
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public List<Student> getAllStudents() {
		return new ArrayList<>(students);
	}

	public void removeStudent(int index) {
		if (index >= 0 && index < students.size()) {
			students.remove(index);
		}
	}
}
