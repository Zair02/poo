
public interface Agrimensor {
	
	public PaqueteDatos medir();
	public void enviarMedicion(PaqueteDatos dato) throws FallaInternetException;
	
}
