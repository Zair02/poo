
public class FallaInternetException extends Exception {

	private static final long serialVersionUID = 1L;

	public FallaInternetException(String nombre) {
		super("Error: (" + nombre + ") No hay conexion a internet, no se envio el paquete!");
	}

	
	
}
