package provas.prova01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Prova01PrincipalTest {

	/**
	 * Vale 0,25
	 */
	@Test
	@Order(1)
	void testClasseSistema() {
		Sistema sis = new Sistema();
		sis.gerarRelatorioCompleto();
	}

	/**
	 * Vale 0,75
	 */
	@Test
	@Order(2)
	void testClasseFuncionario() {
		Funcionario funcionario = new Funcionario("Nome", "CPF", 1000.00);
		assertNotNull(funcionario.getNome());
		assertNotNull(funcionario.getCpf());
		funcionario.aplicaAumento(10.0);
		assertEquals(1100.00, funcionario.getSalario(), 0.01);
		funcionario.exibirDados();
	}

	/**
	 * Vale 0,25
	 */
	@Test
	@Order(3)
	void testClasseEndereco() {
		Endereco end = new Endereco();
		end.setRua("Antônio da Veiga");
		end.setCidade("Blumenau");
		end.setNumero(140);
	}

	/**
	 * Vale 0,75
	 */
	@Test
	@Order(4)
	void testClasseEmpresa() {
		Empresa emp = new Empresa("Nome", "CNPJ");
		emp.calcularFolhaSalarial();
		emp.aplicarAumento(10.0);
		Funcionario funcionario = new Funcionario("Nome", "CPF", 1000.00);
		emp.adicionarFuncionario(funcionario);
		emp.removerFuncionario(funcionario);
		assertNotNull(emp.getFuncionarios());

		Endereco end = new Endereco();
		end.setRua("Antônio da Veiga");
		end.setCidade("Blumenau");
		end.setNumero(140);

		emp.setEndereco(end);
		emp.exibirDados();
	}

	/**
	 * Vale 0,5
	 */
	@Test
	@Order(5)
	void testMetodosObrigatorios() {
		Empresa emp = new Empresa("Nome", "CNPJ");
		emp.calcularFolhaSalarial();
		emp.aplicarAumento(10.0);

		Funcionario func = new Funcionario("Nome", "CPF", 1200.0);
		func.aplicaAumento(10.0);

		Sistema sis = new Sistema();
		sis.gerarRelatorioCompleto();
	}

	/**
	 * Vale 0,5
	 */
	@Test
	@Order(6)
	void testValidacoesObrigatorias() {
		assertThrows(IllegalArgumentException.class, () -> new Funcionario("Nome", null, 1000.00));
		assertThrows(IllegalArgumentException.class, () -> new Funcionario("Nome", "CPF", -500.00));

		assertThrows(IllegalArgumentException.class, () -> new Empresa("Nome", null));
	}

}