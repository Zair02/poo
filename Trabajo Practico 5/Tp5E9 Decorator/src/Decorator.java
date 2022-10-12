
public abstract class Decorator implements Producto{

	protected Producto producto;
	
	public Decorator(Producto producto) {
		this.producto = producto;
	}
	
	public abstract String getLineDescription();
	
	@Override
	public String getPrecio() {
		return getLineDescription() + " " + producto.getPrecio();
	}
	
}
