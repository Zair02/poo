
public enum TipoJornada {
	COMPLETA(30), REDUCIDA(20);
	
	private final Integer hsMinimas;
	
	TipoJornada(Integer hsMinimas) {
		this.hsMinimas = hsMinimas;
	}

	public Integer getHsMinimas() {
		return hsMinimas;
	}
	
}
