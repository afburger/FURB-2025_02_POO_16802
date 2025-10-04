package provas.prova01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Prova01Test {

    private static Empresa empresa1;
	private static Empresa empresa2;
    private static Funcionario func1;
	private static Funcionario func2;
	private static Funcionario func3;
	private static Funcionario func4;
	private static Funcionario func5;
	private static Funcionario func6;
    private static Endereco endereco1;
	private static Endereco endereco2;
    private static Sistema sistema;

    @BeforeAll
    static void inicializar() {
        criarEmpresa1();
		criarEmpresa2();

        sistema = new Sistema();
        sistema.adicionarEmpresa(empresa1);
	    sistema.adicionarEmpresa(empresa2);
    }

	private static void criarEmpresa1() {
		endereco1 = new Endereco();
		endereco1.setCidade("Cidade");
		endereco1.setRua("Rua Teste");
		endereco1.setNumero(123);

		empresa1 = new Empresa("Empresa Teste", "11.111.111/0001-11");
		empresa1.setEndereco(endereco1);

		func1 = new Funcionario("Funcionario 1", "111.111.111-11", 1000.0);
		func2 = new Funcionario("Funcionario 2", "222.222.222-22", 2000.0);
		func3 = new Funcionario("Funcionario 3", "333.333.333-33", 3000.0);

		empresa1.adicionarFuncionario(func1);
		empresa1.adicionarFuncionario(func2);
		empresa1.adicionarFuncionario(func3);
	}

	private static void criarEmpresa2() {
		endereco2 = new Endereco();
		endereco2.setCidade("Cidade Dois");
		endereco2.setRua("Rua Teste Dois");
		endereco2.setNumero(987);

		empresa2 = new Empresa("Empresa Teste", "22.222.222/0002-22");
		empresa2.setEndereco(endereco2);

		func4 = new Funcionario("Funcionario 4", "444.444.444-44", 1000.0);
		func5 = new Funcionario("Funcionario 5", "555.555.555-55", 2000.0);
		func6 = new Funcionario("Funcionario 6", "666.666.666-66", 3000.0);

		empresa2.adicionarFuncionario(func4);
		empresa2.adicionarFuncionario(func5);
		empresa2.adicionarFuncionario(func6);
	}

	@Test
    @Order(1)
    void testFuncionario() {
        assertEquals("Funcionario 1", func1.getNome());
        assertEquals("111.111.111-11", func1.getCpf());
        assertEquals(1000.0, func1.getSalario());
		func1.aplicaAumento(10);
		assertEquals(1100.0, func1.getSalario(), 0.01);
    }

    @Test
    @Order(2)
    void testAplicaAumento() {
        empresa2.aplicarAumento(10);
		assertEquals(6600.0, empresa2.calcularFolhaSalarial(), 0.01);
    }

	@Test
	@Order(3)
	void testPesquisaFuncionario() {
		assertNotNull(empresa1.pesquisarFuncionario("111.111.111-11"));
		assertEquals(func1, empresa1.pesquisarFuncionario("111.111.111-11"));
	}

	@Test
	@Order(4)
	void testGeraRelatorioCompletoUm() {
		sistema.gerarRelatorioCompleto();
	}

	@Test
	@Order(5)
	void testRemocaoFuncionario() {
		Funcionario funcionario = empresa1.pesquisarFuncionario("111.111.111-11");
		assertNotNull(funcionario);
		empresa1.removerFuncionario(funcionario);
		assertNull(empresa1.pesquisarFuncionario("111.111.111-11"));
	}

	@Test
	@Order(6)
	void testFuncionarioCPFInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Funcionario("Nome", "", 1000));
	}

	@Test
	@Order(7)
	void testFuncionarioSalarioInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Funcionario("Nome", "999.999.999-99", -1500));
	}

	@Test
	@Order(8)
	void testEmpresaInvalida() {
		assertThrows(IllegalArgumentException.class, () -> new Empresa("Empresa X", null));
	}

	@Test
	@Order(9)
	void testGeraRelatorioCompletoDois() {
		sistema.gerarRelatorioCompleto();
	}

	/*
	 * Testes complementares
	 */
    @Test
    @Order(10)
    void testEndereco() {
        assertEquals("Rua: Rua Teste número: 123 Cidade: Cidade", endereco1.exibirDados());
    }

    @Test
    @Order(11)
    void testEmpresa() {
        assertEquals("Empresa Teste", empresa1.getNome());
        assertEquals("11.111.111/0001-11", empresa1.getCnpj());
        assertEquals(endereco1, empresa1.getEndereco());
		assertNotNull(empresa1.exibirDados());
		assertNotEquals("", empresa1.exibirDados());
    }

	@Test
	@Order(12)
	void testCalculaFolhaSalarial() {
		Funcionario func3 = new Funcionario("Funcionario 7", "777.777.777-77", 3000.0);
		empresa2.adicionarFuncionario(func3);
		Funcionario funcionario = empresa2.pesquisarFuncionario("777.777.777-77");
		assertEquals(9600.0, empresa2.calcularFolhaSalarial(), 0.01);
		empresa2.removerFuncionario(funcionario);
		assertEquals(6600.0, empresa2.calcularFolhaSalarial(), 0.01);

	}

    @Test
    @Order(13)
    void testAdicionaEBuscaFuncionario() {
        Funcionario func8 = new Funcionario("Funcionario 8", "888.888.888-88", 4000.0);
        empresa1.adicionarFuncionario(func8);
        assertNotNull(empresa1.pesquisarFuncionario("888.888.888-88"));
        assertEquals(func8, empresa1.pesquisarFuncionario("888.888.888-88"));
	    assertNotNull(func8.exibirDados());
	    assertNotEquals("", func8.exibirDados());
    }

    @Test
    @Order(14)
    void testBuscaFuncionarioInexistente() {
        assertNull(empresa1.pesquisarFuncionario("999.999.999-99"));
    }

    @Test
    @Order(15)
    void testSistemaAdicionaEBuscaEmpresa() {
        Endereco endereco3 = new Endereco();
	    endereco3.setRua("Rua Nova");
	    endereco3.setCidade("Outra Cidade");
	    endereco3.setNumero(456);

        Empresa empresa3 = new Empresa("Outra Empresa", "33.333.333/0001-33");
	    empresa3.setEndereco(endereco3);
		sistema.adicionarEmpresa(empresa3);
        assertNotNull(sistema.pesquisarEmpresa("33.333.333/0001-33"));
        assertEquals(empresa3, sistema.pesquisarEmpresa("33.333.333/0001-33"));
    }
    
    @Test
    @Order(16)
    void testSistemaBuscaEmpresaInexistente() {
    	assertNull(sistema.pesquisarEmpresa("99.999.999/0001-99"));
    }

    @Test
    @Order(17)
    void testSistemaRemoveEmpresa() {
        assertNotNull(sistema.pesquisarEmpresa("22.222.222/0002-22"));
        sistema.removerEmpresa(sistema.pesquisarEmpresa("22.222.222/0002-22"));
        assertNull(sistema.pesquisarEmpresa("22.222.222/0002-22"));
    }

}
