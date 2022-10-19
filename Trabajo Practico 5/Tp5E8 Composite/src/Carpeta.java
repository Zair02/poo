import java.util.ArrayList;

public class Carpeta implements CompositeAdmArchivos{

	private ArrayList<CompositeAdmArchivos> elementos = new ArrayList<CompositeAdmArchivos>();
	private String nombre;
	private Integer nivel = 0;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Boolean esCarpeta() {
		return true;
	}
	
	public void getInfo() {
		for (int i = 0; i < nivel; i++) {
			System.out.print("\t");
		}
		System.out.println("+" + nombre);
		mostrarContenido();
	}
	
	public void mostrarContenido() {
		for (CompositeAdmArchivos elemento : elementos) {
			elemento.getInfo();
		}
	}
	
	public void añadirElemento(CompositeAdmArchivos elemento) {
		elemento.setNivel(nivel+1);
		elementos.add(elemento);
	}
	
	public void removerElemento(CompositeAdmArchivos elemento) {
		elementos.remove(elemento);
	}
	
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
}
