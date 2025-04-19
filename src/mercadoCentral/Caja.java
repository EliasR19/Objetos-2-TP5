package mercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	int numCaja;
	private List<Producto> productosCliente = new ArrayList<Producto>();
	private double totalPagar = 0;
	
	public Caja(int numCaja) {
		this.numCaja = numCaja;
	}
	
	public void registrarProducto(Producto p) {
		productosCliente.add(p);
		p.registrar();
		totalPagar = totalPagar + p.getPrecio();
	}
	
	public double montoTotalPagar() {
		return productosCliente.stream().mapToDouble(Producto::getPrecio).reduce(0.0, (p1,p2) -> p1+p2);
	}
}
