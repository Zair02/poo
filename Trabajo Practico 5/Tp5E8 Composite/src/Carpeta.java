import java.util.ArrayList;

public class Carpeta implements CompositeAdmArchivos{

	private ArrayList<CompositeAdmArchivos> elementos = new ArrayList<CompositeAdmArchivos>();
	private String nombre;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Boolean esCarpeta() {
		return true;
	}
	
	@Override
	public void mostrarElementos() {
		System.out.println(nombre);
		for (CompositeAdmArchivos elemento : elementos) {
			System.out.print("- ");
			elemento.mostrarElementos();
		}
	}
	
	public void añadirElemento(CompositeAdmArchivos elemento) {
		elementos.add(elemento);
	}
	
	public void removerElemento(CompositeAdmArchivos elemento) {
		elementos.remove(elemento);
	}
	
}
