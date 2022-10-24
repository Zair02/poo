import java.util.Random;

public class IngEnObra extends IngenieroCivil{
	
	private Random rand = new Random();

	public IngEnObra(Servidor servidor, String nombre) {
		super(servidor, nombre);
	}
	
	public PaqueteDatos medir() {
		return new PaqueteDatos(rand.nextDouble(90.0), rand.nextDouble(180.0));
	}

	public void enviarMedicion(PaqueteDatos dato) throws FallaInternetException {
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (rand.nextDouble() < 0.4) {
			throw new FallaInternetException(getNombre());
		} else {
			getServidor().agregarDato(dato);
		}
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				this.enviarMedicion(this.medir());
			} catch (FallaInternetException e) {
				System.out.println(e.getMessage());
			}
		}
		this.getServidor().agregarDato(null);
	}
	
}
