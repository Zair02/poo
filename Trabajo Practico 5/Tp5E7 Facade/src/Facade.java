
public class Facade {

	private Helper1 h1 = new Helper1();
	private Helper2 h2 = new Helper2();
	
	public String traducir(String palabra) {
		return h1.traducir(palabra);
	}
	
	public String aMayuscula(String string) {
		return h2.aMayuscula(string);
	}
	
	public String aMinuscula(String string) {
		return h2.aMinuscula(string);
	}

}
