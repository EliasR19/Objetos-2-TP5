package mercadoCentral;

public class Impuesto extends Factura{

	
	public Impuesto(double monto, Agencia agencia) {
		super(monto, agencia);
	}

	@Override
	public double getPrecio() {
		return getMonto();
	}


}
