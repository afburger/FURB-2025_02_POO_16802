package provas.prova02;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestServicoTransporte {

	@Test
	@Order(1)
	public void testUm() {
		Transporte t1 = new TransporteBicicleta();
		assertEquals(36, t1.calcularTempoEstimado(12));
	}

	@Test
	@Order(1)
	public void testDois() {
		Transporte t1 = new TransporteTaxi();
		assertEquals(7, t1.calcularTarifa(2));
	}

	@Test
	@Order(1)
	public void testTres() {
		Transporte t1 = new TransporteMetro();
		assertEquals(15, t1.calcularTempoEstimado(15));
	}
}
