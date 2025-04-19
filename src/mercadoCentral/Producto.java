package mercadoCentral;

public abstract class Producto {
	private double precio;
	private int stock;
	private String name;
	
	public Producto(String name, double precio, int stock ) {
		this.name = name;
		this.precio = precio;
		this.stock = stock;
	}
	
	public void registrar() {
		this.sacarStock();
	}

	public void sacarStock() {
		stock = stock--;
	}

	public double getPrecio() {
		return precio - (precio * this.iva()) / 100;
	}
	
	public abstract int iva();
	
	public int getStock() {
		return stock;
	}
	

		
}
