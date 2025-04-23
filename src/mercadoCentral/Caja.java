package mercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	int numCaja;
	private List<Cobrable> productosCliente = new ArrayList<Cobrable>();
	private double totalPagar = 0;
	
	public Caja(int numCaja) {
		this.numCaja = numCaja;
	}
	
	public void registrarProducto(Cobrable c) {
		productosCliente.add(c);
		totalPagar = totalPagar + c.cobrar();
	}
	
	public double montoTotalPagar() {
		return productosCliente.stream().mapToDouble(Cobrable::cobrar).reduce(0.0, (p1,p2) -> p1+p2);
	}
}
