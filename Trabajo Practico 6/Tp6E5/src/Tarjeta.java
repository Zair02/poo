
public class Tarjeta extends Thread {
	
	private Integer nroId;
	private Cuenta cuenta;

	public Tarjeta(Integer nroId, Cuenta cuenta) {
		this.nroId = nroId;
		this.cuenta = cuenta;
	}
	
	@Override
	public void run() {
		cuenta.descontar(100.0, nroId);
		cuenta.descontar(100.0, nroId);
	}
	
}
