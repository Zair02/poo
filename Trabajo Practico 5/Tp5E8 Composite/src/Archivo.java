
public class Archivo implements CompositeAdmArchivos{

	private String nombre;
	
	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public Boolean esCarpeta() {
		return false;
	}

	@Override
	public void mostrarElementos() {
		System.out.println("- " + nombre);
	}

}
