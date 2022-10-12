
public class ARSDecorator extends Decorator{

	public ARSDecorator(Producto producto) {
		super(producto);
	}

	@Override
	public String getLineDescription() {
		return "$ARS";
	}


}
