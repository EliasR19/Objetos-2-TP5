import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;

import mercadoCentral.*;


public class CajaCobrableTest {
	
	@Nested
	class RegistrarDiferentesCosasTest{
		
		Caja c = new Caja(1);
		Agencia agen = new Recaudadores();
		
		Cobrable p1 = new ProductoCooperativa("Leche", 1200d, 100);
		Cobrable p2 = new ProductoEmpresaTradicional("Agua", 500d, 56);
		
		Cobrable servicio = new Servicio(3800d, agen, 3);
		Cobrable impuesto =  new Impuesto(300d, agen);
		
		@BeforeEach
		public void setUp() {
			
			c.registrarProducto(p1);
			c.registrarProducto(p2);
			c.registrarProducto(servicio);
			c.registrarProducto(impuesto);
			
		}
		
		@Test
		public void cajaCosasRegistro() {
			assertEquals(4, c.getComptaClientes().size());
		}
		
		
		@Test
		public void cajaMontoTotalTest() {
			assertEquals(13280d, c.montoTotalPagar(), 0.1d);
		}
		
		@Test
		public void agenciaRegistroTest() {
			assertEquals(2, agen.getRecaudado().size());
		}
		
	}
	
	@Nested
	class PreciosTest{
		
		Caja c = new Caja(1);
		Agencia agen = new Recaudadores();

		
		Cobrable servicio = new Servicio(3800d, agen, 3);
		Cobrable impuesto =  new Impuesto(300d, agen);
		
		@BeforeEach
		public void setUp() {
			c.registrarProducto(servicio);
			c.registrarProducto(impuesto);
			
		}
		
		@Test
		public void servicioPrecioTest() {
			assertEquals(11400, servicio.getPrecio(), 0.1);
		}
		
		@Test
		public void ImpuestoPrecioTest() {
			assertEquals(300, impuesto.getPrecio(), 0.1);
		}
	}
	
}

