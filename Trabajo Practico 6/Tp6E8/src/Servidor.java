import java.util.LinkedList;

public class Servidor {

	private LinkedList<PaqueteDato> colaPaquetes = new LinkedList<PaqueteDato>();
	
	public synchronized void almacenar(PaqueteDato unPaquete) {
		while (colaPaquetes.size() >= 3) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (unPaquete != null) {
			System.out.println("ALMACENO " + unPaquete.toString());
		}
		colaPaquetes.add(unPaquete);
		notifyAll();
	}
	
	public synchronized PaqueteDato consultar() {
		while (colaPaquetes.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		PaqueteDato paquete = colaPaquetes.removeFirst();
		if (paquete != null) {
			System.out.println("CONSULTO " + paquete.toString());
		}
		return paquete;
	}
	
	public LinkedList<PaqueteDato> getCola(){
		return colaPaquetes;
	}
	
}
