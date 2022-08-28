import java.util.ArrayList;

public class Alumno extends Persona {
	
	ArrayList<String> materias = new ArrayList<String>();

	public Alumno(String nombre, String apellido) {
		super(nombre, apellido);
	}

	public ArrayList<String> getMaterias() {
		return materias;
	}

	public void setMaterias(ArrayList<String> materias) {
		this.materias = materias;
	}
	
	public void agregarMateria(String materia) {
		this.materias.add(materia);
	}
	
	public String materia() {
		String msg = "El alumno se encuentra cursando las siguientes materias\n";
		for(String materia : materias) {
			msg = msg + materia + "\n";
		}
		return msg;
	}
	
	public String materia(String materia) {
		Boolean cursa = false;
		for (String string : materias) {
			if(materia.equals(string)) {
				cursa = true;
			}
		}
		if(cursa) {
			return "El alumno cursa la materia " + materia + "\n";
		} else {
			return "El alumno no cursa la materia " + materia + "\n";
		}
	}

}
