import java.util.ArrayList;

public class Familia {
	private ArrayList<Persona> miembros = new ArrayList<Persona>();
	private static Integer censadas = 0;
	
	public Familia() {
		censadas++;
	}

	public void añadirMiembro(Persona persona) {
		this.miembros.add(persona);
	}

	public static Integer getCensadas() {
		return censadas;
	}
	
}
