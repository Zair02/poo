import java.util.Random;

public class Boya extends Thread{

	public String nombre;
	public Servidor servidor;
	public Termometro termometro = new Termometro();
	public Anemometro anemometro = new Anemometro();
	
	public Boya(String nombre, Servidor servidor) {
		this.nombre = nombre;
		this.servidor = servidor;
	}
	
	private void enviar(PaqueteDato paquete) throws EnvioException{
		try {
			Thread.sleep(5000);
			if (new Random().nextDouble() > 0.4) {
				this.servidor.almacenar(paquete);
			} else {
				throw new EnvioException();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
	private PaqueteDato generarPaquete() {
		return new PaqueteDato(this.nombre, this.termometro.sensar(), this.anemometro.sensar());
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				this.enviar(this.generarPaquete());
			} catch (EnvioException e) {
				System.out.println("Error: " + this.nombre + " " + e.getMessage());
			}
		}
		this.enviarNulo();
	}

	private void enviarNulo() {
		this.servidor.almacenar(null);
	}
	
	
}
