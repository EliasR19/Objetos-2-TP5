package mercadoCentral;

public class ProductoEmpresaTradicional extends Producto{

	public ProductoEmpresaTradicional(String name, double precio, int stock) {
		super(name, precio, stock);
	}
	
	
	@Override
	public int iva() {
		return 0;
	}
}