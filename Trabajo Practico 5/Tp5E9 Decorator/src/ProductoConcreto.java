
public class ProductoConcreto implements Producto{

	private Double precio;
	
	public ProductoConcreto(Double precio) {
		this.precio = precio;
	}
	
	public String getPrecio() {
		return String.format("%.2f", precio);
	}
	
}
