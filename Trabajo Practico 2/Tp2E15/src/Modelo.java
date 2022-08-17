import java.security.SecureRandom;

public class Modelo {
	private static String caracteres = 
		"0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	private String contraseña;

	public String getContraseña() {
		return contraseña;
	}
	
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public void generarContraseña() {
		SecureRandom secureRandom = new SecureRandom();
		StringBuilder stringBuilder = new StringBuilder(32);
		for (int i = 0; i < 32; i++) {
			stringBuilder.append(caracteres.charAt(secureRandom.nextInt(caracteres.length())));
			this.contraseña = stringBuilder.toString();
		}
	}
	
	public void borrarContenido() {
		this.contraseña = "";
	}

}
