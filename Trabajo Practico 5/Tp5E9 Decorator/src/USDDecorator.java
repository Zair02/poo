
public class USDDecorator extends Decorator{

	public USDDecorator(Producto producto) {
		super(producto);
	}

	@Override
	public String getLineDescription() {
		return "$USD";
	}

}
