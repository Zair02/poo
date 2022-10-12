
public class Cuenta {

	private Integer edadUsuario;
	private String nombre;
	
	public Cuenta(Integer edad, String nombre) {
		this.edadUsuario = edad;
		this.nombre = nombre;
	}
	
	public Integer getEdad() {
		return edadUsuario;
	}
}
