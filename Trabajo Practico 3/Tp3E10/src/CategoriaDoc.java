
public enum CategoriaDoc {
	SIMPLE(10), EXCLUSIVA(40), SEMIEXCLUSIVA(20);
	
	private final Integer hsMinimas;
	
	CategoriaDoc(Integer hsMinimas) {
		this.hsMinimas = hsMinimas;
	}

	public Integer getHsMinimas() {
		return hsMinimas;
	}
}
