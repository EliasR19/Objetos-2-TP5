package mercadoCentral;

import java.util.List;

public interface Agencia {
	
	public void registrarPago(Factura factura);
	public List<Factura> getRecaudado();
}
