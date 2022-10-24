import java.util.ArrayList;

public class Equipo {

	private ArrayList<Corredor> corredores = new ArrayList<Corredor>();
	private Integer tiempoEquipo = 0;
	
	public Equipo(Integer tamaño) {
		for (int i = 0; i < tamaño; i++) {
			Corredor c = new Corredor();
			c.setName("Corredor" + i);
			corredores.add(c);
		}
	}
	
	public void correr() {
		for (Corredor c : corredores) {
			c.start();
			try {
				c.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			tiempoEquipo += c.getTiempo();
		}
		System.out.println("Tiempo Total: " + tiempoEquipo + " segundos");
	}
}
