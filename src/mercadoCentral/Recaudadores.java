package mercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class Recaudadores implements Agencia{

	List<Factura> recaudado = new ArrayList<Factura>();
	
	@Override
	public void registrarPago(Factura factura) {
		recaudado.add(factura);
	}
	
	@Override
	public List<Factura> getRecaudado(){
		return recaudado;
	}

		
}
