package mercadoCentral;

public class main {

	public static void main(String[] args) {
		Caja c = new Caja(1);
		Agencia recaudador = new Recaudadores();
		
		ProductoCooperativa p1 = new ProductoCooperativa("Leche", 100, 3);
		ProductoEmpresaTradicional p2 = new ProductoEmpresaTradicional("Leche", 100, 3);
		
		Cobrable luz = new Servicio(1000, recaudador, 3);
		
		System.out.println(p1.getStock());
		
		c.registrarProducto(p1);
		c.registrarProducto(p2);
		
		
		c.registrarProducto(luz);
		
		System.out.println(p1.getStock());

		
		System.out.println(recaudador.getRecaudado());
		System.out.println(c.montoTotalPagar());
	}

}
