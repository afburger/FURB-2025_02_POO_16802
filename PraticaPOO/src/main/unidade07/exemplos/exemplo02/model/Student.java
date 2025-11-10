package unidade07.exemplos.exemplo02.model;

/**
 * Classe que representa um estudante
 * @author André Felipe Bürger (andre.burger@publicatecnologia.com.br)
 *
 */
public class Student {
	private String name;
	private String id;
	private String course;

	public Student(String name, String id, String course) {
		this.name = name;
		this.id = id;
		this.course = course;
	}

	// Getters e Setters
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getId() { return id; }
	public void setId(String id) { this.id = id; }

	public String getCourse() { return course; }
	public void setCourse(String course) { this.course = course; }

	@Override
	public String toString() {
		return "Estudante: " + name + " (ID: " + id + ") - Curso: " + course;
	}
}
