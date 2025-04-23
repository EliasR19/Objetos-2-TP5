package mercadoCentral;

public class Servicio extends Factura{
	
	private int cantUnidades;
	
	public Servicio(double monto,Agencia agencia, int cantUnidades) {
		super(monto, agencia);
		this.cantUnidades = cantUnidades;
	}

	@Override
	public double getPrecio() {
		return this.getMonto() * cantUnidades;
		
	}
	
}
