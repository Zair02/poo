
public class Cuenta {

	private Double saldo;
	
	public Cuenta(Double saldo) {
		this.saldo = saldo;
	}
	
	public synchronized void descontar(Double monto, Integer idTarjeta) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		saldo = saldo - monto;
		System.out.println("Nuevo gasto - Tarjeta: " + idTarjeta + " - Monto: " + monto);
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
}
