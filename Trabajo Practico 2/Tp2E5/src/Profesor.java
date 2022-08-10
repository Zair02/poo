import java.util.ArrayList;

public class Profesor {
	private String nombre;
	private String apellido;
	private ArrayList<Materia> materias;
	
	public Profesor(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.materias = new ArrayList<Materia>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public ArrayList<Materia> getMaterias(){
		return materias;
	}
	
	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}
	
	public void añadirMateria(Materia materias) {
		this.materias.add(materias);
	}
	
}
