
public class HiloIncremento extends Thread{

	private Contador contador;
	
	public HiloIncremento(Contador contador) {
		this.contador = contador;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			contador.incrementar();
		}
		System.out.println(this.getName() + ": " + contador.getValor());
	}
	
}
