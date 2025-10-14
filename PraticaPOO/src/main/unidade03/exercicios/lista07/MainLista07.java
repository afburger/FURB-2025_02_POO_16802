package unidade03.exercicios.lista07;

import java.util.ArrayList;

public class MainLista07 {

	public static void main(String[] args) {
		// --- Cenário de Teste ---

		// 1. Criar instrutores
		Instrutor mentor = new Instrutor("Mestre Yoda", "000.000.123-45", "0001-G/SC", "Mestre Jedi");
		Instrutor instrutor = new Instrutor("Luke Skywalker", "000.000.789-45", "0002-G/SC", "Musculação");
		InstrutorPilates instrutoPilates = new InstrutorPilates("José", "000.000.987-45", "0003-G/SC");
		InstrutorMusculacao instrutorMusculacao	= new InstrutorMusculacao("João", "000.000.622-45", "0004-G/SC");

		Aluno aluno = new Aluno("Nome aluno", "000.123.123-45", 1235, 35, 92, 170, instrutor);
		AlunoVip alunoVip = new AlunoVip("Aluno vip", "000.999.999-45", instrutorMusculacao, 10.0);

		ArrayList<Pessoa> pessoasAcademia = new ArrayList<>();

		pessoasAcademia.add(instrutor);
		pessoasAcademia.add(mentor);
		pessoasAcademia.add(instrutoPilates);
		pessoasAcademia.add(aluno);
		pessoasAcademia.add(instrutorMusculacao);
		pessoasAcademia.add(alunoVip);

		for (Pessoa p : pessoasAcademia) {
			System.out.println(p.getResumo());
		}

	}
}
