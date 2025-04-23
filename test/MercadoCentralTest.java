
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;

import mercadoCentral.*;

public class MercadoCentralTest {
	
	@Nested
	class ProductoCooperativaTest{

		Caja c = new Caja(1);
		ProductoCooperativa p1 = new ProductoCooperativa("Leche", 100, 3);

		@BeforeEach
		public void setUp() {
			
			c.registrarProducto(p1);
	
		}
		
		@Test
		public void montoTotalCooperativaTest() {
			assertEquals(90, c.montoTotalPagar(), 0.1);
		}
		public void stockProductoTest() {
			assertEquals(2, p1.getStock());
		}
	}
	
	@Nested
	class VariosProductosTest{
		Caja c = new Caja(1);
		ProductoCooperativa p1 = new ProductoCooperativa("Leche", 100, 3);
		ProductoEmpresaTradicional p2 = new ProductoEmpresaTradicional("Arroz", 150, 3);

		@BeforeEach
		public void setUp() {
			
			c.registrarProducto(p1);
			c.registrarProducto(p2);
	
		}
		
		@Test
		public void montoTotalCooperativaTest() {
			assertEquals(240, c.montoTotalPagar(), 0.1);
		}

	}
	
	
}
