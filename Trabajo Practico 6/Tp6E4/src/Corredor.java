import java.util.Random;

public class Corredor extends Thread {
	
	private Integer tiempo = 0;

	@Override
	public void run() {
		System.out.println("Inicia " + currentThread().getName());
		tiempo = new Random().nextInt(5, 10) + 1;
		try {
			sleep(1000 * tiempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Tiempo: " + tiempo + " segundos");
	}
	
	public Integer getTiempo() {
		return tiempo;
	}
}
