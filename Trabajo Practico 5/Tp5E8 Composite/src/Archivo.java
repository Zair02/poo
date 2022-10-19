
public class Archivo implements CompositeAdmArchivos{

	private String nombre;
	private Integer nivel = 0;
	
	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public Boolean esCarpeta() {
		return false;
	}

	@Override
	public void getInfo() {
		for (int i = 0; i < nivel; i++) {
			System.out.print("\t");
		}
		System.out.println("-" + nombre);
	}

	@Override
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

}
