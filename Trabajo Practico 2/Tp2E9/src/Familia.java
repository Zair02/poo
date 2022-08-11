import java.util.ArrayList;

public class Familia {
	private ArrayList<Persona> miembros = new ArrayList<Persona>();
	private Boolean censada;
	
	public Familia(Boolean censada) {
		this.censada = censada;
	}
	
	public Familia() {
		
	}

	public void añadirMiembro(Persona persona) {
		this.miembros.add(persona);
	}
	
	public Integer persTrabajando() {
		Integer cant = 0;
		for (Persona persona : miembros) {
			if(persona.getTrabaja()) {
				cant++;
			}
		}
		return cant;
	}

	public Boolean getCensada() {
		return censada;
	}
	
	public void setCensada(Boolean censada) {
		this.censada = censada;
	}
	
	public ArrayList<Persona> getMiembros(){
		return miembros;
	}
	
}
