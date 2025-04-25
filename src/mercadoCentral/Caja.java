package mercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	int numCaja;
	private List<Cobrable> comprasCliente = new ArrayList<Cobrable>();
	private double totalPagar = 0;
	
	public Caja(int numCaja) {
		this.numCaja = numCaja;
	}
	
	public void registrarProducto(Cobrable c) { // registrable en caja
		comprasCliente.add(c);
		//totalPagar = totalPagar + c.cobrar();
		c.registrar();
	}
	
	public double montoTotalPagar() {
		return comprasCliente.stream().mapToDouble(Cobrable::getPrecio).reduce(0.0, (p1,p2) -> p1+p2);
	}
}
