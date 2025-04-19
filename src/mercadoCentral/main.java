package mercadoCentral;

public class main {

	public static void main(String[] args) {
		Caja c = new Caja(1);
		
		ProductoCooperativa p1 = new ProductoCooperativa("Leche", 100, 3);
		ProductoEmpresaTradicional p2 = new ProductoEmpresaTradicional("Leche", 100, 3);
		
		c.registrarProducto(p1);
		c.registrarProducto(p2);
		System.out.println(c.montoTotalPagar());
	}

}
