
public class TortaVainillaBuilder implements Builder{

	private Torta torta;
	
	public TortaVainillaBuilder() {
		torta = new Torta();
	}
	
	@Override
	public void buildMasa() {
		torta.setMasa("Vainilla");
	}

	@Override
	public void buildRelleno() {
		torta.setRelleno("Crema");
	}

	@Override
	public Torta getTorta() {
		return torta;
	}
	
}
