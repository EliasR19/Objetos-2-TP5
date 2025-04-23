package mercadoCentral;

public abstract class Factura implements Cobrable{
	
	
	private double monto;
	private Agencia agencia;
	
	public Factura (double monto,Agencia agencia) {
		this.monto = monto;
		this.agencia = agencia;
	}
	
	@Override
	public double cobrar() {
		this.notificarAgencia(agencia);
		return this.getPrecio();
	}
	
	
	protected abstract double getPrecio();


	public void notificarAgencia(Agencia a) {
		a.registrarPago(this);
	}
	
	public double getMonto() {
		return monto;
	}
	
}	

