import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(2000.0);
		ArrayList<Tarjeta> tarjetas = new ArrayList<Tarjeta>();

		for (int i = 0; i < 10; i++) {
			Tarjeta t = new Tarjeta(i, cuenta);
			t.start();
			tarjetas.add(t);
		}
		
		for (Tarjeta t : tarjetas) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Saldo final: " + cuenta.getSaldo());
		
	}
	
}
