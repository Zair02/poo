
public class Contador {

	private Integer cont = 0;
	
	public synchronized void incrementar() {
		cont++;
	}
	
	public Integer getValor() {
		return cont;
	}
}
