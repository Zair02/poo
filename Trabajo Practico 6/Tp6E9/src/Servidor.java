import java.util.LinkedList;

public class Servidor {

	private LinkedList<PaqueteDatos> buffer = new LinkedList<PaqueteDatos>();
	
	public synchronized void agregarDato(PaqueteDatos paquete) {
		while (buffer.size() > 3) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (paquete != null) {
			System.out.println("AGREGAR DATO: " + paquete.toString());
		}
		buffer.add(paquete);
		notifyAll();
	}
	
	public synchronized PaqueteDatos obtenerDato() {
		while (buffer.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		PaqueteDatos paquete = buffer.removeFirst();
		if (paquete != null) {
			System.out.println("OBTENER DATO: " + paquete.toString());
		}
		notifyAll();
		return paquete;
	}
	
}
