package mercadoCentral;

public class ProductoCooperativa extends Producto{

	public ProductoCooperativa(String name, double precio, int stock) {
		super(name, precio, stock);
	}


	@Override
	public int iva() {
		return 10;
	}


	
}
