
public class TortaCocoBuilder implements Builder{

	private Torta torta;
	
	public TortaCocoBuilder() {
		torta = new Torta();
	}
	
	@Override
	public void buildMasa() {
		torta.setMasa("Coco");
	}

	@Override
	public void buildRelleno() {
		torta.setRelleno("Dulce de leche");
	}

	@Override
	public Torta getTorta() {
		return torta;
	}
	
}
