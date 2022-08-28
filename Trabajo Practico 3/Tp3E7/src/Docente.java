
public class Docente extends Persona {

	private String materia;

	public Docente(String nombre, String apellido, String materia) {
		super(nombre, apellido);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public String materia() {
		return "El docente dicta la siguiente clase " + this.materia + "\n";
	}
	
	public String materia(String materia) {
		if(materia.equals(this.materia)) {
			return "El docente dicta la materia " + materia + "\n";
		} else {
			return "El docente no dicta la materia " + materia + "\n";
		}
	}
}
