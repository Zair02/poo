
public class EnvioException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public EnvioException() {
		super("Hubo una falla en la comunicación, se perdió el paquete");
	}

}
